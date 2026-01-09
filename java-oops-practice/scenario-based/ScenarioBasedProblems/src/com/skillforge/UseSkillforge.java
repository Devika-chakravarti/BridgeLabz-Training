/* Scenario-based: 21
 * 
 *  "SkillForge – Online Learning Portal"
Story: A startup builds SkillForge, where instructors upload courses and students enroll,
complete, and get certified.
Requirements:
● Course class: title, instructor, rating, modules[].
● User class → Student, Instructor (inheritance).
● Interface ICertifiable with generateCertificate() method.
● Constructors for courses with default or custom module lists.
● Use operators for grading, progress tracking.
● Encapsulation: course rating logic protected.
● Polymorphism: certificate format varies per course level.
● Access Modifiers: internal course reviews are read-only.
 * */

package com.skillforge;

import java.util.Scanner;

public class UseSkillforge {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// create some pre-existing courses
		Course c1 = new Course(101, "Java Fundamentals", "Devika");
		Course c2 = new Course(102, "OOP in Java", "Rahul");
		Course c3 = new Course(103, "Data Structures", "Anita");

		Course[] courses = { c1, c2, c3 };

		System.out.println("=====================================================");
		System.out.println("        SKILLFORGE – ONLINE LEARNING PORTAL");
		System.out.println("=====================================================");
		System.out.println("Select Role:");
		System.out.println("1. Student");
		System.out.println("2. Instructor");
		System.out.print("Enter choice: ");

		int roleChoice = input.nextInt();
		input.nextLine(); // consume newline

		// get user details
		System.out.print("Enter Name: ");
		String name = input.nextLine();

		System.out.print("Enter Email: ");
		String email = input.nextLine();

		// ===== STUDENT FLOW =====
		if (roleChoice == 1) {

			// create student object
			Student student = new Student(name, email);

			System.out.println("\n=====================================================");
			System.out.println("              STUDENT DASHBOARD");
			System.out.println("=====================================================");

			boolean studentMenu = true;
			while (studentMenu) {

				// display student menu
				System.out.println("\n1. View Courses");
				System.out.println("2. Enroll in Course");
				System.out.println("3. Complete Course");
				System.out.println("4. View Certificate");
				System.out.println("5. Exit");
				System.out.print("Enter choice: ");

				int choice = input.nextInt();

				switch (choice) {

				case 1:
					// show all available courses
					System.out.println("\nAvailable Courses:");
					for (int i = 0; i < courses.length; i++) {
						courses[i].displayCourse();
						System.out.println("----------------------------------");
					}
					break;

				case 2:
					// enroll in selected course
					System.out.print("Enter Course ID to enroll: ");
					int cid = input.nextInt();
					Course selected = null;

					for (int i = 0; i < courses.length; i++) {
						if (courses[i].getCourseId() == cid) {
							selected = courses[i];
							break;
						}
					}

					if (selected != null) {
						student.enrollCourse(selected);
					} else {
						System.out.println("Invalid Course ID");
					}
					break;

				case 3:
					// mark course as completed
					student.completeCourse();
					break;

				case 4:
					// show certificate for enrolled course
					student.generateCertificate(student.getEnrolledCourse());
					break;

				case 5:
					// exit student dashboard
					System.out.println("\n=====================================================");
					System.out.println("           THANK YOU FOR USING SKILLFORGE");
					System.out.println("=====================================================");
					studentMenu = false;
					break;

				default:
					System.out.println("Invalid option");
				}
			}

		}
		// ===== INSTRUCTOR FLOW =====
		else if (roleChoice == 2) {

			// create instructor object
			Instructor instructor = new Instructor(name, email);

			System.out.println("\n=====================================================");
			System.out.println("              INSTRUCTOR DASHBOARD");
			System.out.println("=====================================================");

			Scanner scInstr = new Scanner(System.in);

			// get course details from instructor
			System.out.print("Enter Course ID: ");
			int courseId = scInstr.nextInt();
			scInstr.nextLine(); // consume newline

			System.out.print("Enter Course Title: ");
			String courseTitle = scInstr.nextLine();

			System.out.print("Enter number of modules: ");
			int moduleCount = scInstr.nextInt();
			scInstr.nextLine(); // consume newline

			// get module names
			String[] modules = new String[moduleCount];
			for (int i = 0; i < moduleCount; i++) {
				System.out.print("Enter module " + (i + 1) + " name: ");
				modules[i] = scInstr.nextLine();
			}

			System.out.print("Enter Course Price: ");
			double price = scInstr.nextDouble();

			instructor.uploadCourse(courseId, courseTitle, modules, price);

		} else {
			System.out.println("Invalid role selection.");
		}

		input.close();
	}
}
