package com.constructor.levelone;

public class Course{

    // Instance variables
    private String courseName;
    private int duration;
    private double fee;

    // Class variable
    private static String instituteName = "Tech Academy";

    // Parameterized constructor
    Course(String courseName, int duration, double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName + "\n");
    }

    // Class method to update institute name
    static void updateInstituteName(String newInstituteName){
        instituteName = newInstituteName;
    }

    public static void main(String[] args){

        Course course1 = new Course("Java Full Stack",6,45000);
        course1.displayCourseDetails();

        Course.updateInstituteName("Code Academy");

        Course course2 = new Course("Python Development",4,35000);
        course2.displayCourseDetails();
    }
}
