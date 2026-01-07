package com.searchingalgorithmandother.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCountInFile {

	public static int countWord(String filePath, String target) {
		int count = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (int i = 0; i < words.length; i++) {
					if (words[i].equals(target)) {
						count++;
					}
				}
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter file path: ");
		String filePath = input.nextLine();

		System.out.print("Enter word to count: ");
		String targetWord = input.nextLine();

		int occurrences = countWord(filePath, targetWord);
		System.out.println("The word '" + targetWord + "' appears " + occurrences + " times in the file.");
		input.close();
	}
}
