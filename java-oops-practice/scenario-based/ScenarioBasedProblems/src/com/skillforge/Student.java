package com.skillforge;

public class Student extends User implements ICertifiable {

	// enrolled course for the student
	private Course enrolledCourse;

	// track if course is completed
	private boolean completed;

	// constructor to set name, email and initialize completed flag
	public Student(String name, String email) {
		super(name, email);
		this.completed = false;
	}

	// return role of user
	@Override
	public String getRole() {
		return "STUDENT";
	}

	// enroll in a course
	public void enrollCourse(Course course) {
		enrolledCourse = course;
		System.out.println("Successfully enrolled in: " + course.getTitle());
	}

	// mark enrolled course as completed
	public void completeCourse() {
		if (enrolledCourse != null) {
			completed = true;
			System.out.println("Progress: 100%");
		} else {
			System.out.println("No course enrolled yet.");
		}
	}

	// get currently enrolled course
	public Course getEnrolledCourse() {
		return enrolledCourse;
	}

	@Override
	public void generateCertificate(Course course) {
		if (course != null && completed) {
			System.out.println("===== CERTIFICATE GENERATED =====");
			System.out.println("Student : " + name);
			System.out.println("Course  : " + course.getTitle());
			System.out.println("Status  : Completed");
		} else {
			System.out.println("Complete a course to generate certificate.");
		}
	}
}
