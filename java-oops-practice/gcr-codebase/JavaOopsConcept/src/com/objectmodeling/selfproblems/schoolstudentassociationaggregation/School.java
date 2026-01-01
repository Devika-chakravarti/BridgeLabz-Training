package com.objectmodeling.selfproblems.schoolstudentassociationaggregation;
import java.util.ArrayList;

public class School {

    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    // Add student to school
    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.name);
        }
    }
}
