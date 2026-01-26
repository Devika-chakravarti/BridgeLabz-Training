package com.tree.avltree.onlineticketbookingsystem;

public class AVLNode {

	Event event;
	int height;
	AVLNode left, right;

	public AVLNode(Event event) {
		this.event = event;
		this.height = 1;
		this.left = this.right = null;
	}
}
