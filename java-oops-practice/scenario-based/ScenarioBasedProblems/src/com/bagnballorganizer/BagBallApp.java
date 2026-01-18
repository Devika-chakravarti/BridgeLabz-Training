/* Bag-n-Ball organizer
 * 
 * You’re building a toy storage system for TinyTown Play School, which wants to keep track of
bags and the balls inside them.
Each Bag has:
● A unique ID, color, and capacity (number of balls it can hold)
Each Ball has:
● A unique ID, color, and size (small/medium/large)
 Problem Statement:
Develop a Java system to:
● Add balls to a bag (up to capacity)
● Remove a ball from a bag
● Display all balls in a bag
● Display all bags and their ball count
● Prevent adding a ball if the bag is full
 * */

package com.bagnballorganizer;

import java.util.ArrayList;
import java.util.Scanner;

public class BagBallApp {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ArrayList<Bag> bags = new ArrayList<>();

		System.out.println("===============================================");
		System.out.println("             BAG-N-BALL ORGANIZER");
		System.out.println("===============================================");

		while (true) {
			System.out.println("\n1. Create Bag");
			System.out.println("2. Add ball to bag");
			System.out.println("3. Remove ball from bag");
			System.out.println("4. Display balls in a bag");
			System.out.println("5. Display all bags and ball count");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			int choice = input.nextInt();
			input.nextLine();

			if (choice == 1) {
				System.out.print("Enter Bag ID: ");
				String bagId = input.nextLine();

				System.out.print("Enter Bag Color: ");
				String color = input.nextLine();

				System.out.print("Enter Bag Capacity: ");
				int capacity = input.nextInt();
				input.nextLine();

				bags.add(new Bag(bagId, color, capacity));
				System.out.println("Bag created successfully.");

			} else if (choice == 2) {
				System.out.print("Enter Bag ID: ");
				String bagId = input.nextLine();

				Bag selectedBag = null;
				for (int i = 0; i < bags.size(); i++) {
					if (bags.get(i).getId().equals(bagId)) {
						selectedBag = bags.get(i);
						break;
					}
				}

				if (selectedBag == null) {
					System.out.println("Bag not found.");
					continue;
				}

				System.out.print("Enter Ball ID: ");
				String ballId = input.nextLine();

				System.out.print("Enter Ball Color: ");
				String ballColor = input.nextLine();

				System.out.print("Enter Ball Size (small/medium/large): ");
				String size = input.nextLine();

				selectedBag.addBall(new Ball(ballId, ballColor, size));

			} else if (choice == 3) {
				System.out.print("Enter Bag ID: ");
				String bagId = input.nextLine();

				for (int i = 0; i < bags.size(); i++) {
					if (bags.get(i).getId().equals(bagId)) {
						System.out.print("Enter Ball ID to remove: ");
						String ballId = input.nextLine();
						bags.get(i).removeBall(ballId);
					}
				}

			} else if (choice == 4) {
				System.out.print("Enter Bag ID: ");
				String bagId = input.nextLine();

				for (int i = 0; i < bags.size(); i++) {
					if (bags.get(i).getId().equals(bagId)) {
						bags.get(i).displayBalls();
					}
				}

			} else if (choice == 5) {
				System.out.println("Bag Summary:");
				for (int i = 0; i < bags.size(); i++) {
					Bag b = bags.get(i);
					System.out.println("Bag ID: " + b.getId() + ", Ball Count: " + b.getBallCount());
				}

			} else if (choice == 6) {
				System.out.println("\n===============================================");
				System.out.println("   THANK YOU FOR USING BAG-N-BALL ORGANIZER");
				System.out.println("===============================================");
				break;

			} else {
				System.out.println("Invalid choice.");
			}
		}
	}
}
