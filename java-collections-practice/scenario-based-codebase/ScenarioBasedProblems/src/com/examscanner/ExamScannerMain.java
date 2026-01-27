/*ExamScanner – Digital Answer Sheet Validator
Story: In a school, multiple-choice answer sheets are scanned and saved as .csv files. Each
line looks like:
John Doe,A,B,C,D,A,B,C
ExamScanner should:
● Read each line and parse student answers using BufferedReader
● Compare answers with a provided answer key
● Use Generics to work with different subject types (MathAnswerSheet,
ScienceAnswerSheet)
● Use Map<StudentName, Score>, and sort results using a PriorityQueue
● Detect formatting issues using Regex (e.g., extra/missing commas, invalid options)*/

package com.examscanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ExamScannerMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter CSV file path: ");
		String filePath = input.nextLine();

		System.out.print("Enter answer key (comma separated): ");
		String keyLine = input.nextLine();

		List<String> answerKey = Arrays.asList(keyLine.split(","));

		AnswerSheetValidator validator = new AnswerSheetValidator(answerKey);

		Map<String, Integer> studentScores = new HashMap<>();
		List<String> invalidSheets = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;

			while ((line = br.readLine()) != null) {

				// Regex-based CSV format validation
				if (!validator.isValidCSVFormat(line)) {
					invalidSheets.add(line);
					continue;
				}

				String[] parts = line.split(",");

				String studentName = parts[0].trim();
				List<String> answers = new ArrayList<>();

				for (int i = 1; i < parts.length; i++) {
					answers.add(parts[i].trim());
				}

				// Regex-based answer validation
				if (validator.hasFormattingIssues(answers)) {
					invalidSheets.add(studentName);
					continue;
				}

				// Generic AnswerSheet with subject type
				AnswerSheet<String> sheet = new AnswerSheet<>(studentName, answers, "Math");

				int score = validator.computeScore(sheet.getAnswers());
				studentScores.put(studentName, score);
			}

		} catch (IOException e) {
			System.out.println("File error: " + e.getMessage());
			return;
		}

		PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(new ScoreComparator());

		pq.addAll(studentScores.entrySet());

		System.out.println("\nStudent Scores:");
		while (!pq.isEmpty()) {
			Map.Entry<String, Integer> entry = pq.poll();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		if (!invalidSheets.isEmpty()) {
			System.out.println("\nInvalid Answer Sheets:");
			for (String s : invalidSheets) {
				System.out.println(s);
			}
		}
	}
}
