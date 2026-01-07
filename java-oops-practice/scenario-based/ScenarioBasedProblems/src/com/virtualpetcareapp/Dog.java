package com.virtualpetcareapp;

public class Dog extends Pet implements IInteractable {

	public Dog(String name, String type, int age) {
		super(name, type, age);
	}

	@Override
	public void makeSound() {
		System.out.println(name + " says: Woof Woof");
	}

	@Override
	public void feed() {
		decreaseHunger();
	}

	@Override
	public void play() {
		increaseHunger();
		decreaseEnergy();
	}

	@Override
	public void sleep() {
		increaseEnergy();
	}
}
