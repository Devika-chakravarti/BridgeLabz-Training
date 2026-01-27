/*SongVault – Personal Music Library Manager
Story: Nina is a music enthusiast who collects .txt files, each representing a song in the
format:
Title: Bohemian Rhapsody
Artist: Queen
Duration: 5:55
Genre: Rock
With hundreds of such files, she wants to create SongVault, a desktop app that:
● Reads song files using I/O Streams
● Extracts fields using Regex
● Stores songs in a List<Song> and groups them by genre using Map<String,
List<Song>>
● Uses Set<String> to list unique artists
● Allows filtering and sorting using Java Streams
● Supports Generics for different types of media: audio, video, podcast*/

package com.songvault;

import java.util.*;
import java.io.*;

public class SongVaultMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SongVault vault = new SongVault();

		System.out.print("Enter folder path containing song files: ");
		String folderPath = input.nextLine();

		try {
			vault.readSongs(folderPath);
		} catch (IOException e) {
			System.out.println("Error reading files: " + e.getMessage());
			return;
		}

		// Display unique artists
		System.out.println("\nUnique Artists:");
		for (Iterator<String> it = vault.getUniqueArtists().iterator(); it.hasNext();) {
			System.out.println(it.next());
		}

		// Display all songs
		System.out.println("\nAll Songs:");
		List<Song> allSongs = vault.getSongs();
		vault.sortSongsByTitle(allSongs);
		for (int i = 0; i < allSongs.size(); i++) {
			System.out.println(allSongs.get(i));
		}

		// Filter by genre
		System.out.print("\nEnter genre to filter: ");
		String genre = input.nextLine();
		List<Song> genreSongs = vault.filterByGenre(genre);

		if (genreSongs.size() > 0) {
			vault.sortSongsByTitle(genreSongs);
			System.out.println("\nSongs in genre " + genre + ":");
			for (int i = 0; i < genreSongs.size(); i++) {
				System.out.println(genreSongs.get(i));
			}
		} else {
			System.out.println("No songs found in genre " + genre);
		}
	}
}
