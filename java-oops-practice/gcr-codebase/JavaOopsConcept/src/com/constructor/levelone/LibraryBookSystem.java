package com.constructor.levelone;

public class LibraryBookSystem {

    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default constructor
    LibraryBookSystem() {
        this("Atomic Habits", "James Clear", 250.0, false);
    }

    // Parameterized constructor
    LibraryBookSystem(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Private method to handle borrow logic
    private void processBorrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("\nBook borrowed successfully.");
        } else {
            System.out.println("\nBook isn't available to borrow.");
        }
    }

    // Method to borrow a book
    void borrowBook() {
        processBorrow();
    }

    // Display book details
    void displayBookSystemDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + isAvailable);
    }

    public static void main(String[] args) {

        LibraryBookSystem booking = new LibraryBookSystem();

        booking.displayBookSystemDetails();
        booking.borrowBook();
    }
}
