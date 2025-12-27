package com.constructor.levelone;

// Subclass demonstrating protected access
public class PostgraduateStudent extends Student{

    private String specialization;

    // Parameterized constructor
    public PostgraduateStudent(int rollNumber,String name,double CGPA,String specialization){
        super(rollNumber,name,CGPA);
        this.specialization = specialization;
    }

    // Display details including specialization
    public void displayPostgraduateDetails(){
        // Accessing protected member 'name' from superclass
        System.out.println("Postgraduate Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String[] args){
        PostgraduateStudent pgStudent = new PostgraduateStudent(101,"Devika",8.8,"Computer Science");
        pgStudent.displayPostgraduateDetails();

        // Modify CGPA using public setter
        pgStudent.setCGPA(9.5);
        System.out.println("\nAfter updating CGPA:");
        pgStudent.displayPostgraduateDetails();
    }
}
