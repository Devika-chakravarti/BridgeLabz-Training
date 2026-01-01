package com.objectmodeling.assistedproblems.librarybookaggregation;

public class Book {
	String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book info
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
