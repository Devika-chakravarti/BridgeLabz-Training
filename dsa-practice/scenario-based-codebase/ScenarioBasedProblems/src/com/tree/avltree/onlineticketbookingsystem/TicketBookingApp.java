/* Story: Online Ticket Booking by Time
Users book event tickets sorted by event time.
Scenarios:
● 🔹 Scenario 1: Insert Event — Add new event based on start time.
● 🔹 Scenario 2: Cancel Event — Admin deletes a cancelled event.
● 🔹 Scenario 3: Show Events in Order — Display events in upcoming order.
 * */

package com.tree.avltree.onlineticketbookingsystem;

import java.util.Scanner;

public class TicketBookingApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		EventAVL avl = new EventAVL();
		Event root = null;

		while (true) {
			System.out.println("\n1.Add Event\n2.Cancel Event\n3.Show Events\n4.Exit");
			int choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Event Time: ");
				int time = input.nextInt();
				input.nextLine();
				System.out.print("Enter Event Name: ");
				String name = input.nextLine();
				root = avl.insert(root, time, name);
				break;

			case 2:
				System.out.print("Enter Event Time to Cancel: ");
				int del = input.nextInt();
				root = avl.delete(root, del);
				break;

			case 3:
				System.out.println("Upcoming Events:");
				avl.display(root);
				break;

			case 4:
				return;
			}
		}
	}
}
