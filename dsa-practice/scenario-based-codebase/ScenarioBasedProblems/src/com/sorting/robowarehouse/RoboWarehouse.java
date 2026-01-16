/* Scenarip-based: 6
 * 
 * RoboWarehouse – Shelf Loading Robot (Insertion Sort)
Story: A robot loads packages onto shelves based on weight. It adds one package at a time
and must maintain an ascending order by weight for balance. Insertion Sort helps since new
items are inserted into the sorted list dynamically.
Key Concepts:
● Insertion into sorted lists
● Low memory footprint
● Ideal for streaming insertions
 * */

package com.sorting.robowarehouse;

import java.util.Scanner;

public class RoboWarehouse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("     RoboWarehouse – Shelf Loading Robot");
		System.out.println("==============================================\n");

		System.out.print("Enter number of packages: ");
		int numberOfPackages = input.nextInt();
		input.nextLine();

		Packages[] packages = new Packages[numberOfPackages];

		for (int i = 0; i < numberOfPackages; i++) {
			System.out.println("\nPackages " + (i + 1));
			System.out.print("Package ID: ");
			int packageID = input.nextInt();
			System.out.print("Weight: ");
			double weight = input.nextDouble();

			packages[i] = new Packages(packageID, weight);

			for(int j=i;j>0;j--) {
				if(packages[j].weight < packages[j - 1].weight){
					Packages temp = packages[j];
					packages[j] = packages[j-1];
					packages[j-1]=temp;
				}else {
					break;
				}
			}
		}
		System.out.println("\nWeight of packages (Ascending order):");
		for(int i=0;i<numberOfPackages;i++) {
			packages[i].display();
		}
		
		input.close();
	}
}
