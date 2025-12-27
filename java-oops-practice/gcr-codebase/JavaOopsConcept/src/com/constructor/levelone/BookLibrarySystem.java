package com.constructor.levelone;

// Book class
public class BookLibrarySystem{

    // Attributes
    public String ISBN;
    protected String title;
    private String author;

    // Parameterized constructor
    public BookLibrarySystem(String ISBN,String title,String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor(){
        return author;
    }

    // Setter for author
    public void setAuthor(String author){
        this.author = author;
    }

    // Display book details
    public void displayBookDetails(){
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
