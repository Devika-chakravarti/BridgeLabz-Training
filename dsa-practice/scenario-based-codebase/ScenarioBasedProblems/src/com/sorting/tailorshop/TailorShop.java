/*TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
Story: At a tailor’s shop, new clothing orders are received every hour. Each order has a
deadline, and the owner maintains a sorted list of orders by delivery date. Since each new
order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
Concepts Involved:
● Insertion Sort
● Real-time updates
● Deadline-based sorting*/

package com.sorting.tailorshop;

import java.util.Scanner;

public class TailorShop {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("======================================================");
		System.out.println("  TailorShop – Sorting Orders by Delivery Deadline");
		System.out.println("======================================================\n");

		System.out.print("Enter the number of orders: ");
		int numberOfOrders = input.nextInt();

		Order[] orders = new Order[numberOfOrders];

		for (int i = 0; i < numberOfOrders; i++) {
			System.out.println("\nOrder " + (i + 1));
			System.out.print("Enter the order Id: ");
			int orderId = input.nextInt();
			input.nextLine();
			System.out.print("Enter delivery date (YYYYMMDD): ");
			int deliveryDate = input.nextInt();

			orders[i] = new Order(orderId, deliveryDate);

			// Insertion sort logic
			for (int j = i; j > 0; j--) {
				if (orders[j].deliveryDate < orders[j - 1].deliveryDate) {
					Order temp = orders[j];
					orders[j] = orders[j - 1];
					orders[j - 1] = temp;
				} else {
					break;
				}
			}
		}
		System.out.println("\nOrders sorted by the delivery date:");
		for (int i = 0; i < numberOfOrders; i++) {
			orders[i].display();
		}
	}
}
