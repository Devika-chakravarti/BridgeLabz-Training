package com.searchingalgorithmandother.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	public static String removeDuplicates(String str) {
		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		for (char c : str.toCharArray()) {
			if (!set.contains(c)) {
				sb.append(c);
				set.add(c);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		String result = removeDuplicates(str);
		System.out.println("String after removing duplicates: " + result);
		input.close();
	}
}
