package com.birdsanctuary;

public class Penguin extends Bird implements Swimmable {

	public Penguin(String id, String name) {
		super(id, name, "Penguin");
	}

	@Override
	public void swim() {
		System.out.println(getName() + " is swimming swiftly.");
	}

	@Override
	public void displayInfo() {
		System.out.println(getId() + " | " + getName() + " | Penguin | Swimmable");
	}
}
