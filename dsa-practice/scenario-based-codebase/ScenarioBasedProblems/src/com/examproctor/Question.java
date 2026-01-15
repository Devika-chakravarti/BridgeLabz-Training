package com.examproctor;

public class Question {

	private int questionId;
	private String correctAnswer;

	public Question(int questionId, String correctAnswer) {
		this.questionId = questionId;
		this.correctAnswer = correctAnswer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}
}
