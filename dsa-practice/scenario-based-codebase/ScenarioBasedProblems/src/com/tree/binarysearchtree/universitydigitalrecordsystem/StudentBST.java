package com.tree.binarysearchtree.universitydigitalrecordsystem;

public class StudentBST {
	private BSTNode root;

	// Insert student
	public void insert(Student student) {
		root = insertRec(root, student);
	}

	private BSTNode insertRec(BSTNode root, Student student) {
		if (root == null)
			return new BSTNode(student);

		if (student.rollNumber < root.student.rollNumber)
			root.left = insertRec(root.left, student);
		else if (student.rollNumber > root.student.rollNumber)
			root.right = insertRec(root.right, student);
		else
			System.out.println("Duplicate roll number not allowed: " + student.rollNumber);

		return root;
	}

	// Search student
	public Student search(int rollNumber) {
		BSTNode node = searchRec(root, rollNumber);
		return node == null ? null : node.student;
	}

	private BSTNode searchRec(BSTNode root, int rollNumber) {
		if (root == null || root.student.rollNumber == rollNumber)
			return root;

		if (rollNumber < root.student.rollNumber)
			return searchRec(root.left, rollNumber);
		
		return searchRec(root.right, rollNumber);
	}

	// Delete student
	public void delete(int rollNumber) {
		root = deleteRec(root, rollNumber);
	}

	private BSTNode deleteRec(BSTNode root, int rollNumber) {
		if (root == null)
			return null;

		if (rollNumber < root.student.rollNumber)
			root.left = deleteRec(root.left, rollNumber);
		else if (rollNumber > root.student.rollNumber)
			root.right = deleteRec(root.right, rollNumber);
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			root.student = minValue(root.right);
			root.right = deleteRec(root.right, root.student.rollNumber);
		}
		return root;
	}

	private Student minValue(BSTNode node) {
		BSTNode current = node;
		
		while (current.left != null)
			current = current.left;
		
		return current.student;
	}

	// Display all students in sorted order
	public void displaySorted() {
		System.out.println("Student Records (Sorted by Roll Number):");
		inorderRec(root);
		System.out.println();
	}

	private void inorderRec(BSTNode root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.student);
			inorderRec(root.right);
		}
	}
}
