package com.collegeinformationsystem;

import java.util.ArrayList;

public class Student extends Person implements ICourseActions {

	private double gpa;
	private ArrayList<String> enrolledCourses;

	public Student(int id, String name, String email) {
		super(id, name, email);
		enrolledCourses = new ArrayList<>();
	}

	// GPA calculation
	public void calculateGpa(int totalMarks, int subjects) {

		if (subjects <= 0) {
			System.out.println("Invalid number of subjects. GPA set to 0.");
			this.gpa = 0;
			return;
		}

		// GPA = Average marks
		this.gpa = (double) totalMarks / subjects;
	}

	@Override
	public void enrollCourse(String courseName) {
		enrolledCourses.add(courseName);
	}

	@Override
	public void dropCourse(String courseName) {

		for (int i = 0; i < enrolledCourses.size(); i++) {
			if (enrolledCourses.get(i).equals(courseName)) {
				enrolledCourses.remove(i);
				break;
			}
		}
	}

	@Override
	public void printDetails() {
		System.out.println("Student ID : " + id);
		System.out.println("Name       : " + name);
		System.out.println("Email      : " + email);
		System.out.println("GPA        : " + gpa);
		System.out.println("Courses    : " + enrolledCourses);
	}
}
