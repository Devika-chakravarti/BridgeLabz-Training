/* FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: A fitness app tracks steps taken by each user in a small group (less than 20 people). At
the end of the day, it displays rankings. Since the list is small and frequently shuffled due to
last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
● Bubble Sort
● Frequent updates
● Real-time re-sorting
 * */

package com.sorting.fitnesstracker;

import java.util.Scanner;

public class FitnessTracker {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("====================================================");
		System.out.println("     FitnessTracker – Daily Step Count Ranking");
		System.out.println("====================================================\n");

		// Take input number of people
		System.out.print("Enter the number of people: ");
		int numberOfPeople = input.nextInt();

		// Take number of step counts of all people
		System.out.println("\nStep counts:");
		int[] stepCounts = new int[numberOfPeople];
		for (int i = 0; i < numberOfPeople; i++) {
			System.out.print("Step count of Person " + (i + 1) + ": ");
			stepCounts[i] = input.nextInt();
		}

		/// Bubble sort logic
		for (int i = 0; i < numberOfPeople; i++) {
			for (int j = 0; j < numberOfPeople - i - 1; j++) {
				if (stepCounts[j] > stepCounts[j + 1]) {
					int temp = stepCounts[j];
					stepCounts[j] = stepCounts[j + 1];
					stepCounts[j + 1] = temp;
				}
			}
		}

		// Display the sorted order of steps counts of people
		System.out.println("\nSorted all users step counts(in ascending order):");
		for (int i = 0; i < numberOfPeople; i++) {
			System.out.println("Rank " + (i + 1) + " Step Counts " + stepCounts[i]);
		}
	}
}
