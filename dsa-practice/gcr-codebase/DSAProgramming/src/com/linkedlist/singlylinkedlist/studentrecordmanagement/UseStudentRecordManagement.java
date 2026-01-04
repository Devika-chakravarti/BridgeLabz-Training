package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class UseStudentRecordManagement {
	public static void main(String[] args) {

		// create list
		StudentLinkedList list = new StudentLinkedList();

		// add students
		list.addAtBeginning(1, "Aman", 20, 'B');
		list.addAtEnd(2, "Anjali", 21, 'B');
		list.addAtPosition(2, 3, "Devika", 21, 'A');

		// display records
		list.display();

		// delete student
		list.deleteByRoll(1);
		// display after deletion
		list.display();

		// search student
		list.searchByRoll(2);
		// update grade
		list.updateGrade(2, 'A');

		// display records
		System.out.println("\n----------- Final Student Records -------------");
		list.display();

	}
}
