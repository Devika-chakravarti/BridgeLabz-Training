package com.tree.binarysearchtree.universitydigitalrecordsystem;

public class Student {
	int rollNumber;
	String name;
	String department;

	public Student(int rollNumber, String name, String department) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Roll number: " + rollNumber + ", Name: " + name + ", Dept: " + department;
	}
}
