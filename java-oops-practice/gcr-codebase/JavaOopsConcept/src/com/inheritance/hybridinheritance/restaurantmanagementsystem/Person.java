package com.inheritance.hybridinheritance.restaurantmanagementsystem;
class Person {

    // private attributes for encapsulation
    private String name;
    private int id;

    // constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
