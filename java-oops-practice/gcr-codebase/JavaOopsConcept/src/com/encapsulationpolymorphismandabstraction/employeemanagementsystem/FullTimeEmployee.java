package com.encapsulationpolymorphismandabstraction.employeemanagementsystem;

public class FullTimeEmployee extends Employee {

    private String department;

    public FullTimeEmployee(String employeeID, String name, double baseSalary) {
        super(employeeID, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
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
