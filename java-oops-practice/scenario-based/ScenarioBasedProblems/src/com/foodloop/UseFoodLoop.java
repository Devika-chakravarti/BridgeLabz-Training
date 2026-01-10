package com.foodloop;

import java.util.Scanner;

public class UseFoodLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("=====================================================");
		System.out.println("        FOODLOOP – RESTAURANT ORDERING SYSTEM");
		System.out.println("=====================================================");

		VegItem v1 = new VegItem("Paneer Butter Masala", 250, true);
		VegItem v2 = new VegItem("Veg Biryani", 200, true);
		VegItem v3 = new VegItem("South Indian Mini Meals", 180, false);
		VegItem v4 = new VegItem("Rajma + Jeera Rice + Naan", 400, true);

		NonVegItem n1 = new NonVegItem("Chicken Curry", 300, true);
		NonVegItem n2 = new NonVegItem("Mutton Biryani", 450, true);
		NonVegItem n3 = new NonVegItem("Fish Fry", 250, false);
		NonVegItem n4 = new NonVegItem("Mutton Combo Meal", 700, true);

		FoodItem[] vegItems = { v1, v2, v3, v4 };
		FoodItem[] nonVegItems = { n1, n2, n3, n4 };

		boolean running = true;

		while (running) {
			System.out.println("\n1. View Veg Items");
			System.out.println("2. View Non-Veg Items");
			System.out.println("3. Place Order");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			int choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.println("-----------------------------------------------------");
				System.out.println("                      Veg Menu");
				System.out.println("-----------------------------------------------------");
				for (int i = 0; i < vegItems.length; i++) {
					vegItems[i].displayItem();
				}
				break;

			case 2:
				System.out.println("-----------------------------------------------------");
				System.out.println("                    Non-Veg Menu");
				System.out.println("-----------------------------------------------------");
				for (int i = 0; i < nonVegItems.length; i++) {
					nonVegItems[i].displayItem();
				}
				break;

			case 3:
				Order order = new Order();
				boolean ordering = true;

				while (ordering) {
					System.out.println("\nSelect item (1-4 Veg, 5-8 Non-Veg, 0 Finish):");
					int itemChoice = input.nextInt();

					if (itemChoice == 0) {
						ordering = false;
						break;
					}

					switch (itemChoice) {
					case 1: order.addItem(v1); break;
					case 2: order.addItem(v2); break;
					case 3: order.addItem(v3); break;
					case 4: order.addItem(v4); break;
					case 5: order.addItem(n1); break;
					case 6: order.addItem(n2); break;
					case 7: order.addItem(n3); break;
					case 8: order.addItem(n4); break;
					default:
						System.out.println("Invalid selection.");
					}
				}

				System.out.println("\n1. Confirm Order");
				System.out.println("2. Cancel Order");
				System.out.print("Enter choice: ");
				int orderChoice = input.nextInt();

				if (orderChoice == 1) {
					order.placeOrder();
				} else if (orderChoice == 2) {
					order.cancelOrder();
				} else {
					System.out.println("Invalid option.");
				}
				break;

			case 4:
				running = false;
				System.out.println("=====================================================");
				System.out.println("          THANK YOU FOR USING FOODLOOP");
				System.out.println("=====================================================");
				break;

			default:
				System.out.println("Invalid choice.");
			}
		}

		input.close();
	}
}
