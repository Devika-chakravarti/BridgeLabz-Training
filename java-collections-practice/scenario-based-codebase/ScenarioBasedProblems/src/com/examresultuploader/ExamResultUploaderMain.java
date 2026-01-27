/*ExamResultUploader – Bulk Marks Processing
Story: A school system uploads student marks as .csv files:
RollNo,Name,Subject,Marks
101,Ravi,Math,95
102,Anita,Science,88
The ExamResultUploader tool must:
● Read the file using FileReader and BufferedReader
● Validate each line with Regex (no missing fields, correct marks format)
● Use Map<String, List<Integer>> to store subject-wise marks
● Calculate top scorer per subject using PriorityQueue
● Use Generics to allow support for mid-term, finals, or internal exams
● Throw custom exceptions for invalid formats or missing marks*/

package com.examresultuploader;

import java.util.*;
import java.io.*;

public class ExamResultUploaderMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ExamResultProcessor processor = new ExamResultProcessor();

		System.out.print("Enter CSV file path for exam marks: ");
		String filePath = scanner.nextLine();

		System.out.print("Enter exam type (MidTerm/Final/Internal): ");
		String examType = scanner.nextLine();

		try {
			processor.processFile(filePath, examType);
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
			return;
		} catch (InvalidFormatException e) {
			System.out.println("Invalid CSV format: " + e.getMessage());
			return;
		}

		// Display subject-wise marks
		Map<String, List<Integer>> subjectMarks = processor.getSubjectMarks();
		System.out.println("\nSubject-wise Marks:");
		for (Iterator<String> it = subjectMarks.keySet().iterator(); it.hasNext();) {
			String subject = it.next();
			System.out.print(subject + " : ");
			List<Integer> marks = subjectMarks.get(subject);
			for (int i = 0; i < marks.size(); i++) {
				System.out.print(marks.get(i));
				if (i < marks.size() - 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}

		// Display top scorers
		Map<String, Integer> topScorers = processor.calculateTopScorers();
		System.out.println("\nTop Scorers per Subject:");
		for (Iterator<String> it = topScorers.keySet().iterator(); it.hasNext();) {
			String subject = it.next();
			System.out.println(subject + " : " + topScorers.get(subject));
		}
	}
}
