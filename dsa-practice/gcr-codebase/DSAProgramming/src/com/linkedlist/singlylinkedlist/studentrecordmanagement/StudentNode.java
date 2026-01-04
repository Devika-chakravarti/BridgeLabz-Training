package com.linkedlist.singlylinkedlist.studentrecordmanagement;

//Node class to store student data
class StudentNode {
	int roll;
	String name;
	int age;
	char grade;
	StudentNode next;

	// Constructor to initialize node
	StudentNode(int roll, String name, int age, char grade) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
}
