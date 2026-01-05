package com.collegeinformationsystem;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students;

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {

        // Prevent duplicate enrollment
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) == student) {
                System.out.println(student.name + " is already enrolled in " + courseName);
                return;
            }
        }

        students.add(student);
        student.enrollCourse(courseName);
        System.out.println(student.name + " enrolled in " + courseName);
    }

    public void showCourseDetails() {
        System.out.println("\nCourse Name : " + courseName);
        System.out.println("Faculty     : " + faculty.name);
        System.out.println("Students Enrolled:");

        if (students.size() == 0) {
            System.out.println("No students enrolled");
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println("- " + students.get(i).name);
        }
    }
}
