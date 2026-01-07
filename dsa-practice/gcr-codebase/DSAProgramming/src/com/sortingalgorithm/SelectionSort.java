/*  Problem Statement:
A university needs to sort students’ exam scores in ascending order. Implement Selection
Sort to achieve this.
*/

/*  Selection Sort
Selection Sort repeatedly finds the minimum element from the unsorted part and swaps it 
with the first unsorted element.
*/

package com.sortingalgorithm;

import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {

	static void selectionSort(int[] scores) {
		int n = scores.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < n; j++) {
				if (scores[j] < scores[minIndex]) {
					minIndex = j;
				}
			}

			int temp = scores[minIndex];
			scores[minIndex] = scores[i];
			scores[i] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = input.nextInt();

		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter score of student " + (i + 1) + ": ");
			scores[i] = input.nextInt();
		}

		selectionSort(scores);
		System.out.println("\nSorted scores: " + Arrays.toString(scores));

		input.close();
	}
}
