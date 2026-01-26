package com.tree.avltree.gamingapp;

public class LeaderboardAVL {

	private AVLNode root;
	private int count;

	// Height of node
	private int height(AVLNode node) {
		return node == null ? 0 : node.height;
	}

	// Balance factor
	private int getBalance(AVLNode node) {
		return node == null ? 0 : height(node.left) - height(node.right);
	}

	// Right rotation
	private AVLNode rightRotate(AVLNode y) {
		AVLNode x = y.left;
		AVLNode t2 = x.right;

		x.right = y;
		y.left = t2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	// Left rotation
	private AVLNode leftRotate(AVLNode x) {
		AVLNode y = x.right;
		AVLNode t2 = y.left;

		y.left = x;
		x.right = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	// Insert or update player
	public void insert(Player player) {
		root = insertRec(root, player);
	}

	private AVLNode insertRec(AVLNode node, Player player) {
		if (node == null)
			return new AVLNode(player);

		if (player.score < node.player.score)
			node.left = insertRec(node.left, player);
		else if (player.score > node.player.score)
			node.right = insertRec(node.right, player);
		else {
			node.player = player; // update existing
			return node;
		}

		node.height = 1 + Math.max(height(node.left), height(node.right));

		int balance = getBalance(node);

		// LL
		if (balance > 1 && player.score < node.left.player.score)
			return rightRotate(node);

		// RR
		if (balance < -1 && player.score > node.right.player.score)
			return leftRotate(node);

		// LR
		if (balance > 1 && player.score > node.left.player.score) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// RL
		if (balance < -1 && player.score < node.right.player.score) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	// Remove player by score
	public void remove(int score) {
		root = deleteRec(root, score);
	}

	private AVLNode deleteRec(AVLNode root, int score) {
		if (root == null)
			return null;

		if (score < root.player.score)
			root.left = deleteRec(root.left, score);
		else if (score > root.player.score)
			root.right = deleteRec(root.right, score);
		else {
			if (root.left == null || root.right == null) {
				root = (root.left != null) ? root.left : root.right;
			} else {
				AVLNode temp = minValueNode(root.right);
				root.player = temp.player;
				root.right = deleteRec(root.right, temp.player.score);
			}
		}

		if (root == null)
			return null;

		root.height = 1 + Math.max(height(root.left), height(root.right));
		int balance = getBalance(root);

		if (balance > 1 && getBalance(root.left) >= 0)
			return rightRotate(root);

		if (balance > 1 && getBalance(root.left) < 0) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		if (balance < -1 && getBalance(root.right) <= 0)
			return leftRotate(root);

		if (balance < -1 && getBalance(root.right) > 0) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	private AVLNode minValueNode(AVLNode node) {
		AVLNode current = node;
		while (current.left != null)
			current = current.left;
		return current;
	}

	// Display top 10 players
	public void displayTopPlayers() {
		count = 0;
		System.out.println("\nTop Players:");
		reverseInorder(root);
	}

	private void reverseInorder(AVLNode node) {
		if (node == null || count == 10)
			return;

		reverseInorder(node.right);
		if (count < 10) {
			System.out.println(node.player);
			count++;
		}
		reverseInorder(node.left);
	}
}
