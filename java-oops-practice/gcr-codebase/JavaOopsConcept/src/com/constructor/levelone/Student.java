package com.constructor.levelone;

// Student class
public class Student{

    // Attributes
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Parameterized constructor
    public Student(int rollNumber,String name,double CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA(){
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA){
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails(){
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
