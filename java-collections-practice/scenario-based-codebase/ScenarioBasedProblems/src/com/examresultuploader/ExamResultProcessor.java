package com.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultProcessor {

	private Map<String, List<Integer>> subjectMarks = new HashMap<String, List<Integer>>();

	// Read CSV file and process records
	public void processFile(String filePath, String examType) throws IOException, InvalidFormatException {
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line;

		line = br.readLine();

		// Regex pattern: RollNo,Name,Subject,Marks
		Pattern pattern = Pattern.compile("^(\\d+),([^,]+),([^,]+),(\\d+)$");

		while ((line = br.readLine()) != null) {
			Matcher matcher = pattern.matcher(line.trim());
			if (!matcher.matches()) {
				throw new InvalidFormatException("Invalid line format: " + line);
			}

			String rollNo = matcher.group(1).trim();
			String name = matcher.group(2).trim();
			String subject = matcher.group(3).trim();
			int marks = Integer.parseInt(matcher.group(4).trim());

			// Create generic exam record
			ExamRecord<String> record = new ExamRecord<String>(rollNo, name, subject, marks, examType);

			// Store marks subject-wise
			if (!subjectMarks.containsKey(subject)) {
				subjectMarks.put(subject, new ArrayList<Integer>());
			}
			subjectMarks.get(subject).add(marks);
		}

		br.close();
	}

	public Map<String, List<Integer>> getSubjectMarks() {
		return subjectMarks;
	}

	// Calculate top scorer per subject
	public Map<String, Integer> calculateTopScorers() {
		Map<String, Integer> topScorers = new HashMap<String, Integer>();

		for (Iterator<String> it = subjectMarks.keySet().iterator(); it.hasNext();) {
			String subject = it.next();
			List<Integer> marksList = subjectMarks.get(subject);

			// Using PriorityQueue to find max marks
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for (int i = 0; i < marksList.size(); i++) {
				pq.add(marksList.get(i));
			}

			int maxMarks = 0;
			while (!pq.isEmpty()) {
				maxMarks = pq.poll();
			}
			topScorers.put(subject, maxMarks);
		}

		return topScorers;
	}
}
