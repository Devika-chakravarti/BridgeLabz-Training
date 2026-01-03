package com.universitycourseenrollmentsystem;
public class Postgraduate extends Student implements Graded{

	// Constructor
    public Postgraduate(int studentId,String name){
        super(studentId,name);
    }

    // Implementing the abstract method of Graded interface
    public void assignGrade(double marks){
        setGpa((marks/100)*4);
    }

    // Implementing the abstract method of Student class
    public void displayInfo(){
        System.out.println("\nPostgraduate: ");
    }
}
