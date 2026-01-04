package com.linkedlist.doublylinkedlist.librarymanagementsystem;

class BookNode {
	String title;
	String author;
	String genre;
	int bookId;
	String status;
	BookNode next;
	BookNode prev;

	BookNode(String title, String author, String genre, int bookId, String status) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.bookId = bookId;
		this.status = status;
		this.next = null;
		this.prev = null;
	}
}
