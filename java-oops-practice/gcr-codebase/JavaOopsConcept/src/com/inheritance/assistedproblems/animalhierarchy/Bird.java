package com.inheritance.assistedproblems.animalhierarchy;
class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    // overriding makeSound method
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}
