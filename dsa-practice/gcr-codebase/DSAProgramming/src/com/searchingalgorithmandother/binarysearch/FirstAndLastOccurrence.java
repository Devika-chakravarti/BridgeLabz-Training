package com.searchingalgorithmandother.binarysearch;

import java.util.Scanner;

public class FirstAndLastOccurrence {

	public static int findFirst(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int result = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				result = mid;
				right = mid - 1;
			} else if (arr[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return result;
	}

	public static int findLast(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int result = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				result = mid;
				left = mid + 1;
			} else if (arr[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = input.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " sorted elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		System.out.print("Enter the element to search: ");
		int target = input.nextInt();

		int first = findFirst(arr, target);
		int last = findLast(arr, target);

		if (first == -1) {
			System.out.println("The element " + target + " is not present in the array.");
		} else {
			System.out.println("First occurrence of " + target + " is at index: " + first);
			System.out.println("Last occurrence of " + target + " is at index: " + last);
		}

		input.close();
	}
}
