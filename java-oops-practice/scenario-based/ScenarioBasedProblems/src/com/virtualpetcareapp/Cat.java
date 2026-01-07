package com.virtualpetcareapp;

public class Cat extends Pet implements IInteractable {

	public Cat(String name, String type, int age) {
		super(name, type, age);
	}

	@Override
	public void makeSound() {
		System.out.println(name + " says: Meow");
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
