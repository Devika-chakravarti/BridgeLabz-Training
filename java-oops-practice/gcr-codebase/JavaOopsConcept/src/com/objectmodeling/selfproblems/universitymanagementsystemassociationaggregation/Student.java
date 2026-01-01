package com.objectmodeling.selfproblems.universitymanagementsystemassociationaggregation;
import java.util.ArrayList;

public class Student {

    String name;
    ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    // Student enrolls in course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.courseName);
    }

    public void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}
