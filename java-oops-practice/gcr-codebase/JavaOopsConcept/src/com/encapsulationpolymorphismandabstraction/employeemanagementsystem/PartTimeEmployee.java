package com.encapsulationpolymorphismandabstraction.employeemanagementsystem;

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private String department;

    // Constructor
    public PartTimeEmployee(String employeeID, String name, double baseSalary, int hoursWorked) {
        super(employeeID, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}
