/* Story: Hospital Queue Management
Patients are sorted by check-in time and balanced for quick lookups.
Scenarios:
● 🔹 Scenario 1: Patient Registration
● 🔹 Scenario 2: Discharge/Delete Record
● 🔹 Scenario 3: Display by Arrival Time
 * */

package com.tree.avltree.hospitalqueuemanagement;

import java.util.Scanner;

public class HospitalMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		HospitalAVL avl = new HospitalAVL();
		PatientNode root = null;

		while (true) {

			System.out.println("\n1.Register Patient");
			System.out.println("2.Discharge Patient");
			System.out.println("3.Display Queue");
			System.out.println("4.Exit");

			int choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Check-in Time: ");
				int time = input.nextInt();
				input.nextLine();
				System.out.print("Enter Patient Name: ");
				String name = input.nextLine();
				root = avl.insert(root, time, name);
				break;

			case 2:
				System.out.print("Enter Check-in Time to Remove: ");
				int removeTime = input.nextInt();
				root = avl.delete(root, removeTime);
				break;

			case 3:
				System.out.println("Patients by Arrival Time:");
				avl.display(root);
				break;

			case 4:
				return;
			}
		}
	}
}
