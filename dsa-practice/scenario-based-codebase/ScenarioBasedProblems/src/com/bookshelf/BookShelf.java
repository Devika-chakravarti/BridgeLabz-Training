package com.bookshelf;

import java.util.HashMap;
import java.util.LinkedList;

class BookShelf {

	private HashMap<String, LinkedList<Book>> library = new HashMap<>();

	public BookShelf() {

		library.put("Fiction", new LinkedList<>());
		library.put("Science", new LinkedList<>());
		library.put("History", new LinkedList<>());

		library.get("Fiction").add(new Book("The Alchemist", "Paulo Coelho"));
		library.get("Fiction").add(new Book("Harry Potter", "J.K. Rowling"));
		library.get("Fiction").add(new Book("The Kite Runner", "Khaled Hosseini"));

		library.get("Science").add(new Book("A Brief History of Time", "Stephen Hawking"));
		library.get("Science").add(new Book("Cosmos", "Carl Sagan"));
		library.get("Science").add(new Book("The Selfish Gene", "Richard Dawkins"));

		library.get("History").add(new Book("Sapiens", "Yuval Noah Harari"));
		library.get("History").add(new Book("Guns, Germs and Steel", "Jared Diamond"));
		library.get("History").add(new Book("The Silk Roads", "Peter Frankopan"));
	}

	// Method to show books
	public void showBooks() {
		for (String genre : library.keySet()) {
			System.out.println("\nGenre: " + genre);
			for (Book book : library.get(genre)) {
				System.out.println(book);
			}
		}
	}
	
	// Method includes borrow book logic
	public void borrowBook(String genre, String bookName) {
		LinkedList<Book> books = library.get(genre);

		if (books == null) {
			System.out.println("Invalid genre.");
			return;
		}

		for (Book book : books) {
			if (book.title.equalsIgnoreCase(bookName)) {
				books.remove(book);
				System.out.println("Book borrowed successfully.");
				return;
			}
		}

		System.out.println("Book not available.");
	}

	// Method includes return book logic
	public void returnBook(String genre, String bookName, String author) {
		LinkedList<Book> books = library.get(genre);

		if (books != null) {
			books.add(new Book(bookName, author));
			System.out.println("Book returned successfully.");
		} else {
			System.out.println("Invalid genre.");
		}
	}
}
