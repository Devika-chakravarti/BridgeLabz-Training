/*  Problem Statement:
A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the
employee IDs in ascending order.
*/


/*  Insertion Sort
Insertion Sort works by building a sorted portion of the array one element at a time by picking an element and
inserting it at the correct position within the sorted portion.
*/

package com.sortingalgorithm;

import java.util.*;

public class InsertionSort {

	public static void insertionSort(int[] employeeID) {
		int n = employeeID.length;
		for (int i = 1; i < n; i++) {
			int key = employeeID[i];
			int j = i - 1;
			// Move elements that are greater than key to one position ahead
			while (j >= 0 && employeeID[j] > key) {
				employeeID[j + 1] = employeeID[j];
				j--;
			}
			employeeID[j + 1] = key;
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int numberOfEmployees = input.nextInt();

		System.out.println("\nEnter the employee IDs:");
		int[] employeeID = new int[numberOfEmployees];
		for (int i = 0; i < numberOfEmployees; i++) {
			System.out.print("Enter the employee " + (i + 1) + " ID:");
			employeeID[i] = input.nextInt();
		}
		System.out.println();

		insertionSort(employeeID);
		System.out.println(Arrays.toString(employeeID));
		
		input.close();

	}

}
