/* Story: University's Digital Record System
The university needs an efficient way to manage student records searchable by roll number.
Scenarios:
● 🔹 Scenario 1: Insertion — As students enroll, insert their roll numbers with personal
details.
● 🔹 Scenario 2: Deletion — If a student leaves, remove their record.
● 🔹 Scenario 3: Search & Display — A professor wants a sorted list of student roll
numbers for attendance.
 * */

package com.tree.binarysearchtree.universitydigitalrecordsystem;

import java.util.Scanner;

public class UniversityBSTApp {

	public static void main(String[] args) {
		StudentBST bst = new StudentBST();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("\n=============================================");
			System.out.println("   WELCOME TO OUR UNIVERSITY RECORD SYSTEM");
			System.out.println("=============================================\n");
			System.out.println("1. Insert Student");
			System.out.println("2. Delete Student");
			System.out.println("3. Search Student");
			System.out.println("4. Display All Students (Sorted)");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Roll Number: ");
				int roll = input.nextInt();
				input.nextLine();
				System.out.print("Enter Name: ");
				String name = input.nextLine();
				System.out.print("Enter Department: ");
				String dept = input.nextLine();
				bst.insert(new Student(roll, name, dept));
				break;
			case 2:
				System.out.print("Enter Roll Number to delete: ");
				int delRoll = input.nextInt();
				input.nextLine();
				bst.delete(delRoll);
				break;
			case 3:
				System.out.print("Enter Roll Number to search: ");
				int searchRoll = input.nextInt();
				input.nextLine();
				Student s = bst.search(searchRoll);
				if (s != null)
					System.out.println("Found: " + s);
				else
					System.out.println("Student not found.");
				break;
			case 4:
				bst.displaySorted();
				break;
			case 5:
				System.out.println("\n=============================================");
				System.out.println("          THANK YOU FOR USING SYSTEM");
				System.out.println("=============================================");
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
