/* Scenario-based: 9
 * 
 * SmartCheckout – Supermarket Billing Queue (Queue + HashMap)
Story: At a supermarket, each checkout counter maintains a Queue of customers. Each
customer has a list of items, and a HashMap is used to fetch price and stock quickly.
Requirements:
● Add/remove customers from the queue.
● Fetch item prices from map.
● Update stock on purchase.
*/

package com.smartcheckout;

import java.util.Scanner;

public class UseSmartCheckout {

	public static void main(String[] args) {

		SmartCheckout checkout = new SmartCheckout();
		Scanner input = new Scanner(System.in);

		System.out.println("===================================================");
		System.out.println("     WELCOME TO OUR SMART CHECKOUT SYSTEM");
		System.out.println("===================================================");
		System.out.println();
		System.out.println("Available items in stock:");
		checkout.showAvailableItems();

		while (true) {

			System.out.println();
			System.out.println("Smart Checkout Menu:");
			System.out.println("1. Add Customer");
			System.out.println("2. Process Next Customer");
			System.out.println("3. Show Queue Status");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter customer ID: ");
				int id = input.nextInt();
				input.nextLine();

				System.out.print("Enter number of items: ");
				int count = input.nextInt();
				input.nextLine();

				String[] items = new String[count];
				for (int i = 0; i < count; i++) {
					System.out.print("Enter item name: ");
					items[i] = input.nextLine();
				}

				checkout.addCustomer(new Customer(id, items));
				break;

			case 2:
				checkout.processNextCustomer();
				break;

			case 3:
				checkout.showQueueStatus();
				break;

			case 4:
				System.out.println("===================================================");
				System.out.println("   THANK YOU FOR USING OUR SMART CHECKOUT SYSTEM");
				System.out.println("===================================================");
				return;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
