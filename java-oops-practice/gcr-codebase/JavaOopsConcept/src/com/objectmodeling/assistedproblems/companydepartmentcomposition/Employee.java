package com.objectmodeling.assistedproblems.companydepartmentcomposition;

public class Employee {
	String name;
    String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void showEmployee() {
        System.out.println("Employee Name: " + name + ", Role: " + role);
    }
}
