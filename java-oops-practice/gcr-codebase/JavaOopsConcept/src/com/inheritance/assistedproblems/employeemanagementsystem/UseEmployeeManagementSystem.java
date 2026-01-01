package com.inheritance.assistedproblems.employeemanagementsystem;

public class UseEmployeeManagementSystem {
	public static void main(String[] args) {

        Employee manager = new Manager("Ram", 101, 70000, 8);
        Employee developer = new Developer("Sita", 102, 60000, "Java");
        Employee intern = new Intern("Devika", 103, 15000, 6);

        manager.displayDetails();
        System.out.println();

        developer.displayDetails();
        System.out.println();

        intern.displayDetails();
    }
}
