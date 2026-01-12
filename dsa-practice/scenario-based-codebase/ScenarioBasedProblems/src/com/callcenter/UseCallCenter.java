/* Scenario-based: 4
 * 
 * CallCenter – Customer Queue Manager (Queue + HashMap)
Story: In a telecom call center, customers are queued based on the time of call. Priority
customers have a special queue. A HashMap keeps track of the number of times each user has
called this month.
Requirements:

● Use Queue for managing incoming calls.
● Use HashMap for customer data.
● Priority Queue for VIP customers.
*/

package com.callcenter;

import java.util.Scanner;

public class UseCallCenter {

	// Object of CallQueueManager class
	private static CallQueueManager queueManager = new CallQueueManager();
	// Object of CustomerManager class
	private static CustomerManager customerManager = new CustomerManager();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		boolean running = true;

		System.out.println("========================================");
		System.out.println("     CUSTOMER QUEUE MANAGER SYSTEM");
		System.out.println("========================================");

		while (running) {
			showMenu();
			int choice = input.nextInt();

			switch (choice) {
			case 1:
				addIncomingCall();
				break;
			case 2:
				attendNextCall();
				break;
			case 3:
				queueManager.displayVipQueue();
				break;
			case 4:
				queueManager.displayNormalQueue();
				break;
			case 5:
				customerManager.displayCallHistory();
				break;
			case 6:
				running = false;
				System.out.println("========================================");
				System.out.println("  CUSTOMER QUEUE MANAGER SYSTEM CLOSED");
				System.out.println("========================================");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	// Method to show the menu
	private static void showMenu() {
		System.out.println("----------------------------------------");
		System.out.println("1. Add Incoming Call");
		System.out.println("2. Attend Next Call");
		System.out.println("3. View VIP Queue");
		System.out.println("4. View Normal Queue");
		System.out.println("5. View Customer Call History");
		System.out.println("6. Exit");
		System.out.println("----------------------------------------");
		System.out.print("Enter your choice: ");
	}

	private static void addIncomingCall() {
		System.out.print("Enter Customer ID: ");
		int customerId = input.nextInt();

		System.out.print("Is this a VIP customer? (yes/no): ");
		String vipInput = input.next();
		boolean isVip = vipInput.equalsIgnoreCase("yes");

		queueManager.addCall(customerId, isVip);
		customerManager.recordCall(customerId);
	}

	private static void attendNextCall() {
		int customerId = queueManager.attendNextCall();

		if (customerId == -1) {
			System.out.println("No calls available to attend.");
			return;
		}

		if (queueManager.hasVip()) {
			System.out.println("Serving VIP customer");
		} else {
			System.out.println("Serving normal customer");
		}

		System.out.println("Customer ID: " + customerId);
		System.out.println("Total calls this month: " + customerManager.getCallCount(customerId));
	}
}
