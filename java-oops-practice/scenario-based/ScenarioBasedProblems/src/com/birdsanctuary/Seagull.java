package com.birdsanctuary;

public class Seagull extends Bird implements Flyable, Swimmable {

	public Seagull(String id, String name) {
		super(id, name, "Seagull");
	}

	@Override
	public void fly() {
		System.out.println(getName() + " is gliding over the sea.");
	}

	@Override
	public void swim() {
		System.out.println(getName() + " is floating on water.");
	}

	@Override
	public void displayInfo() {
		System.out.println(getId() + " | " + getName() + " | Seagull | Flyable & Swimmable");
	}
}
