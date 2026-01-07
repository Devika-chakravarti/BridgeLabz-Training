package com.searchingalgorithmandother.stringbuilder;

import java.util.Scanner;

public class ReverseString {

	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		String reversed = reverseString(str);
		System.out.println("Reversed string: " + reversed);
		input.close();
	}
}
