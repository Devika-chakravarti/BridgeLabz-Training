package com.objectmodeling.selfproblems.universitymanagementsystemassociationaggregation;
import java.util.ArrayList;

public class University {

    String universityName;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Professor> professors = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();

    public University(String universityName) {
        this.universityName = universityName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showUniversityDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Students count: " + students.size());
        System.out.println("Professors count: " + professors.size());
        System.out.println("Courses count: " + courses.size());
    }
}
