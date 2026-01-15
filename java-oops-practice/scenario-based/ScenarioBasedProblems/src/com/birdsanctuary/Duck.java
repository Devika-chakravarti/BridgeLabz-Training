package com.birdsanctuary;

public class Duck extends Bird implements Flyable, Swimmable {

	public Duck(String id, String name) {
		super(id, name, "Duck");
	}

	@Override
	public void fly() {
		System.out.println(getName() + " is flying short distances.");
	}

	@Override
	public void swim() {
		System.out.println(getName() + " is swimming in the pond.");
	}

	@Override
	public void displayInfo() {
		System.out.println(getId() + " | " + getName() + " | Duck | Flyable & Swimmable");
	}
}
