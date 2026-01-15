package com.examproctor;

import java.util.HashMap;

public class ExamProctor {

	private static class StackNode {
		int questionId;
		StackNode next;

		StackNode(int questionId) {
			this.questionId = questionId;
		}
	}

	private StackNode top;

	private HashMap<Integer, String> studentAnswers;
	private HashMap<Integer, Question> questionBank;

	public ExamProctor() {
		studentAnswers = new HashMap<>();
		questionBank = new HashMap<>();
		initializeQuestions();
	}

	private void initializeQuestions() {
		questionBank.put(1, new Question(1, "A"));
		questionBank.put(2, new Question(2, "B"));
		questionBank.put(3, new Question(3, "C"));
		questionBank.put(4, new Question(4, "D"));
		questionBank.put(5, new Question(5, "A"));
	}

	public void visitQuestion(int questionId) {
		StackNode newNode = new StackNode(questionId);
		newNode.next = top;
		top = newNode;

		System.out.println("Visited Question: " + questionId);
	}

	public void goBack() {
		if (top == null) {
			System.out.println("No previous question available");
			return;
		}

		System.out.println("Leaving Question: " + top.questionId);
		top = top.next;

		if (top != null) {
			System.out.println("Back to Question: " + top.questionId);
		} else {
			System.out.println("No active question");
		}
	}

	public void answerQuestion(int questionId, String answer) {
		if (!questionBank.containsKey(questionId)) {
			System.out.println("Invalid question ID");
			return;
		}

		studentAnswers.put(questionId, answer.toUpperCase());
		System.out.println("Answer saved for Question " + questionId);
	}

	public void submitExam() {
		System.out.println();
		System.out.println("---------- EXAM RESULT ----------");

		int score = calculateScore();

		System.out.println("Total Questions: " + questionBank.size());
		System.out.println("Correct Answers: " + score);
		System.out.println("Final Score: " + score + "/" + questionBank.size());
		System.out.println("---------------------------------");
	}

	private int calculateScore() {
		int score = 0;

		for (int qId : questionBank.keySet()) {
			Question q = questionBank.get(qId);
			String studentAnswer = studentAnswers.get(qId);

			if (studentAnswer != null && studentAnswer.equalsIgnoreCase(q.getCorrectAnswer())) {
				score++;
			}
		}
		return score;
	}
}
