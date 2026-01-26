/*FeedbackGuru – Smart Survey Analyzer
Story: A retail chain collects feedback in plain .txt files where each line contains customer
feedback like:
"Service was amazing. Would rate 9/10. Will visit again."
They want to create a Java tool called FeedbackGuru that:
● Reads all .txt feedback files (IO)
● Uses regex to extract ratings (e.g., 7/10, 9/10)
● Groups feedback into categories (Positive, Neutral, Negative) using Map<String,
List<String>>`
● Uses Generics to allow flexible feedback types (e.g., Product, Service)
● Handles missing/invalid lines gracefully using exception handling*/

package com.feedbackguru;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FeedbackGuruApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter feedback folder path: ");
		String folderPath = input.nextLine();

		FeedbackReader reader = new FeedbackReader();
		List<String> feedbackLines = reader.readFeedbackFiles(folderPath);

		if (feedbackLines.isEmpty()) {
			System.out.println("No feedback data to analyze.");
			return;
		}

		FeedbackType feedbackType = new FeedbackType("Service");

		FeedbackAnalyzer<FeedbackType> analyzer = new FeedbackAnalyzer<>();

		Map<String, List<String>> result = analyzer.analyzeFeedback(feedbackLines, feedbackType);

		displayResult(result);
	}

	private static void displayResult(Map<String, List<String>> result) {

		for (String category : result.keySet()) {
			System.out.println("\n" + category + " Feedback:");
			List<String> feedbacks = result.get(category);

			for (String feedback : feedbacks) {
				System.out.println("- " + feedback);
			}
		}
	}
}
