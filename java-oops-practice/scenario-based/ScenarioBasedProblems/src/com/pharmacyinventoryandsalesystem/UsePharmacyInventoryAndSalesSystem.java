package com.pharmacyinventoryandsalesystem;

import java.time.LocalDate;
import java.util.Scanner;

public class UsePharmacyInventoryAndSalesSystem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean running = true;

		Medicine tablet = new Tablet("Paracetamol", 50, LocalDate.of(2024, 5, 10), LocalDate.of(2026, 5, 10), 50);

		Medicine syrup = new Syrup("Cough Syrup", 120, LocalDate.of(2024, 12, 15), LocalDate.of(2025, 12, 15), 30);

		Medicine injection = new Injection("Insulin", 300, LocalDate.of(2024, 4, 20), LocalDate.of(2025, 1, 20), 20);

		System.out.println("==================================================");
		System.out.println("         WELCOME TO MEDISTORE PHARMACY");
		System.out.println("==================================================");

		while (running) {

			System.out.println("\nChoose an option:");
			System.out.println("1. View Available Medicines");
			System.out.println("2. Sell Medicine");
			System.out.println("3. Check Expiry Status");
			System.out.println("4. Exit");

			System.out.print("Enter choice: ");
			int choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.println("\nAvailable Medicines:");
				System.out.println("Tablet    : " + tablet.getQuantity());
				System.out.println("Syrup     : " + syrup.getQuantity());
				System.out.println("Injection : " + injection.getQuantity());
				break;

			case 2:
				System.out.print("Select Medicine (1-Tablet, 2-Syrup, 3-Injection): ");
				int m = input.nextInt();

				System.out.print("Enter Quantity: ");
				int qty = input.nextInt();

				if (m == 1)
					tablet.sell(qty);
				else if (m == 2)
					syrup.sell(qty);
				else if (m == 3)
					injection.sell(qty);
				else
					System.out.println("Invalid medicine choice");
				break;

			case 3:
				System.out.println("\n--------------------------------------------------");
				System.out.println("Expiry Details:");
				System.out.println("--------------------------------------------------");
				displayMedicine("Tablet", tablet);
				displayMedicine("Syrup", syrup);
				displayMedicine("Injection", injection);
				break;

			case 4:
				running = false;
				break;

			default:
				System.out.println("Invalid choice");
			}
		}

		System.out.println("==================================================");
		System.out.println("          THANK YOU FOR USING MEDISTORE");
		System.out.println("==================================================");

		input.close();
	}

	private static void displayMedicine(String label, Medicine med) {
		System.out.println(label);
		System.out.println("Manufacturing Date : " + med.getManufacturingDate());
		System.out.println("Expiry Date        : " + med.getExpiryDate());
		System.out.println("Status             : " + (med.checkExpiry() ? "Expired (Do Not Sell)" : "Valid for Sale"));
		System.out.println("--------------------------------------------------");
	}
}
