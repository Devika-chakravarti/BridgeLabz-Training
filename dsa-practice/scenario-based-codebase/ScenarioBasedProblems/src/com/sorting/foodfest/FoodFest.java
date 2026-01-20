/* FoodFest – Sorting Stalls by Customer Footfall (Merge Sort)
Story: At a multi-day food festival, organizers track footfall at every stall each day. They collect
daily logs from all zones (already sorted by count), and use Merge Sort to combine zone-wise
data into a master list for performance evaluation.
Concepts Involved:
● Merge Sort
● Combining multiple sorted datasets
● Stability in data with equal values
 * */

package com.sorting.foodfest;

import java.util.Scanner;

public class FoodFest {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("========================================================");
		System.out.println("     FoodFest – Sorting Stalls by Customer Footfall");
		System.out.println("========================================================\n");

		System.out.print("Enter the number of zones: ");
		int numberOfZones = input.nextInt();

		System.out.print("Enter stalls per zone: ");
		int perZone = input.nextInt();
		System.out.println("--------------------------------------------------------");

		FoodStall[] allStalls = new FoodStall[numberOfZones * perZone];
		int index = 0;

		for (int i = 1; i <= numberOfZones; i++) {
			System.out.println("\nZone " + i + " Data:");
			input.nextLine();

			for (int j = 1; j <= perZone; j++) {
				System.out.print("Enter the stall ID: ");
				int stallId = input.nextInt();
				System.out.print("Enter the stall name: ");
				String stallName = input.nextLine();
				input.nextLine();
				System.out.print("Enter the number of customers: ");
				int customers = input.nextInt();

				allStalls[index++] = new FoodStall(stallId, stallName, customers);
			}
		}
		FoodFestManager.mergeSort(allStalls, 0, allStalls.length - 1);
		System.out.println("\nOrganizers track footfall (in descending order):");
		System.out.println("--------------------------------------------------------");
		int level = 1;
		for (int i = 0; i < allStalls.length; i++) {
			System.out.println("Level: " + level++ + " | Stall ID: " + allStalls[i].stallId + " | Customers: "
					+ allStalls[i].customers);
		}
	}
}
