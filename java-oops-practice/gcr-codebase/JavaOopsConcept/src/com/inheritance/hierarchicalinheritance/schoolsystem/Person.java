package com.inheritance.hierarchicalinheritance.schoolsystem;
class Person {

    // private attributes for encapsulation
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // method to be overridden
    public void displayRole() {
        System.out.println("Person in the school");
    }
}
