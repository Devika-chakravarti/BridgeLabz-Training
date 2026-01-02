package com.encapsulationpolymorphismandabstraction.librarymanagementsystem;

public abstract class LibraryItem {

	// Attributes
    private String itemId;
    private String title;
    private String author;
    private String borrowerName;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    // Concrete methods
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Abstract method
    public abstract int getLoanDuration();

    public abstract void processReservation(String borrowerName);

    public abstract boolean isAvailable();
}
