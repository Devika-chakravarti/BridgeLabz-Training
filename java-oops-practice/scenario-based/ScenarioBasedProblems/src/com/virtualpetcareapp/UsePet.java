package com.virtualpetcareapp;

import java.util.Scanner;

public class UsePet {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Pet pet = null;

		System.out.println("========================================");
		System.out.println("        WELCOME TO PETPAL");
		System.out.println("========================================");
		System.out.println();

		System.out.println("Available Pets");
		System.out.println("----------------------------------------");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. Bird");
		System.out.println("----------------------------------------");

		System.out.print("Choose pet type (1-3)     : ");
		int choice = input.nextInt();
		input.nextLine();

		System.out.print("Enter pet name            : ");
		String name = input.nextLine();

		System.out.print("Enter pet age             : ");
		int age = input.nextInt();

		if (choice == 1)
			pet = new Dog(name, "Dog", age);
		else if (choice == 2)
			pet = new Cat(name, "Cat", age);
		else
			pet = new Bird(name, "Bird", age);

		System.out.println();
		pet.displayStatus();
		pet.makeSound();

		int action;

		do {
			System.out.println();
			System.out.println("----------------------------------------");
			System.out.println("Available Actions");
			System.out.println("----------------------------------------");
			System.out.println("1. Feed");
			System.out.println("2. Play");
			System.out.println("3. Sleep");
			System.out.println("4. Exit");
			System.out.println("----------------------------------------");

			System.out.print("Choose action (1-4)       : ");
			action = input.nextInt();

			System.out.println();

			if (action == 1) {
				((IInteractable) pet).feed();
				System.out.println("YOU FED THE PET.");
			} else if (action == 2) {
				((IInteractable) pet).play();
				System.out.println("YOU PLAYED WITH THE PET.");
			} else if (action == 3) {
				((IInteractable) pet).sleep();
				System.out.println("PET IS SLEEPING.");
			} else if (action == 4) {
				break;
			} else {
				System.out.println("Invalid choice. Please try again.");
				continue;
			}

			System.out.println();
			pet.displayStatus();

		} while (true);

		System.out.println();
		System.out.println("========================================");
		System.out.println("      THANK YOU FOR USING PETPAL");
		System.out.println("========================================");

		input.close();
	}
}
