package com.inheritance.multilevelinheritance.educationalcoursehierarchy;
class Course {

    // private attributes for encapsulation
    private String courseName;
    private int duration; // duration in hours

    // constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // getters
    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    // method to display course details
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}
