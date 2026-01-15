package com.sorting.smartshelf;

class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	void show() {
		System.out.println(title + " by " + author);
	}
}
