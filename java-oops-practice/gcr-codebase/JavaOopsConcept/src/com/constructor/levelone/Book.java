package com.constructor.levelone;

public class Book {

    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    Book() {
        this("Atomic Habits", "James Clear", 250.0);
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Display book details
    void displayBookDetails(String label) {
        System.out.println(label);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.displayBookDetails("Book1:");

        Book book2 = new Book("The Psychology of Money", "Morgan Housel", 300.0);
        book2.displayBookDetails("\nBook2:");
    }
}
