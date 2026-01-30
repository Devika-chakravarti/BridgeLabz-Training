// Use lambda to calculate employee bonus (salary > 30,000).

package com.lambdaexpression.employeeofficesystem.bonus;

import com.lambdaexpression.employeeofficesystem.Employee;
import java.util.*;

public class EmployeeBonus {
	public static void main(String args[]) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Devika", 2, 100000));
		employees.add(new Employee(102, "Ashumika", 1, 7000));
		employees.add(new Employee(103, "Aastha", 3, 80000));
		employees.forEach(e -> {
			if (e.salary > 30000) {
				System.out.println(e.empName + " |Bonus: " + (e.salary - (e.salary * 0.85)));
			}
		});
	}
}
