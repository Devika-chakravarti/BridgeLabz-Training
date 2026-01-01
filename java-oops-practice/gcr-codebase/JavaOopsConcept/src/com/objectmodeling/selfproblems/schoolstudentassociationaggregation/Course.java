package com.objectmodeling.selfproblems.schoolstudentassociationaggregation;
import java.util.ArrayList;

public class Course {

    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Add student to course
    public void addStudent(Student student) {
        students.add(student);
    }

    // View students in this course
    public void viewStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.name);
        }
    }
}
