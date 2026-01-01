package com.objectmodeling.selfproblems.universitymanagementsystemassociationaggregation;
import java.util.ArrayList;

public class Course {

    String courseName;
    Professor professor;
    ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.name);
        }

        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}
