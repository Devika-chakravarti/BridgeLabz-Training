package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class UseLibrary {
	public static void main(String[] args) {

		LibraryDoublyLinkedList lib = new LibraryDoublyLinkedList();

		System.out.println("========================================");
		System.out.println("        LIBRARY MANAGEMENT SYSTEM");
		System.out.println("========================================\n");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 1: ADD BOOKS");
		System.out.println("----------------------------------------");
		lib.addAtBeginning("Harry Potter", "J.K. Rowling", "Fantasy", 101, "Available");
		lib.addAtEnd("1984", "George Orwell", "Dystopian", 102, "Available");
		lib.addAtPosition(2, "The Alchemist", "Paulo Coelho", "Fiction", 103, "Available");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 2: DISPLAY BOOKS (FORWARD)");
		System.out.println("----------------------------------------");
		lib.displayForward();

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 3: DISPLAY BOOKS (REVERSE)");
		System.out.println("----------------------------------------");
		lib.displayReverse();

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 4: SEARCH BOOK");
		System.out.println("----------------------------------------");
		System.out.println("Search by Author : George Orwell\n");
		lib.searchByTitleOrAuthor("", "George Orwell");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 5: UPDATE AVAILABILITY");
		System.out.println("----------------------------------------");
		lib.updateStatus(103, "Checked Out");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 6: REMOVE BOOK");
		System.out.println("----------------------------------------");
		lib.removeById(101);

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 7: TOTAL NUMBER OF BOOKS");
		System.out.println("----------------------------------------");
		lib.countBooks();

		System.out.println("----------------------------------------");
		System.out.println("UPDATED BOOK LIST (FORWARD)");
		System.out.println("----------------------------------------");
		lib.displayForward();

	}
}
