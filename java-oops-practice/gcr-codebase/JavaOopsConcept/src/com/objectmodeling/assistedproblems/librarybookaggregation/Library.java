package com.objectmodeling.assistedproblems.librarybookaggregation;
import java.util.ArrayList;
public class Library {
	// Aggregation: Library HAS books
    ArrayList<Book> books = new ArrayList<>();

    // Method to add book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to show all books
    public void showBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            book.displayBook();
        }
    }
}
