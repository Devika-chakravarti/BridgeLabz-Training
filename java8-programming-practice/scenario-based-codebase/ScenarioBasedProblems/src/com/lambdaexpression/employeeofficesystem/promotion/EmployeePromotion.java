// Use lambda to check promotion eligibility (experience > 3 years).

package com.lambdaexpression.employeeofficesystem.promotion;

import com.lambdaexpression.employeeofficesystem.Employee;
import java.util.*;

public class EmployeePromotion {
	public static void main(String args[]) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Devika", 5, 100000));
		employees.add(new Employee(102, "Ashumika", 1, 7000));
		employees.add(new Employee(103, "Aastha", 3, 80000));
		employees.forEach(e -> {
			if (e.experienceYear > 3) {
				System.out.println(e.empName + " is promoted");
			}else {
				System.out.println(e.empName + " is not promoted");
			}
		});
	}
}
