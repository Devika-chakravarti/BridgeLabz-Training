/* Scenario-based: 11
 * 
 * ExamProctor – Online Exam Review System (Stack + HashMap +
Functions)
Story: During an online exam, each student’s question navigation is recorded using a Stack
(last visited question). Answers are stored in a HashMap: questionID → answer.
A function auto-calculates the score once the student submits.
Requirements:
● Track navigation with stack.
● Store answers in a map.
● Evaluate using functions for scoring logic.
 * */

package com.examproctor;

import java.util.Scanner;

public class UseExamProctor {

	public static void main(String[] args) {

		ExamProctor exam = new ExamProctor();
		Scanner input = new Scanner(System.in);

		System.out.println("==================================================");
		System.out.println("          WELCOME TO ONLINE EXAM SYSTEM");
		System.out.println("==================================================");

		while (true) {

			System.out.println();
			System.out.println("Exam Proctor Menu:");
			System.out.println("1. Visit Question");
			System.out.println("2. Answer Question");
			System.out.println("3. Go Back to Previous Question");
			System.out.println("4. Submit Exam");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter question ID: ");
				int qId = input.nextInt();
				input.nextLine();
				exam.visitQuestion(qId);
				break;

			case 2:
				System.out.print("Enter question ID: ");
				int ansQId = input.nextInt();
				input.nextLine();
				System.out.print("Enter answer (A/B/C/D): ");
				String answer = input.nextLine();
				exam.answerQuestion(ansQId, answer);
				break;

			case 3:
				exam.goBack();
				break;

			case 4:
				exam.submitExam();
				break;

			case 5:
				System.out.println("==================================================");
				System.out.println("    THANK YOU FOR USING OUR ONLINE EXAM SYSTEM");
				System.out.println("==================================================");
				return;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
