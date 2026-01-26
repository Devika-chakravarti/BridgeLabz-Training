package com.tree.binarysearchtree.musicapp;

public class SongBST {

	private SongNode root;

	// Insert new song
	public void insert(Song song) {
		root = insertRec(root, song);
	}

	private SongNode insertRec(SongNode root, Song song) {
		if (root == null)
			return new SongNode(song);

		if (song.trackId < root.song.trackId)
			root.left = insertRec(root.left, song);
		else if (song.trackId > root.song.trackId)
			root.right = insertRec(root.right, song);
		else
			System.out.println("Duplicate Track ID not allowed");

		return root;
	}

	// Search song by track ID
	public Song search(int trackId) {
		SongNode node = searchRec(root, trackId);
		return node == null ? null : node.song;
	}

	private SongNode searchRec(SongNode root, int trackId) {
		if (root == null || root.song.trackId == trackId)
			return root;

		if (trackId < root.song.trackId)
			return searchRec(root.left, trackId);

		return searchRec(root.right, trackId);
	}

	// Display playlist (In-order traversal)
	public void displayPlaylist() {
		System.out.println("\nPlaylist (Sorted by Track ID):");
		inorder(root);
	}

	private void inorder(SongNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.song);
			inorder(root.right);
		}
	}
}
