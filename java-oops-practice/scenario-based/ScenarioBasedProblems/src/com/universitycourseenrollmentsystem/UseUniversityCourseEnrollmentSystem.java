/* Scenario-based: 3
 * 
 * University Course Enrollment System
Scenario: Students should be able to enroll in courses, and faculty can assign grades.
Concepts Used:
● Class: Student, Course, Faculty, Enrollment
● Constructors: Used to create students with/without elective preferences
● Access Modifiers: private for internal GPA fields, public method to access
transcript
● Interface: Graded with method assignGrade()
● Operators: GPA calculations and comparisons (using +, /, etc.)
● OOP:
○ Encapsulation: Secure handling of grades
○ Inheritance: Undergraduate, Postgraduate extend Student

Scenario-based Problems
○ Abstraction: Interface allows different grading styles
○ Polymorphism: assignGrade() works differently for pass/fail vs. letter grading*/


package com.universitycourseenrollmentsystem;
public class UseUniversityCourseEnrollmentSystem{
    public static void main(String[] args){
    	
    	System.out.println("---- University course enrollmenet system ----");
        Student s1=new Undergraduate(101,"Devika");
        Student s2=new Postgraduate(102,"Anjali");

        Course c1=new Course("Data Structures");

        Faculty f1=new Faculty("Dr. Kumar");

        f1.assignGrade((Graded)s1,80);
        f1.assignGrade((Graded)s2,90);

        Enrollment e1=new Enrollment(s1,c1);
        Enrollment e2=new Enrollment(s2,c1);

        s1.displayInfo();
        System.out.println(" ");
        e1.showDetails();
        System.out.print("----------------------------");

        s2.displayInfo();
        System.out.println(" ");
        e2.showDetails();
    }
}

