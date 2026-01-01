package com.inheritance.assistedproblems.animalhierarchy;
class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    // overriding makeSound method
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
