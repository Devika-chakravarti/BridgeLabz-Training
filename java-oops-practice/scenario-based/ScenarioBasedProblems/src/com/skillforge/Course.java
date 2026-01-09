package com.skillforge;

public class Course {

	private int courseId;
	private String title;
	private String instructor;
	protected double rating; // no default rating
	private String[] modules;

	// default constructor
	public Course(int courseId, String title, String instructor) {
		// set course details and default modules
		this.courseId = courseId;
		this.title = title;
		this.instructor = instructor;
		this.modules = new String[] { "Intro", "Basics" };
	}

	// constructor with custom modules
	public Course(int courseId, String title, String instructor, String[] modules) {
		
		this.courseId = courseId;
		this.title = title;
		this.instructor = instructor;
		this.modules = modules;
	}

	// get course ID
	public int getCourseId() {
		return courseId;
	}

	// get course title
	public String getTitle() {
		return title;
	}

	// display course info
	public void displayCourse() {
		System.out.println("\n=====================================================");

		System.out.println("Course ID   : " + courseId);
		System.out.println("Title       : " + title);
		System.out.println("Instructor  : " + instructor);

		// print rating only if set
		if (rating > 0) {
			System.out.println("Rating      : " + rating + " / 5");
		}
	}

	// set rating (0 to 5)
	protected void setRating(double rating) {
		// validate before setting
		if (rating >= 0 && rating <= 5) {
			this.rating = rating;
		}
	}
}
