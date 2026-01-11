package com.ambulanceroute;

import java.util.Scanner;

public class UseAmbulanceRoute {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		AmbulanceRoute route = new AmbulanceRoute();

		route.addUnit("Emergency", false);
		route.addUnit("Radiology", false);
		route.addUnit("Surgery", true);
		route.addUnit("ICU", false);

		System.out.println("============================================================");
		System.out.println("     WELCOME TO OUR HOSPITAL EMERGENCY ROUTE SYSTEM");
		System.out.println("============================================================");

		route.showRoute();

		while (true) {
			System.out.println("\nChoose an action:");
			System.out.println("1. Show hospital units status");
			System.out.println("2. Ambulance arrives");
			System.out.println("3. Mark unit under maintenance");
			System.out.println("4. Mark unit as available");
			System.out.println("5. Exit");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {

			case 1:
				route.showStatus();
				break;

			case 2:
				route.findNearestAvailableUnit();
				break;

			case 3:
				System.out.print("Enter unit name to mark under maintenance: ");
				route.markUnderMaintenance(input.nextLine());
				break;

			case 4:
				System.out.print("Enter unit name to mark available: ");
				route.markAvailable(input.nextLine());
				break;

			case 5:
				System.out.println("\n============================================================");
				System.out.println("  THANK YOU FOR USING OUR HOSPITAL EMERGENCY ROUTE SYSTEM");
				System.out.println("============================================================");
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
