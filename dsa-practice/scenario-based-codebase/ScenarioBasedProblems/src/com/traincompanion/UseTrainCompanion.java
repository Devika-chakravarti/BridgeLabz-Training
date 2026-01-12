/* Scenario-based: 5
 * 
 * TrainCompanion – Compartment Navigation System (Doubly Linked
List)
Story: In a long-distance train app, passengers can walk to the next or previous compartment,
or search for services (like pantry, WiFi). Each compartment is a node in a Doubly Linked List.
Requirements:
● Traverse forward or backward.
● Insert/Remove compartments dynamically.
● Display adjacent compartments for quick decisions.
*/

package com.traincompanion;

import java.util.Scanner;

public class UseTrainCompanion {

	// Object of Train class
	private static Train train = new Train();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		boolean running = true;

		System.out.println("=================================");
		System.out.println("       TRAIN COMPANION SYSTEM");
		System.out.println("=================================");

		while (running) {

			showMenu();
			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {

			case 1:
				addCompartment();
				break;
			case 2:
				removeCompartment();
				break;
			case 3:
				train.moveForward();
				break;
			case 4:
				train.moveBackward();
				break;
			case 5:
				train.showAdjacent();
				break;
			case 6:
				train.displayTrain();
				break;
			case 7:
				running = false;
				System.out.println("Exiting Train Companion System.");
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	private static void showMenu() {
		System.out.println("---------------------------------");
		System.out.println("1. Add Compartment");
		System.out.println("2. Remove Compartment");
		System.out.println("3. Move Forward");
		System.out.println("4. Move Backward");
		System.out.println("5. Show Adjacent Compartments");
		System.out.println("6. Display Full Train");
		System.out.println("7. Exit");
		System.out.println("---------------------------------");
		System.out.print("Enter your choice: ");
	}

	private static void addCompartment() {
		System.out.print("Enter compartment name: ");
		String name = input.nextLine();
		train.addCompartment(name);
	}

	private static void removeCompartment() {
		System.out.print("Enter compartment name to remove: ");
		String name = input.nextLine();
		train.removeCompartment(name);
	}
}
