package com.inheritance.singleinheritance.librarymanagement;

public class UseLibraryManagement {
	public static void main(String[] args) {

        Author author = new Author(
                "Atomic Habits",
                2018,
                "James Clear",
                "Writer, speaker, and entrepreneur"
        );

        author.displayInfo();
    }
}
