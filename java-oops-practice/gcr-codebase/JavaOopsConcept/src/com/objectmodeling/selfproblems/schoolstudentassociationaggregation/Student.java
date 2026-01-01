package com.objectmodeling.selfproblems.schoolstudentassociationaggregation;
import java.util.ArrayList;
public class Student {
	String name;
    ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    // Enroll student in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // two-way association
    }

    // View enrolled courses
    public void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println("- " + course.courseName);
        }
    }
}
