package com.inheritance.assistedproblems.animalhierarchy;
class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age); // calling parent constructor
    }

    // overriding makeSound method
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
