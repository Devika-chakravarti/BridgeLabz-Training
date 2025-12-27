package com.constructor.levelone;

// Subclass demonstrating access to employeeID and department
public class Manager extends Employee{

    private String teamName;

    // Parameterized constructor
    public Manager(int employeeID,String department,double salary,String teamName){
        super(employeeID,department,salary);
        this.teamName = teamName;
    }

    // Display manager details
    public void displayManagerDetails(){
        // Accessing public and protected members from superclass
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println("Team Name: " + teamName);
    }

    public static void main(String[] args){
        Manager mgr = new Manager(101,"IT",150000,"DevOps");
        mgr.displayManagerDetails();

        // Modify salary using public setter
        mgr.setSalary(200000);
        System.out.println("\nAfter updating salary:");
        mgr.displayManagerDetails();
    }
}
