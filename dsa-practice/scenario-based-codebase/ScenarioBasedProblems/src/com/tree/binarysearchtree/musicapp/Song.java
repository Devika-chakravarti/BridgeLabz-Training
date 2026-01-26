package com.tree.binarysearchtree.musicapp;

public class Song {

	int trackId;
	String title;
	String artist;

	public Song(int trackId, String title, String artist) {
		this.trackId = trackId;
		this.title = title;
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Track ID: " + trackId + ", Title: " + title + ", Artist: " + artist;
	}
}
