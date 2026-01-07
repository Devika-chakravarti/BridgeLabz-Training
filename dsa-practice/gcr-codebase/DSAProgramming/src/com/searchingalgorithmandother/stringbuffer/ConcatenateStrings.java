package com.searchingalgorithmandother.stringbuffer;

import java.util.Scanner;

public class ConcatenateStrings {

	public static String concatenateStrings(String[] arr) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
		int n = input.nextInt();
		input.nextLine(); 

		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter string " + (i + 1) + ": ");
			arr[i] = input.nextLine();
		}

		String result = concatenateStrings(arr);
		System.out.println("Concatenated string: " + result);
		input.close();
	}
}
