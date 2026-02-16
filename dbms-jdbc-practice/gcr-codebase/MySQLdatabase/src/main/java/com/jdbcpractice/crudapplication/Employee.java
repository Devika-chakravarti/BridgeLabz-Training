package com.jdbcpractice.crudapplication;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private String department;

	public Employee(int employeeId, String name, double salary, String department) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}
}
