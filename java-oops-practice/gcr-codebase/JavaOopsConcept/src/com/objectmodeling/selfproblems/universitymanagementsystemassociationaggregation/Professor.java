package com.objectmodeling.selfproblems.universitymanagementsystemassociationaggregation;
import java.util.ArrayList;

public class Professor {

    String name;
    ArrayList<Course> courses = new ArrayList<>();

    public Professor(String name) {
        this.name = name;
    }

    // Professor teaches course
    public void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
        System.out.println(name + " assigned to teach " + course.courseName);
    }

    public void showCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}
