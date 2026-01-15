/* Scenario-based: 1
 * 
 * HospitalQueue – Patient Sorting by Criticality (Bubble Sort)
Story: At Apollo Hospital, patients in the ER are initially listed by arrival time. However, before
assigning beds, the staff wants to sort them by criticality level (1–10). Since the list is usually
small (10–20 patients), Bubble Sort is used to quickly sort patients in-place without using extra
memory.
Key Concepts:
● Bubble Sort for small datasets
● In-place comparison
● Swapping adjacent patient records
*/

package com.sorting.hospitalqueue;

import java.util.Scanner;

public class HospitalQueue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("================================================");
		System.out.println("      Apollo Hospital - ER Patient Sorting");
		System.out.println("================================================\n");

		System.out.print("Enter number of patients: ");
		int n = input.nextInt();
		input.nextLine();

		Patient[] patients = new Patient[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nPatient " + (i + 1));
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Arrival Time (HHMM): ");
			int arrival = input.nextInt();
			System.out.print("Criticality (1-10): ");
			int critical = input.nextInt();
			input.nextLine();

			patients[i] = new Patient(name, arrival, critical);
		}

		// Bubble Sort based on criticality (descending)
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (patients[j].criticality < patients[j + 1].criticality) {
					Patient temp = patients[j];
					patients[j] = patients[j + 1];
					patients[j + 1] = temp;
				}
			}
		}

		System.out.println("\nSorted Patient List (High to Low Criticality):");
		for (int i = 0; i < n; i++) {
			patients[i].show();
		}

		input.close();
	}
}
