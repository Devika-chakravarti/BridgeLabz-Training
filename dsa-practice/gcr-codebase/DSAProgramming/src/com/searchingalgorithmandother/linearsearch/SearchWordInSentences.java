package com.searchingalgorithmandother.linearsearch;

import java.util.Scanner;

public class SearchWordInSentences {

	public static String findSentence(String[] sentences, String word) {
		for (int i = 0; i < sentences.length; i++) {
			if (sentences[i].contains(word)) {
				return sentences[i];
			}
		}
		return "Not Found";
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of sentences: ");
		int n = input.nextInt();
		input.nextLine();

		String[] sentences = new String[n];
		for (int i = 0; i < n; i++) {
			sentences[i] = input.nextLine();
		}

		System.out.print("Enter word to search: ");
		String word = input.nextLine();

		String result = findSentence(sentences, word);
		System.out.println(result);

		input.close();
	}
}
