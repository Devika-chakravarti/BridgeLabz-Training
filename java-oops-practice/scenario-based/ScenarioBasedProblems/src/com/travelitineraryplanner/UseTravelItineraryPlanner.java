package com.travelitineraryplanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseTravelItineraryPlanner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		List<Activity> domesticActivities = new ArrayList<>();
		domesticActivities.add(new Activity("Sightseeing", 1000));
		domesticActivities.add(new Activity("Adventure Park", 500));

		List<Activity> internationalActivities = new ArrayList<>();
		internationalActivities.add(new Activity("City Tour", 3000));
		internationalActivities.add(new Activity("Museum Visit", 1500));

		Trip domesticTrip = new DomesticTrip("Goa", 5, new Transport("Bus", 2000), new Hotel("Sea View Hotel", 1500, 5),
				domesticActivities);

		Trip internationalTrip = new InternationalTrip("Paris", 7, new Transport("Flight", 35000),
				new Hotel("Paris Grand Hotel", 8000, 7), internationalActivities);

		boolean running = true;
		while (running) {
			System.out.println("======================================");
			System.out.println("       WELCOME TO TOURMATE");
			System.out.println("======================================");
			System.out.println("1. View Domestic Trip");
			System.out.println("2. View International Trip");
			System.out.println("3. Book Domestic Trip");
			System.out.println("4. Book International Trip");
			System.out.println("5. Cancel Domestic Trip");
			System.out.println("6. Cancel International Trip");
			System.out.println("7. Exit");
			System.out.print("Enter choice: ");

			int choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\nDomestic Trip Details:");
				System.out.println("--------------------------------------");
				domesticTrip.showTripDetails();
				break;
			case 2:
				System.out.println("\nInternational Trip Details:");
				System.out.println("--------------------------------------");
				internationalTrip.showTripDetails();
				break;
			case 3:
				((IBookable) domesticTrip).book();
				break;
			case 4:
				((IBookable) internationalTrip).book();
				break;
			case 5:
				((IBookable) domesticTrip).cancel();
				break;
			case 6:
				((IBookable) internationalTrip).cancel();
				break;
			case 7:
				running = false;
				break;
			default:
				System.out.println("Invalid choice.");
			}

			System.out.println();
		}

		System.out.println("======================================");
		System.out.println("    THANK YOU FOR USING TOURMATE");
		System.out.println("======================================");

		input.close();
	}
}
