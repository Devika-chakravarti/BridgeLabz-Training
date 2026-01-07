package com.searchingalgorithmandother.linearsearch;

import java.util.Scanner;

public class FirstNegativeNumber {

	public static int findFirstNegative(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n = input.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		int index = findFirstNegative(arr);
		System.out.println(index);

		input.close();
	}
}
