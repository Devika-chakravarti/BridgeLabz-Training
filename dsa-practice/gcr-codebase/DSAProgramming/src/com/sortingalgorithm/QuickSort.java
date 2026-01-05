/*  Problem Statement:
An e-commerce company wants to display product prices in ascending order. Implement
Quick Sort to sort the product prices.
 */

/*  Quick Sort (Divide and Conquer)
Quick Sort is another Divide and Conquer algorithm that selects a pivot element,
partitions the array around it, and recursively sorts the left and right sub-arrays.
*/

package com.sortingalgorithm;

import java.util.*;

public class QuickSort {
	public static void quickSort(double[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	private static int partition(double[] arr, int low, int high) {
		double pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;

				double temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		double temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int numberOfProducts = input.nextInt();

		double[] prices = new double[numberOfProducts];
		System.out.println("\nEnter the prices of products:");
		for (int i = 0; i < numberOfProducts; i++) {
			System.out.print("Enter the price of Product " + (i + 1) + ": ");
			prices[i] = input.nextDouble();
		}

		quickSort(prices, 0, prices.length - 1);
		System.out.println(Arrays.toString(prices));

		input.close();
	}

}
