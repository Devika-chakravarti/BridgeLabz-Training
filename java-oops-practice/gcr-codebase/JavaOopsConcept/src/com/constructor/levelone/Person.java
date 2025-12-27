package com.constructor.levelone;

public class Person {

    // Attributes
    private String name;
    private int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person person) {
        this(person.name, person.age);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        // Original object
        Person p1 = new Person("Devika", 22);

        // Copied object
        Person p2 = new Person(p1);

        System.out.println("Original Person:");
        System.out.println("Name: " + p1.getName() + ", Age: " + p1.getAge());

        System.out.println("\nCopied Person:");
        System.out.println("Name: " + p2.getName() + ", Age: " + p2.getAge());
    }
}
