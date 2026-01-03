package com.universitycourseenrollmentsystem;
public class Undergraduate extends Student implements Graded{

	// constructor
    public Undergraduate(int studentId,String name){
        super(studentId,name);
    }

    // Implementing the abstract method of Graded interface
    public void assignGrade(double marks){
        setGpa(marks/25);
    }

    // Implementing the abstract method of Student class
    public void displayInfo(){
        System.out.println("Undergraduate: ");
    }
}
