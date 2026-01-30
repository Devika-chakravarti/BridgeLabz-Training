// Use lambda to print employee details.

package com.lambdaexpression.employeeofficesystem.employeedetails;

import java.util.*;

import com.lambdaexpression.employeeofficesystem.Employee;

public class DisplayEmployeeDetails {
	public static void main(String args[]) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Devika", 5, 100000));
		employees.add(new Employee(102, "Ashumika", 1, 7000));
		employees.add(new Employee(103, "Aastha", 3, 80000));
		employees.forEach(employeedetails -> System.out.println(employeedetails));
	}
}
