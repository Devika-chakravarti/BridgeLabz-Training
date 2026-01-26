package com.tree.binarysearchtree.musicapp;

public class SongNode {

	Song song;
	SongNode left, right;

	public SongNode(Song song) {
		this.song = song;
		this.left = this.right = null;
	}
}
