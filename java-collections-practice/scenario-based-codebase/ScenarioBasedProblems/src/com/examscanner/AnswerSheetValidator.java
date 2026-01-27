package com.examscanner;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnswerSheetValidator {

	private List<String> answerKey;

	public AnswerSheetValidator(List<String> answerKey) {
		this.answerKey = answerKey;
	}

	// Regex to detect extra/missing commas (CSV structure)
	public boolean isValidCSVFormat(String line) {

		String regex = "^[A-Za-z ]+(,[A-D]){" + answerKey.size() + "}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(line.trim());

		return matcher.matches();
	}

	// Detect formatting issues using Regex (invalid options)
	public boolean hasFormattingIssues(List<String> answers) {

		Pattern pattern = Pattern.compile("^[A-D]$");

		for (String ans : answers) {
			Matcher matcher = pattern.matcher(ans);
			if (!matcher.matches()) {
				return true;
			}
		}
		return false;
	}

	// Compare answers with answer key
	public int computeScore(List<String> answers) {

		int score = 0;

		for (int i = 0; i < answerKey.size(); i++) {
			if (answers.get(i).equalsIgnoreCase(answerKey.get(i))) {
				score++;
			}
		}
		return score;
	}
}
