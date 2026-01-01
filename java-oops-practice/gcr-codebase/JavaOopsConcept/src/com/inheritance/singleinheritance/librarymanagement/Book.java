package com.inheritance.singleinheritance.librarymanagement;
class Book {

    // private attributes
    private String title;
    private int publicationYear;

    // constructor to initialize book details
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // getters to access private variables
    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // method to display book details
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
