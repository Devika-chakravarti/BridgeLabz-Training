/* EduResults – Rank Sheet Generator (Merge Sort)
Story: An educational board compiles marks of thousands of students from different districts.
Each district submits a sorted list of students by score. The main server needs to merge and
sort all these lists into a final state-wise rank list. Merge Sort ensures efficiency and maintains
stability for duplicate scores.
Concepts Involved:
● Merge Sort
● Merging sorted sublists
● Large datasets with stable sorting
*/

package com.sorting.eduresults;

import java.util.Scanner;

public class EduResults {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("      EduResults – Rank Sheet Generator");
		System.out.println("==============================================\n");

		// Take input for number of districts
		System.out.print("Enter the number of Districts: ");
		int numberOfDistricts = input.nextInt();

		// Take input for number of students per district
		System.out.print("\nEnter students per district: ");
		int perDistrict = input.nextInt();

		// allStudents array that stores all students data in the form of object from different districts
		Student[] allStudents = new Student[numberOfDistricts * perDistrict];
		int index = 0;

		for (int d = 1; d <= numberOfDistricts; d++) {
			System.out.println("\nDistrict " + d + " data:");
			input.nextLine();

			for (int s = 1; s <= perDistrict; s++) {
				System.out.print("Student name: ");
				String name = input.nextLine();

				System.out.print("Score: ");
				int score = input.nextInt();
				input.nextLine();

				allStudents[index++] = new Student(index, name, score, "District: " + d);
			}
		}

		EduResultsMergeSort.mergeSort(allStudents, 0, allStudents.length - 1);

		System.out.println("\nState-wise rank list:");
		int rank = 1;
		for (int i = 0; i < allStudents.length; i++) {
			System.out.println("Rank " + rank++ + " | " + allStudents[i].name + " | Score: " + allStudents[i].getScore()
					+ " | " + allStudents[i].numberOfDistricts);
		}
	}
}
