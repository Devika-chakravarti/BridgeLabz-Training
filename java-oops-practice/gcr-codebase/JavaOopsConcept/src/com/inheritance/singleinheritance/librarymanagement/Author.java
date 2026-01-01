package com.inheritance.singleinheritance.librarymanagement;
class Author extends Book {

    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // calling parent constructor
        this.name = name;
        this.bio = bio;
    }

    // overriding displayInfo method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
