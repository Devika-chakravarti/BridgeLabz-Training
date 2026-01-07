package com.searchingalgorithmandother.challengeproblemtwo;

import java.util.Arrays;
import java.util.Scanner;

public class LinearBinaryChallenge {

	public static int firstMissingPositive(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
				int temp = arr[arr[i] - 1];
				arr[arr[i] - 1] = arr[i];
				arr[i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] != i + 1) {
				return i + 1;
			}
		}

		return n + 1;
	}

	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (arr[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = input.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers (can include positive and negative numbers):");
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		int missing = firstMissingPositive(Arrays.copyOf(arr, arr.length));
		System.out.println("\nFirst missing positive integer: " + missing);

		Arrays.sort(arr);
		System.out.println("\nSorted array for Binary Search: " + Arrays.toString(arr));

		System.out.print("Enter the target number to find its index: ");
		int target = input.nextInt();

		int index = binarySearch(arr, target);
		if (index == -1) {
			System.out.println("Target " + target + " not found in the array.");
		} else {
			System.out.println("Target " + target + " found at index: " + index);
		}

		input.close();
	}
}
