/* Scenario-based: 5
 * 
 * ExamCell – Student Rank Generator (Merge Sort)
 * Story: An online exam system collects scores from multiple test centers.
 * To publish a state-level rank list, student scores are merged and sorted
 * using Merge Sort, ensuring performance and accuracy.
 * Key Concepts:
 * ● Merging center-wise data
 * ● Sorting across centers
 * ● Efficient for large datasets
 */

package com.sorting.examcell;

import java.util.Scanner;

public class ExamCell {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("     ExamCell – Student Rank Generator");
		System.out.println("==============================================\n");

		System.out.print("Enter number of centers: ");
		int centers = input.nextInt();

		System.out.print("Enter students per center: ");
		int perCenter = input.nextInt();

		Student[] allStudents = new Student[centers * perCenter];
		int index = 0;

		for (int c = 1; c <= centers; c++) {
			System.out.println("\nCenter " + c + " Data:");
			input.nextLine();

			for (int s = 1; s <= perCenter; s++) {
				System.out.print("Student Name: ");
				String name = input.nextLine();

				System.out.print("Score: ");
				int score = input.nextInt();
				input.nextLine();

				allStudents[index++] = new Student(index, name, score, "Center-" + c);
			}
		}

		// Merge Sort for State Rank List
		ExamCellMergeSort.mergeSort(allStudents, 0, allStudents.length - 1);

		System.out.println("\nState Level Rank List:");
		int rank = 1;
		for (int i = 0; i < allStudents.length; i++) {
			System.out.println("Rank " + rank++ + " | " + allStudents[i].name + " | Score: " + allStudents[i].score
					+ " | " + allStudents[i].center);
		}

		input.close();
	}
}
