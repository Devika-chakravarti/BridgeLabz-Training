package com.objectmodeling.assistedproblems.companydepartmentcomposition;
import java.util.ArrayList;
public class Department {
	String departmentName;
    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    // Add employee to department
    public void addEmployee(String name, String role) {
        Employee emp = new Employee(name, role);
        employees.add(emp);
    }

    public void showEmployees() {
        System.out.println("Department: " + departmentName);
        for (Employee emp : employees) {
            emp.showEmployee();
        }
    }
}
