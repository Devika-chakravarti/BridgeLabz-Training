package com.searchingalgorithmandother.binarysearch;

import java.util.Scanner;

public class FindRotationPoint {

	public static int findRotationIndex(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] > arr[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = input.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " elements (rotated sorted array):");
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		int index = findRotationIndex(arr);

		System.out.println();
		System.out.println("Rotation index found at position: " + index);
		System.out.println("Smallest element is: " + arr[index]);

		input.close();
	}
}
