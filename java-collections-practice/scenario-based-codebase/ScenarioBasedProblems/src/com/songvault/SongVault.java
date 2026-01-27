package com.songvault;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.function.*;

public class SongVault {

	private List<Song> songs = new ArrayList<Song>();
	private Set<String> uniqueArtists = new HashSet<String>();
	private Map<String, List<Song>> genreMap = new HashMap<String, List<Song>>();

	// Read song files from folder (I/O Streams)
	public void readSongs(String folderPath) throws IOException {

		File folder = new File(folderPath);
		if (!folder.exists() || !folder.isDirectory()) {
			System.out.println("Invalid folder path.");
			return;
		}

		File[] files = folder.listFiles();
		if (files == null)
			return;

		Pattern titlePattern = Pattern.compile("^Title:\\s*(.*)$");
		Pattern artistPattern = Pattern.compile("^Artist:\\s*(.*)$");
		Pattern durationPattern = Pattern.compile("^Duration:\\s*(.*)$");
		Pattern genrePattern = Pattern.compile("^Genre:\\s*(.*)$");

		for (int i = 0; i < files.length; i++) {

			File file = files[i];
			if (!file.getName().endsWith(".txt"))
				continue;

			BufferedReader br = new BufferedReader(new FileReader(file));

			String title = "", artist = "", duration = "", genre = "";
			String line;

			while ((line = br.readLine()) != null) {

				Matcher m = titlePattern.matcher(line);
				if (m.find())
					title = m.group(1).trim();

				m = artistPattern.matcher(line);
				if (m.find())
					artist = m.group(1).trim();

				m = durationPattern.matcher(line);
				if (m.find())
					duration = m.group(1).trim();

				m = genrePattern.matcher(line);
				if (m.find())
					genre = m.group(1).trim();
			}
			br.close();

			if (!title.equals("") && !artist.equals("") && !duration.equals("") && !genre.equals("")) {

				Song song = new Song(title, artist, duration, genre);
				songs.add(song);
				uniqueArtists.add(artist);

				if (!genreMap.containsKey(genre)) {
					genreMap.put(genre, new ArrayList<Song>());
				}
				genreMap.get(genre).add(song);
			}
		}
	}

	public List<Song> getSongs() {
		return songs;
	}

	public Set<String> getUniqueArtists() {
		return uniqueArtists;
	}

	public Map<String, List<Song>> getGenreMap() {
		return genreMap;
	}

	// Filter songs by genre USING STREAMS
	public List<Song> filterByGenre(String genre) {

		return songs.stream().filter(new Predicate<Song>() {
			@Override
			public boolean test(Song song) {
				return song.getGenre().equalsIgnoreCase(genre);
			}
		}).collect(Collectors.toList());
	}

	// Sort songs by title USING STREAMS
	public void sortSongsByTitle(List<Song> songList) {

		List<Song> sortedList = songList.stream().sorted(new Comparator<Song>() {
			@Override
			public int compare(Song s1, Song s2) {
				return s1.getTitle().compareToIgnoreCase(s2.getTitle());
			}
		}).collect(Collectors.toList());

		songList.clear();
		songList.addAll(sortedList);
	}
}
