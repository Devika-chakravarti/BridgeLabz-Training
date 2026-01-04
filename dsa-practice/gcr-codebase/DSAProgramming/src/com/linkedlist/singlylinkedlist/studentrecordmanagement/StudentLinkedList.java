package com.linkedlist.singlylinkedlist.studentrecordmanagement;

class StudentLinkedList {

	// first node of list
	private StudentNode head;

	// add student at beginning
	public void addAtBeginning(int roll, String name, int age, char grade) {
		StudentNode newNode = new StudentNode(roll, name, age, grade);
		newNode.next = head;
		head = newNode;
		System.out.println("Student added at beginning: " + name);
	}

	// add student at end
	public void addAtEnd(int roll, String name, int age, char grade) {
		StudentNode newNode = new StudentNode(roll, name, age, grade);
		if (head == null) {
			head = newNode;
			System.out.println("Student added as first record: " + name);
			return;
		}
		StudentNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		System.out.println("Student added at end: " + name);
	}

	// add student at specific position
	public void addAtPosition(int pos, int roll, String name, int age, char grade) {
		if (pos <= 1) {
			addAtBeginning(roll, name, age, grade);
			return;
		}
		StudentNode temp = head;
		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Cannot add student. Invalid position.");
			return;
		}
		StudentNode newNode = new StudentNode(roll, name, age, grade);
		newNode.next = temp.next;
		temp.next = newNode;
		System.out.println("Student added at position " + pos + ": " + name);
	}

	// delete student using roll number
	public void deleteByRoll(int roll) {
		if (head == null) {
			System.out.println("No student records available to delete.");
			return;
		}
		if (head.roll == roll) {
			System.out.println("Student deleted: " + head.name);
			head = head.next;
			return;
		}
		StudentNode temp = head;
		while (temp.next != null && temp.next.roll != roll) {
			temp = temp.next;
		}
		if (temp.next == null) {
			System.out.println("Student with roll " + roll + " not found.");
		} else {
			System.out.println("Student deleted: " + temp.next.name + " (Roll " + roll + ")");
			temp.next = temp.next.next;
		}
	}

	// search student by roll number
	public void searchByRoll(int roll) {
		StudentNode temp = head;
		while (temp != null) {
			if (temp.roll == roll) {
				System.out.println("-------- Student found(using roll no) --------");
				System.out.println("Roll number: " + temp.roll + ", Name: " + temp.name + ", Age: " + temp.age
						+ ", Grade: " + temp.grade);
				System.out.println("----------------------------------------------");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Student with roll " + roll + " not found.");
	}

	// update grade using roll number
	public void updateGrade(int roll, char newGrade) {
		StudentNode temp = head;
		while (temp != null) {
			if (temp.roll == roll) {
				temp.grade = newGrade;
				System.out.println("\nGrade updated for " + temp.name + " to " + newGrade);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Student with roll " + roll + " not found. Grade not updated.");
	}

	// display all student records
	public void display() {
		if (head == null) {
			System.out.println("No student records available.");
			return;
		}
		System.out.println("\n--------------- Student Records ---------------");
		StudentNode temp = head;
		while (temp != null) {
			System.out.println("Roll number: " + temp.roll + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: "
					+ temp.grade);
			temp = temp.next;
		}
		System.out.println("-----------------------------------------------\n");
	}
}
