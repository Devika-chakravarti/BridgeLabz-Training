package com.encapsulationpolymorphismandabstraction.employeemanagementsystem;

import java.util.ArrayList;

public class UseEmployeeManagementSystem {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new FullTimeEmployee("E101", "Ram", 50000);
        Employee emp2 = new PartTimeEmployee("E102", "Sita", 500, 40);

        employees.add(emp1);
        employees.add(emp2);

        for (int i = 0; i < employees.size(); i++) {

            Employee emp = employees.get(i);

            emp.displayDetails();
            System.out.println("Final Salary: " + emp.calculateSalary());

            emp.assignDepartment("IT");
            emp.getDepartmentDetails();

            System.out.println("------------------------");
        }
    }
}
