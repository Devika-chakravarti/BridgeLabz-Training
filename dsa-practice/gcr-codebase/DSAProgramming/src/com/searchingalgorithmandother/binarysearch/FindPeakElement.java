package com.searchingalgorithmandother.binarysearch;

import java.util.Scanner;

public class FindPeakElement {

	public static int findPeakIndex(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			boolean leftOk = mid == 0 || arr[mid] > arr[mid - 1];
			boolean rightOk = mid == arr.length - 1 || arr[mid] > arr[mid + 1];

			if (leftOk && rightOk) {
				return mid;
			}

			if (mid > 0 && arr[mid] < arr[mid - 1]) {
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
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		int index = findPeakIndex(arr);

		if (index == -1) {
			System.out.println("No peak element found in the array.");
		} else {
			System.out.println("Peak element found at index: " + index);
			System.out.println("Peak element value: " + arr[index]);
		}

		input.close();
	}
}
