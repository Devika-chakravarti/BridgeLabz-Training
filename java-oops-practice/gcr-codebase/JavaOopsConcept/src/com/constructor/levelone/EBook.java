package com.constructor.levelone;

// Subclass demonstrating access to ISBN and title
public class EBook extends BookLibrarySystem{

    private double fileSizeMB;

    // Parameterized constructor
    public EBook(String ISBN,String title,String author,double fileSizeMB){
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // Display EBook details
    public void displayEBookDetails(){
        // Accessing public and protected members from superclass
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSizeMB + " MB");
    }

    public static void main(String[] args){
        EBook ebook = new EBook("978-0143127741", "Atomic Habits", "James Clear", 2.5);
        ebook.displayEBookDetails();

        // Modify author using setter
        ebook.setAuthor("J. Clear");
        System.out.println("\nAfter updating author:");
        ebook.displayEBookDetails();
    }
}
