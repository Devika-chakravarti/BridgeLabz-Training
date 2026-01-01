package com.inheritance.assistedproblems.animalhierarchy;

public class UseAnimal {
	public static void main(String[] args) {

        // parent reference holding child objects
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Kitty", 2);
        Animal bird = new Bird("Tweety", 1);

        // calling overridden methods
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
