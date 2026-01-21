/*MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
Story: A pharmaceutical warehouse handles medicine records from multiple branches, each
sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge Sort
to compile all expiry dates and alert if any medicine is nearing expiration.
Concepts Involved:
● Merge Sort
● Sorted sublist merging
● Critical for time-sensitive inventory*/

package com.sorting.medwarehouse;

import java.util.Scanner;

public class MedWarehouse {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("================================================");
		System.out.println("   MedWarehouse – Sorting Medicines by Expiry");
		System.out.println("================================================\n");

		System.out.print("Enter the number of pharmaceutical warehouse: ");
		int numberOfWarehouse = input.nextInt();

		System.out.print("Enter the number of branches per warehouse: ");
		int perWarehouse = input.nextInt();

		Medicines[] allMedicines = new Medicines[numberOfWarehouse * perWarehouse];

		int index = 0;

		for (int i = 1; i <= numberOfWarehouse; i++) {
			System.out.println("\nPharmaceutical warehouse " + i + " data: ");
			input.nextLine();

			for (int j = 1; j <= perWarehouse; j++) {
				System.out.print("Enter the Medicine name: ");
				String name = input.nextLine();

				System.out.print("Enter the expiry date (YYYYMMDD): ");
				int expiryDate = input.nextInt();
				input.nextLine();

				allMedicines[index++] = new Medicines(name, expiryDate);
			}
		}
		MedWarehouseMergeSort.mergeSort(allMedicines, 0, allMedicines.length - 1);
		System.out.println("\nMedicines are sorted based on expiry date:");
		System.out.println("------------------------------------------------");
		for (int i = 0; i < allMedicines.length; i++) {
			System.out.println(
					"Medicine name: " + allMedicines[i].name + " | Expriy date: " + allMedicines[i].expiryDate);
		}

	}
}
