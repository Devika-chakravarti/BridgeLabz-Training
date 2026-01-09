package com.skillforge;

public class Instructor extends User {

    // constructor
	public Instructor(String name, String email) {
		super(name, email);
	}

	// return role
	@Override
	public String getRole() {
		return "INSTRUCTOR";
	}

	// method to upload a course
	public Course uploadCourse(int courseId, String title, String[] modules, double price) {
	    // create a new course object
		Course course = new Course(courseId, title, name, modules);
		System.out.println("\nCourse uploaded successfully!");
		course.displayCourse();
		System.out.println("Price       : " + price + " Rs");
		System.out.println("=====================================================");
		
		return course;
	}
}
