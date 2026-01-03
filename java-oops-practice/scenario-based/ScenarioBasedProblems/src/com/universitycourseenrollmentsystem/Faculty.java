package com.universitycourseenrollmentsystem;
public class Faculty{
	
	// Attribute
    private String name;

    // Coonstructor
    public Faculty(String name){
        this.name=name;
    }

    // Implementing the abstract method of Graded interface
    public void assignGrade(Graded student,double marks){
        student.assignGrade(marks);
    }
}
