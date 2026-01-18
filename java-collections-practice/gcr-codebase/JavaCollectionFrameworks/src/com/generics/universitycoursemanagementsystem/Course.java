package com.generics.universitycoursemanagementsystem;

public class Course<T extends CourseType> {
	String courseName;
	T courseType;

	Course(String courseName, T courseType) {
		this.courseName = courseName;
		this.courseType = courseType;
	}

	void displayCourse() {
		System.out.println("Course name: " + courseName + ", Evaluation: " + courseType.getEvaluationType());
	}
}
