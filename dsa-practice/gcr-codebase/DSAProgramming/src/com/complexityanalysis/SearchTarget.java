package com.complexityanalysis;

import java.util.Arrays;

public class SearchTarget {

	// Linear Search
	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	// Binary Search (array must be sorted)
	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] datasetSizes = { 1000, 10000, 1000000 };

		// Using normal for loop
		for (int i = 0; i < datasetSizes.length; i++) {

			int size = datasetSizes[i];

			// Create dataset
			int[] data = new int[size];
			for (int j = 0; j < size; j++) {
				data[j] = j;
			}

			int target = size - 1; // Worst-case scenario

			// Linear Search timing
			long startLinear = System.nanoTime();
			linearSearch(data, target);
			long endLinear = System.nanoTime();

			// Sort for Binary Search
			Arrays.sort(data);

			// Binary Search timing
			long startBinary = System.nanoTime();
			binarySearch(data, target);
			long endBinary = System.nanoTime();

			long linearTime = endLinear - startLinear;
			long binaryTime = endBinary - startBinary;

			System.out.println("Dataset Size: " + size);
			System.out.println("Linear Search Time (ns): " + linearTime);
			System.out.println("Binary Search Time (ns): " + binaryTime);
			System.out.println("-----------------------------------");
		}
	}
}
