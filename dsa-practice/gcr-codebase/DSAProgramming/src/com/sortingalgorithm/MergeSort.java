/*  Problem Statement:
A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices
in ascending order.
*/

/*  Merge Sort
Merge Sort divides the array into halves, sorts each half recursively, and merges the sorted halves
into a single sorted array.
*/

package com.sortingalgorithm;

import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {

	static void mergeSort(int[] prices, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(prices, left, mid);
			mergeSort(prices, mid + 1, right);

			merge(prices, left, mid, right);
		}
	}

	static void merge(int[] prices, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = prices[left + i];
		}

		for (int j = 0; j < n2; j++) {
			R[j] = prices[mid + 1 + j];
		}

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				prices[k] = L[i];
				i++;
			} else {
				prices[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			prices[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			prices[k] = R[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of books: ");
		int n = input.nextInt();

		int[] prices = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter price of book " + (i + 1) + ": ");
			prices[i] = input.nextInt();
		}

		mergeSort(prices, 0, n - 1);
		System.out.println("\nSorted prices: " + Arrays.toString(prices));

		input.close();
	}
}
