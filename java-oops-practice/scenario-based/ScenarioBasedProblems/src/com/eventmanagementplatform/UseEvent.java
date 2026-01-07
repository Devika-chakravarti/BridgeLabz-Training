package com.eventmanagementplatform;

import java.util.Scanner;

public class UseEvent {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Event event = null;

		System.out.println("========================================");
		System.out.println("        WELCOME TO EVENTEASE");
		System.out.println("========================================");

		System.out.print("Enter Organizer Name      : ");
		String name = input.nextLine();
		System.out.print("Enter Email               : ");
		String email = input.nextLine();
		System.out.print("Enter Phone               : ");
		String phone = input.nextLine();

		System.out.println("----------------------------------------");
		System.out.println("\nOrganizer details:");
		User user = new User(name, email, phone);
		user.displayUser();

		int option;
		do {
			System.out.println("\n========================================");
			System.out.println("            MAIN MENU");
			System.out.println("========================================");
			System.out.println("1. Schedule Event");
			System.out.println("2. Reschedule Event");
			System.out.println("3. Cancel Event");
			System.out.println("4. View Event Details");
			System.out.println("5. Exit");
			System.out.println("----------------------------------------");
			System.out.print("Choose Option (1-5)       : ");
			option = input.nextInt();
			input.nextLine();

			switch (option) {

			case 1:
				if (event != null && event.isScheduled()) {
					System.out.println("An event is already scheduled.");
					break;
				}

				System.out.println("Select Event Type");
				System.out.println("1. Birthday Event");
				System.out.println("2. Conference Event");
				System.out.print("Choice : ");
				int type = input.nextInt();
				input.nextLine();

				System.out.print("Enter Event Name          : ");
				String eventName = input.nextLine();
				System.out.print("Enter Location            : ");
				String location = input.nextLine();
				System.out.print("Enter Date (DDMMYY)       : ");
				int date = input.nextInt();
				System.out.print("Enter Number of Attendees : ");
				int attendees = input.nextInt();

				if (type == 1)
					event = new BirthdayEvent(eventName, location, date, attendees);
				else
					event = new ConferenceEvent(eventName, location, date, attendees);

				event.schedule();
				break;

			case 2:
				if (event == null || !event.isScheduled()) {
					System.out.println("No event scheduled to reschedule.");
				} else if (event.isCancelled()) {
					System.out.println("Event is cancelled. Cannot reschedule.");
				} else {
					event.reschedule();
				}
				break;

			case 3:
				if (event == null || !event.isScheduled()) {
					System.out.println("No event scheduled to cancel.");
				} else if (event.isCancelled()) {
					System.out.println("Event is already cancelled.");
				} else {
					event.cancel();
				}
				break;

			case 4:
				if (event == null || !event.isScheduled()) {
					System.out.println("No event details available.");
				} else if (event.isCancelled()) {
					System.out.println("Event is cancelled. No details available.");
				} else {
					event.displayEventDetails();
				}
				break;

			case 5:
				break;

			default:
				System.out.println("Invalid option.");
			}

		} while (option != 5);

		System.out.println("\n========================================");
		System.out.println("      THANK YOU FOR USING EVENTEASE");
		System.out.println("========================================");

		input.close();
	}
}
