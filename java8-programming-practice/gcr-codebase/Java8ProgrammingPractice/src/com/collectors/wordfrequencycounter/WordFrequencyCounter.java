/*Word Frequency Counter
○ Scenario: Analyze a paragraph for word occurrence.
○ Task: Use Collectors.toMap().*/

package com.collectors.wordfrequencycounter;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
	public static void main(String[] args) {

		String paragraph = "java is easy and java is powerful";

		Map<String, Integer> wordCount = Arrays.stream(paragraph.split("\\s+"))
				.collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));

		System.out.println(wordCount);
	}
}
