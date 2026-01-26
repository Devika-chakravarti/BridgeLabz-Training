package com.tree.avltree.hospitalqueuemanagement;

public class HospitalAVL {

	int height(PatientNode node) {
		return (node == null) ? 0 : node.height;
	}

	int getBalance(PatientNode node) {
		return (node == null) ? 0 : height(node.left) - height(node.right);
	}

	PatientNode rightRotate(PatientNode y) {
		PatientNode x = y.left;
		PatientNode t2 = x.right;

		x.right = y;
		y.left = t2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	PatientNode leftRotate(PatientNode x) {
		PatientNode y = x.right;
		PatientNode t2 = y.left;

		y.left = x;
		x.right = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	PatientNode insert(PatientNode node, int time, String name) {

		if (node == null)
			return new PatientNode(time, name);

		if (time < node.checkInTime)
			node.left = insert(node.left, time, name);
		else if (time > node.checkInTime)
			node.right = insert(node.right, time, name);
		else
			return node;

		node.height = Math.max(height(node.left), height(node.right)) + 1;
		int balance = getBalance(node);

		if (balance > 1 && time < node.left.checkInTime)
			return rightRotate(node);

		if (balance < -1 && time > node.right.checkInTime)
			return leftRotate(node);

		return node;
	}

	PatientNode delete(PatientNode root, int time) {

		if (root == null)
			return root;

		if (time < root.checkInTime)
			root.left = delete(root.left, time);
		else if (time > root.checkInTime)
			root.right = delete(root.right, time);
		else
			root = (root.left != null) ? root.left : root.right;

		if (root == null)
			return root;

		root.height = Math.max(height(root.left), height(root.right)) + 1;
		return root;
	}

	void display(PatientNode root) {
		if (root != null) {
			display(root.left);
			System.out.println(root.checkInTime + " -> " + root.patientName);
			display(root.right);
		}
	}
}
