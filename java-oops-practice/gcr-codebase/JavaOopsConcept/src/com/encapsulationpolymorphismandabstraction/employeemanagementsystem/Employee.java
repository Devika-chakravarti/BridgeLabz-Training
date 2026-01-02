package com.encapsulationpolymorphismandabstraction.employeemanagementsystem;

public abstract class Employee {

	// Attributes
    private String employeeID;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(String employeeID, String name, double baseSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Default department behavior
    public void assignDepartment(String department) {
        System.out.println("No department assigned.");
    }

    public void getDepartmentDetails() {
        System.out.println("No department available.");
    }

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}
