package com.inheritance.assistedproblems.employeemanagementsystem;

class Employee {

    // private attributes
    private String name;
    private int id;
    private double salary;

    // constructor to initialize values
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // getters to access private variables
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
