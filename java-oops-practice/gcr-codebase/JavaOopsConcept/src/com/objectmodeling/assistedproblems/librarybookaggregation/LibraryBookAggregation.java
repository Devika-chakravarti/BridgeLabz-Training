package com.objectmodeling.assistedproblems.librarybookaggregation;

public class LibraryBookAggregation {
	public static void main(String[] args) {

        // Creating Book objects (independent)
        Book b1 = new Book("Atomic Habits", "James Clear");
        Book b2 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");

        // Creating Library object
        Library library1 = new Library();

        // Adding books to library
        library1.addBook(b1);
        library1.addBook(b2);

        // Display books in library
        library1.showBooks();
    }
}
