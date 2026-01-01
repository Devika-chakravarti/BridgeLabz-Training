package com.inheritance.assistedproblems.animalhierarchy;
class Animal {

    // private attributes
    private String name;
    private int age;

    // constructor to initialize values
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter methods to access private data
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // method to be overridden by child classes
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
