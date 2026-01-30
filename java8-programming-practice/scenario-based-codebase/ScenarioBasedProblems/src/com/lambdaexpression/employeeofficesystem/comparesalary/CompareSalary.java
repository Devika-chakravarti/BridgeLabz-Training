// Use lambda to compare two employees’ salaries.

package com.lambdaexpression.employeeofficesystem.comparesalary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.lambdaexpression.employeeofficesystem.Employee;

public class CompareSalary {
	public static void main(String args[]) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Devika", 5, 100000));
		employees.add(new Employee(102, "Ashumika", 1, 7000));

		Collections.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
