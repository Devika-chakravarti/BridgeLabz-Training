package com.examscanner;

import java.util.List;

public class AnswerSheet<T> {

	private String studentName;
	private List<String> answers;
	private T subjectType;

	public AnswerSheet(String studentName, List<String> answers, T subjectType) {
		this.studentName = studentName;
		this.answers = answers;
		this.subjectType = subjectType;
	}

	public String getStudentName() {
		return studentName;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public T getSubjectType() {
		return subjectType;
	}
}
