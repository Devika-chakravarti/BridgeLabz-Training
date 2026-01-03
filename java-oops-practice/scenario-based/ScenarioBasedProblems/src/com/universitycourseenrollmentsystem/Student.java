package com.universitycourseenrollmentsystem;
public abstract class Student{
	
	// Attributes
    protected int studentId;
    protected String name;
    private double gpa;

    // Constructor
    public Student(int studentId,String name){
        this.studentId=studentId;
        this.name=name;
    }

    // Setter
    protected void setGpa(double gpa){
        this.gpa=gpa;
    }

    // concrete method
    public String getTranscript(){
        return "Student: "+name+"\nGPA: "+gpa;
    }

    // Abstract method
    public abstract void displayInfo();
}
