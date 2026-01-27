package com.songvault;

public class Song extends Media<String> {
	private String genre;

	public Song(String title, String artist, String duration, String genre) {
		super(title, artist, duration, "Audio");
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return "Title: " + getTitle() + ", Artist: " + getCreator() + ", Duration: " + getDuration() + ", Genre: "
				+ genre;
	}
}
