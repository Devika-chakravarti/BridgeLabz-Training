/*  Problem Statement:
A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement 
Counting Sort for this task.
*/

/*  Counting Sort
Counting Sort is a sorting algorithm that counts the frequency of each element and places them in 
the correct position using cumulative counts.
*/

package com.sortingalgorithm;

import java.util.Scanner;
import java.util.Arrays;

public class CountingSort {

	static int[] countingSort(int[] ages) {
		int min = 10;
		int max = 18;

		int[] count = new int[max - min + 1];
		int[] output = new int[ages.length];

		for (int i = 0; i < ages.length; i++) {
			count[ages[i] - min]++;
		}

		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}

		for (int i = ages.length - 1; i >= 0; i--) {
			int age = ages[i];
			output[count[age - min] - 1] = age;
			count[age - min]--;
		}

		return output;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = input.nextInt();

		int[] ages = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter age of student " + (i + 1) + ": ");
			ages[i] = input.nextInt();
		}

		int[] sortedAges = countingSort(ages);
		System.out.println("\nSorted ages: " + Arrays.toString(sortedAges));

		input.close();
	}
}
