package com.inheritance.hierarchicalinheritance.schoolsystem;

public class UsePerson {
	public static void main(String[] args) {

        Person teacher = new Teacher("Anita", 35, "Mathematics");
        Person student = new Student("Rahul", 16, "10th Grade");
        Person staff = new Staff("Suresh", 42, "Administration");

        teacher.displayRole();
        System.out.println();

        student.displayRole();
        System.out.println();

        staff.displayRole();
    }
}
