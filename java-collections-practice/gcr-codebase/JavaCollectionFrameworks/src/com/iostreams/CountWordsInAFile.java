/*Count Words in a File
📌 Problem Statement:
Write a Java program that counts the number of words in a given text file and displays the top 5 most frequently occurring words.
Requirements:
Use FileReader and BufferedReader to read the file.
Use a HashMap<String, Integer> to count word occurrences.
Sort the words based on frequency and display the top 5.
*/

package com.iostreams;

import java.io.*;
import java.util.*;

public class CountWordsInAFile {

	public static void main(String[] args) {

		File file = new File("input.txt");

		if (!file.exists()) {
			System.out.println("File does not exist");
			return;
		}

		// Store word frequencies
		Map<String, Integer> wordCount = new HashMap<>();

		try (	// Read file efficiently
				BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;

			// Read file line by line
			while ((line = br.readLine()) != null) {

				// Split line into words
				String[] words = line.toLowerCase().split("\\W+");

				for (String word : words) {
					if (!word.isEmpty()) {
						wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Sort words by frequency
		List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());

		sortedList.sort((a, b) -> b.getValue() - a.getValue());

		// Display top 5 frequent words
		System.out.println("Top 5 most frequent words:");
		for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
			System.out.println(sortedList.get(i).getKey() + " : " + sortedList.get(i).getValue());
		}
	}
}
