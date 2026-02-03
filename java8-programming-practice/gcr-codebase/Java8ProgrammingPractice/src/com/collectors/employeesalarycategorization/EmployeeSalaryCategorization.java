/*Employee Salary Categorization
You have a list of employees with their departments and salaries. Use
Collectors.groupingBy() to group employees by department and calculate the
average salary for each department.*/

package com.collectors.employeesalarycategorization;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private String department;
	private double salary;

	Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}
}

public class EmployeeSalaryCategorization {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Devika", "IT", 90000), new Employee("Annu", "HR", 40000),
				new Employee("Emma", "IT", 80000), new Employee("Satya", "HR", 50000),
				new Employee("Bhumi", "Finance", 70000));

		Map<String, Double> avgSalaryByDept = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(avgSalaryByDept);
	}
}
