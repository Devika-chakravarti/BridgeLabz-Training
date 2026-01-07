package com.virtualpetcareapp;

public class Bird extends Pet implements IInteractable {

	public Bird(String name, String type, int age) {
		super(name, type, age);
	}

	@Override
	public void makeSound() {
		System.out.println(name + " says: Chirp Chirp");
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
