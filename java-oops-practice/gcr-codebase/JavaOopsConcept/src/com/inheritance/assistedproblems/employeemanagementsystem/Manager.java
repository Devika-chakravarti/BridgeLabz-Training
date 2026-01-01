package com.inheritance.assistedproblems.employeemanagementsystem;
class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // calling parent constructor
        this.teamSize = teamSize;
    }

    // overriding displayDetails method
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
