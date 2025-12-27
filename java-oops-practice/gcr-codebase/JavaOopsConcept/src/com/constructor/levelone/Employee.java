package com.constructor.levelone;

// Employee class
public class Employee{

    // Attributes
    public int employeeID;
    protected String department;
    private double salary;

    // Parameterized constructor
    public Employee(int employeeID,String department,double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary(){
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary){
        this.salary = salary;
    }

    // Display employee details
    public void displayEmployeeDetails(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
