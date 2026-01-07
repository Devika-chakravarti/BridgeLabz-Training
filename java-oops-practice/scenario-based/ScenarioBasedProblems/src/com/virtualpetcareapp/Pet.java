package com.virtualpetcareapp;

public abstract class Pet {

	protected String name;
	protected String type;
	protected int age;

	private int hunger;
	private int energy;

	public Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
		this.hunger = 50;
		this.energy = 50;
	}

	protected void increaseHunger() {
		hunger = hunger + 10;
		if (hunger > 100) hunger = 100;
	}

	protected void decreaseHunger() {
		hunger = hunger - 10;
		if (hunger < 0) hunger = 0;
	}

	protected void increaseEnergy() {
		energy = energy + 20;
		if (energy > 100) energy = 100;
	}

	protected void decreaseEnergy() {
		energy = energy - 20;
		if (energy < 0) energy = 0;
	}

	public int getHungerLevel() {
		return hunger;
	}

	public int getEnergyLevel() {
		return energy;
	}

	public String getMood() {
		if (hunger > 70) return "Hungry";
		if (energy < 30) return "Tired";
		return "Happy";
	}

	public void displayStatus() {
		System.out.println("----------------------------------------");
		System.out.println("Current status of the pet:");
		System.out.println("----------------------------------------");
		System.out.println("Pet Name      : " + name);
		System.out.println("Type          : " + type);
		System.out.println("Age           : " + age);
		System.out.println("Hunger Level  : " + hunger);
		System.out.println("Energy Level  : " + energy);
		System.out.println("Mood          : " + getMood());
		System.out.println("----------------------------------------");
	}

	public abstract void makeSound();
}
