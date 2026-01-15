/* Scenario-based: 4
 * 
 * EventManager – Ticket Price Optimizer (Quick Sort)
 * Story: An event booking portal sorts millions of tickets by price
 * before showing the cheapest or most expensive tickets.
 * Since data is unsorted and speed is crucial, Quick Sort is used.
 * Key Concepts:
 * ● Fast average time
 * ● Recursive partitioning
 * ● Ideal for large, random datasets
 */

package com.sorting.eventmanager;

import java.util.Scanner;

public class EventManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("     EventManager - Ticket Price Optimizer");
		System.out.println("==============================================\n");

		System.out.print("Enter number of tickets: ");
		int n = input.nextInt();

		Ticket[] tickets = new Ticket[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nTicket " + (i + 1));
			System.out.print("Event Name: ");
			input.nextLine();
			String event = input.nextLine();
			System.out.print("Price: ");
			double price = input.nextDouble();

			tickets[i] = new Ticket(event, price);
		}

		quickSort(tickets, 0, n - 1);

		System.out.println("\nTickets Sorted by Price (Low to High):");
		for (int i = 0; i < n; i++) {
			tickets[i].show();
		}

		input.close();
	}

	// Quick Sort using partitioning
	static void quickSort(Ticket[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			quickSort(arr, low, p - 1);
			quickSort(arr, p + 1, high);
		}
	}

	static int partition(Ticket[] arr, int low, int high) {
		double pivot = arr[high].price;
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j].price <= pivot) {
				i++;
				Ticket temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		Ticket temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}
}
