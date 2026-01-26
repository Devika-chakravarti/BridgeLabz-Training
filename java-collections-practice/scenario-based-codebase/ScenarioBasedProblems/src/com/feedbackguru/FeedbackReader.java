package com.feedbackguru;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FeedbackReader {

	public List<String> readFeedbackFiles(String folderPath) {
		List<String> feedbackLines = new ArrayList<>();

		File folder = new File(folderPath);
		File[] files = folder.listFiles();

		if (files == null) {
			System.out.println("No files found in the given folder.");
			return feedbackLines;
		}

		for (File file : files) {
			if (file.getName().endsWith(".txt")) {
				readSingleFile(file, feedbackLines);
			}
		}
		return feedbackLines;
	}

	private void readSingleFile(File file, List<String> feedbackLines) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line;
			while ((line = br.readLine()) != null) {
				feedbackLines.add(line);
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + file.getName());
		}
	}
}
