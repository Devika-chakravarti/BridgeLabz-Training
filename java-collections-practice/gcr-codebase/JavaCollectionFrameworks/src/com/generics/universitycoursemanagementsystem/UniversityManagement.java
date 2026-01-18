/* Multi-Level University Course Management System
 * Concepts: Generic Classes, Wildcards, Bounded Type Parameters
Problem Statement:
Develop a university course management system where different departments offer courses with different evaluation types (e.g., Exam-Based, Assignment-Based, Research-Based).
Hints:
Create an abstract class CourseType (e.g., ExamCourse, AssignmentCourse, ResearchCourse).
Implement a generic class Course<T extends CourseType> to manage different courses.
Use wildcards (List<? extends CourseType>) to handle any type of course dynamically.
*/

package com.generics.universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversityManagement {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<Course<? extends CourseType>> courseList = new ArrayList<>();

		System.out.print("Enter number of courses: ");
		int n = input.nextInt();
		input.nextLine();

		for (int i = 0; i < n; i++) {

			System.out.println("\n1. Exam Course\n2. Assignment Course\n3. Research Course");
			System.out.print("Choose course type: ");
			int choice = input.nextInt();
			input.nextLine();

			System.out.print("Enter course name: ");
			String name = input.nextLine();

			if (choice == 1) {
				courseList.add(new Course<>(name, new ExamCourse()));
			} else if (choice == 2) {
				courseList.add(new Course<>(name, new AssignmentCourse()));
			} else if (choice == 3) {
				courseList.add(new Course<>(name, new ResearchCourse()));
			} else {
				System.out.println("Invalid choice");
			}
		}
		System.out.println("\n-------------------------------");
		System.out.println("          All Courses");
		System.out.println("-------------------------------");
		CourseUtil.displayAllCourses(courseList);
	}
}
