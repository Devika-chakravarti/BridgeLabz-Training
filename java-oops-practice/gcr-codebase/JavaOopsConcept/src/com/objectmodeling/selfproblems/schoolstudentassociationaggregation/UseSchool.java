package com.objectmodeling.selfproblems.schoolstudentassociationaggregation;

public class UseSchool {
	public static void main(String[] args) {

        // Create school
        School school = new School("Green Valley School");

        // Create students
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Anjali");

        // Add students to school (Aggregation)
        school.addStudent(s1);
        school.addStudent(s2);

        // Create courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        // Enroll students in courses (Association)
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        // Display data
        school.showStudents();
        System.out.println();

        s1.viewCourses();
        s2.viewCourses();

        System.out.println();

        c1.viewStudents();
        c2.viewStudents();
    }
}
