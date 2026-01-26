/*TravelLog – Trip Organizer for Backpackers
Story: Ritika, a travel blogger, maintains a personal app called TravelLog where she stores all
her travel experiences.
Each trip is stored as a serialized object and saved to disk using ObjectOutputStream. She
wants to search all her entries to find:
● All cities she visited using regex over text
● Trip durations more than 5 days
● Unique countries visited (use Set)
● Top 3 cities she visited most often (use Map<City, Integer> and sort)
The system must support both reading/writing trip entries from files and summarizing them using
Java Collections.*/

package com.travellog;

import java.util.*;

public class TravelLogMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TripSerializer serializer = new TripSerializer();
		TripAnalyzer analyzer = new TripAnalyzer();

		System.out.print("Enter file name to save/load trips: ");
		String fileName = input.nextLine();

		List<Trip> trips = new ArrayList<>();

		System.out.print("Enter number of trips to add: ");
		int n = input.nextInt();
		input.nextLine(); 

		for (int i = 0; i < n; i++) {
			System.out.println("Enter details for trip " + (i + 1));

			System.out.print("City: ");
			String city = input.nextLine();

			System.out.print("Country: ");
			String country = input.nextLine();

			System.out.print("Duration (days): ");
			int duration = input.nextInt();
			input.nextLine(); 

			System.out.print("Notes: ");
			String notes = input.nextLine();

			Trip trip = new Trip(city, country, duration, notes);
			trips.add(trip);
		}

		// Serialize trips to file
		try {
			serializer.writeTrips(fileName, trips);
			System.out.println("Trips saved successfully.");
		} catch (Exception e) {
			System.out.println("Error saving trips: " + e.getMessage());
		}

		// Read trips from file
		List<Trip> loadedTrips = new ArrayList<>();
		try {
			loadedTrips = serializer.readTrips(fileName);
		} catch (Exception e) {
			System.out.println("Error reading trips: " + e.getMessage());
		}

		if (loadedTrips.size() == 0) {
			System.out.println("No trips to analyze.");
			return;
		}

		// Display analysis
		System.out.println("\nAll cities visited:");
		List<String> cities = analyzer.getCities(loadedTrips);
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

		System.out.println("\nTrips longer than 5 days:");
		List<Trip> longTrips = analyzer.getLongTrips(loadedTrips, 5);
		for (int i = 0; i < longTrips.size(); i++) {
			System.out.println(longTrips.get(i));
		}

		System.out.println("\nUnique countries visited:");
		Set<String> countries = analyzer.getUniqueCountries(loadedTrips);
		int count = 1;
		for (String country : countries) {
			System.out.println(count + ". " + country);
			count++;
		}

		System.out.println("\nTop 3 most visited cities:");
		List<String> topCities = analyzer.getTopCities(loadedTrips, 3);
		for (int i = 0; i < topCities.size(); i++) {
			System.out.println((i + 1) + ". " + topCities.get(i));
		}
	}
}
