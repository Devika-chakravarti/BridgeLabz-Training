package com.objectmodeling.selfproblems.universitymanagementsystemassociationaggregation;

public class UseUniversity {
	public static void main(String[] args) {

        // Create university
        University uni = new University("Tech University");

        // Create students
        Student s1 = new Student("Amit");
        Student s2 = new Student("Neha");

        // Create professors
        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Mehta");

        // Create courses
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        // Add to university
        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addProfessor(p2);
        uni.addCourse(c1);
        uni.addCourse(c2);

        // Assign professors
        p1.assignCourse(c1);
        p2.assignCourse(c2);

        // Enroll students
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        // Display information
        uni.showUniversityDetails();

        System.out.println();
        c1.showDetails();
        System.out.println();
        c2.showDetails();
    }
}
