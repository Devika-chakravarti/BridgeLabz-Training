/* GeoMeasure Solutions
 * 
 * You're working at GeoMeasure Solutions, a company that builds custom software for civil
engineers and architects. One of their core requirements is to compare line segments on
blueprints to determine if they are of equal length, or which one is longer.
 Problem Statement:
Build a Java application that:
● Allows a user to input the coordinates (x1, y1, x2, y2) of two lines.
● Uses a method to calculate the length of each line.
● Compares the two lengths and prints whether they are equal, or which is longer.
● Uses encapsulation to hide the internal data of each line.
● Uses constructors to initialize line objects.
Bonus: Support multiple line comparisons and store them in a list.
 * */

package com.geomeasuresolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class GeoMeasureApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<LineComparison> history = new ArrayList<>();

		System.out.println("===============================================");
		System.out.println("             GEOMEASURE SOLUTIONS");
		System.out.println("===============================================");

		while (true) {
			System.out.println("\n1. Compare Two Lines");
			System.out.println("2. View Comparison History");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");

			int choice = input.nextInt();

			if (choice == 1) {

				// Input for first line
				System.out.println("\nEnter coordinates for Line 1:");
				System.out.print("x1: ");
				double x1 = input.nextDouble();
				System.out.print("y1: ");
				double y1 = input.nextDouble();
				System.out.print("x2: ");
				double x2 = input.nextDouble();
				System.out.print("y2: ");
				double y2 = input.nextDouble();

				// Input for second line
				System.out.println("\nEnter coordinates for Line 2:");
				System.out.print("x1: ");
				double x3 = input.nextDouble();
				System.out.print("y1: ");
				double y3 = input.nextDouble();
				System.out.print("x2: ");
				double x4 = input.nextDouble();
				System.out.print("y2: ");
				double y4 = input.nextDouble();

				// Creating objects using constructor
				Line line1 = new Line(x1, y1, x2, y2);
				Line line2 = new Line(x3, y3, x4, y4);

				String result = line1.compareWith(line2);

				System.out.println("-----------------------------------------------");
				System.out.println("Comparison Result:");
				System.out.println(result);
				System.out.println("-----------------------------------------------");

				// Storing comparison in history
				history.add(new LineComparison(line1, line2, result));

			} else if (choice == 2) {

				System.out.println("\n-----------------------------------------------");
				System.out.println("Comparison History");

				if (history.size() == 0) {
					System.out.println("No comparisons done yet.");
				} else {
					for (int i = 0; i < history.size(); i++) {
						System.out.println(history.get(i).getResult());
					}
				}

				System.out.println("-----------------------------------------------");

			} else if (choice == 3) {
				System.out.println("\n===============================================");
				System.out.println("   THANK YOU FOR USING GEOMEASURE SOLUTIONS");
				System.out.println("===============================================");
				break;

			} else {
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
