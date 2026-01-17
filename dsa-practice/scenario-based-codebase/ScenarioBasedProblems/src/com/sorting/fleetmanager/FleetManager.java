/* Scenario-based: 10
 * 
 * FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: A fleet company schedules vehicle maintenance based on mileage. Each depot sends a
sorted list of vehicles. To create a master schedule, Merge Sort is used to combine these depot
lists efficiently.
Key Concepts:
● Sorted sublists from multiple sources
● Merge sort for final master list
● Efficient memory usage for large lists
*/

package com.sorting.fleetmanager;

import java.util.Scanner;

public class FleetManager {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("====================================================");
		System.out.println("    FleetManager – Vehicle Maintenance Scheduler");
		System.out.println("====================================================\n");

		System.out.print("Enter the number of vehicles: ");
		int numberOfVehicles = input.nextInt();

		System.out.print("Enter vehicles per depot: ");
		int perDepot = input.nextInt();

		Vehicle[] allVehicles = new Vehicle[numberOfVehicles * perDepot];
		int index = 0;

		for (int i = 1; i <= numberOfVehicles; i++) {
			System.out.println("\nDepot " + i + " Data:");
			input.nextLine();

			for (int j = 1; j <= perDepot; j++) {
				System.out.print("Vehicle ID: ");
				int vehicleID = input.nextInt();

				System.out.print("Vehicle name: ");
				String vehicleName = input.next();

				System.out.print("Mileage: ");
				int mileage = input.nextInt();

				allVehicles[index++] = new Vehicle(index, vehicleName, mileage);
			}
		}
		FleetManagerMerge.mergeSort(allVehicles, 0, allVehicles.length - 1);
		System.out.println("\nVehicle maintenance scheduler (based on mileage): ");
		int level = 1;
		for (int i = 0; i < allVehicles.length; i++) {
			System.out.println("Level " + level++ + " | Vehicle name " + allVehicles[i].vehicleName + " | Mileage: "
					+ allVehicles[i].mileage);
		}
	}
}
