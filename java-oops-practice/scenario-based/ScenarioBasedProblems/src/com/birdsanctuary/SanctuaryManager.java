package com.birdsanctuary;

import java.util.ArrayList;

public class SanctuaryManager {

	private ArrayList<Bird> birds = new ArrayList<>();

	public void addBird(Bird bird) {
		birds.add(bird);
		System.out.println("Bird added successfully!");
	}

	public void displayAllBirds() {
		if (birds.isEmpty()) {
			System.out.println("No birds in the sanctuary.");
			return;
		}
		for (Bird b : birds) {
			b.displayInfo();
		}
	}

	public void displayFlyingBirds() {
		for (Bird b : birds) {
			if (b instanceof Flyable) {
				b.displayInfo();
				((Flyable) b).fly();
			}
		}
	}

	public void displaySwimmingBirds() {
		for (Bird b : birds) {
			if (b instanceof Swimmable) {
				b.displayInfo();
				((Swimmable) b).swim();
			}
		}
	}

	public void deleteBirdById(String id) {
		for (int i = 0; i < birds.size(); i++) {
			if (birds.get(i).getId().equals(id)) {
				birds.remove(i);
				System.out.println("Bird removed successfully.");
				return;
			}
		}
		System.out.println("Bird ID not found.");
	}

	public void sanctuaryReport() {
		int fly = 0, swim = 0, both = 0, neither = 0;

		for (Bird b : birds) {
			boolean f = b instanceof Flyable;
			boolean s = b instanceof Swimmable;

			if (f && s)
				both++;
			else if (f)
				fly++;
			else if (s)
				swim++;
			else
				neither++;
		}

		System.out.println("---------- SANCTUARY REPORT ----------");
		System.out.println("Flyable Birds       : " + fly);
		System.out.println("Swimmable Birds     : " + swim);
		System.out.println("Both Abilities      : " + both);
		System.out.println("Neither Ability     : " + neither);
		System.out.println("-------------------------------------");
	}
}
