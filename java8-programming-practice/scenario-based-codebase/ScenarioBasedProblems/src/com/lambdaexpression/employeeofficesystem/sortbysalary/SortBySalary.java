// Sort employees by salary using lambda.

package com.lambdaexpression.employeeofficesystem.sortbysalary;

import java.util.ArrayList;
import java.util.List;

import com.lambdaexpression.employeeofficesystem.Employee;

public class SortBySalary {
	public static void main(String args[]) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Devika", 5, 100000));
		employees.add(new Employee(102, "Ashumika", 1, 7000));
		employees.add(new Employee(103, "Aastha", 3, 80000));
		employees.sort((s1, s2) -> s1.salary - s2.salary);
		for (Employee e : employees) {
			System.out.println(e.empName + " |Salary: " + e.salary);
		}
	}
}
