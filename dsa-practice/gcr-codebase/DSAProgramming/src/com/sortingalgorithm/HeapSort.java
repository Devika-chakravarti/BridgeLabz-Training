/*  Problem Statement:
A company receives job applications with different expected salary demands. Implement Heap Sort to 
sort these salary demands in ascending order.
*/

/*  Heap Sort
Heap Sort builds a max heap from the array, repeatedly extracts the largest element, and places 
it at the end to sort the array.
*/

package com.sortingalgorithm;

import java.util.Scanner;
import java.util.Arrays;

public class HeapSort {

	static void heapSort(int[] salaries) {
		int n = salaries.length;

		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(salaries, n, i);
		}

		for (int i = n - 1; i > 0; i--) {
			int temp = salaries[0];
			salaries[0] = salaries[i];
			salaries[i] = temp;

			heapify(salaries, i, 0);
		}
	}

	static void heapify(int[] salaries, int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && salaries[left] > salaries[largest]) {
			largest = left;
		}

		if (right < n && salaries[right] > salaries[largest]) {
			largest = right;
		}

		if (largest != i) {
			int temp = salaries[i];
			salaries[i] = salaries[largest];
			salaries[largest] = temp;

			heapify(salaries, n, largest);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of applicants: ");
		int n = input.nextInt();

		int[] salaries = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter expected salary of applicant " + (i + 1) + ": ");
			salaries[i] = input.nextInt();
		}

		heapSort(salaries);
		System.out.println("\nSorted salaries: " + Arrays.toString(salaries));

		input.close();
	}
}
