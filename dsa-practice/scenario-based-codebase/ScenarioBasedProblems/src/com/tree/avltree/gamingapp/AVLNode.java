package com.tree.avltree.gamingapp;

public class AVLNode {

	Player player;
	int height;
	AVLNode left, right;

	public AVLNode(Player player) {
		this.player = player;
		this.height = 1; // new node height = 1
	}
}
