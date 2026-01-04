package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class UseMovie {
	public static void main(String[] args) {

		MovieDoublyLinkedList list = new MovieDoublyLinkedList();

		System.out.println("========================================");
		System.out.println("        MOVIE MANAGEMENT SYSTEM");
		System.out.println("========================================\n");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 1: ADD MOVIE RECORDS");
		System.out.println("----------------------------------------");
		list.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
		list.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
		list.addAtPosition(2, "Parasite", "Bong Joon-ho", 2019, 8.5);

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 2: DISPLAY MOVIES (FORWARD)");
		System.out.println("----------------------------------------");
		list.displayForward();

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 3: DISPLAY MOVIES (REVERSE)");
		System.out.println("----------------------------------------");
		list.displayReverse();

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 4: SEARCH MOVIE");
		System.out.println("----------------------------------------");
		System.out.println("Search by Director : Christopher Nolan\n");
		list.searchByDirector("Christopher Nolan");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 5: UPDATE MOVIE RATING");
		System.out.println("----------------------------------------");
		list.updateRating("Parasite", 9.0);

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 6: REMOVE MOVIE RECORD");
		System.out.println("----------------------------------------");
		list.removeByTitle("Inception");

		System.out.println("----------------------------------------");
		System.out.println("UPDATED MOVIE LIST (FORWARD)");
		System.out.println("----------------------------------------");
		list.displayForward();

	}
}
