package com.sorting.eduresults;

public class Student {
	protected int id;
	protected String name;
	private int score;
	protected String numberOfDistricts;

	public Student(int id, String name, int score, String numberOfDistricts) {
		this.id = id;
		this.name = name;
		this.setScore(score);
		this.numberOfDistricts = numberOfDistricts;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
