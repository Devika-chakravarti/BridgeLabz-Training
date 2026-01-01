package com.inheritance.assistedproblems.employeemanagementsystem;
class Intern extends Employee {

    private int duration; // internship duration in months

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    // overriding displayDetails method
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}
