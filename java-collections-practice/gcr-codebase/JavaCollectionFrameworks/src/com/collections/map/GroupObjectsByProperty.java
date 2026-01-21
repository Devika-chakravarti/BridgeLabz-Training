/*Group Objects by Property
Given a list of Employee objects, group them by their department using a Map<Department, List<Employee>>.
Example:
Employees: [Alice (HR), Bob (IT), Carol (HR)] → Output: HR: [Alice, Carol], IT: [Bob].*/

package com.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Employee {
	String name;
	String department;

	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class GroupObjectsByProperty {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();

		System.out.print("Enter no of employees: ");
		int n = input.nextInt();
		input.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter employee name: ");
			String name = input.nextLine();
			System.out.print("Enter department: ");
			String dept = input.nextLine();
			employees.add(new Employee(name, dept));
		}

		// Group by department
		Map<String, List<Employee>> deptMap = new HashMap<>();

		for (Employee emp : employees) {
			deptMap.putIfAbsent(emp.department, new ArrayList<Employee>());
			deptMap.get(emp.department).add(emp);
		}

		// Display grouped employees
		for (Map.Entry<String, List<Employee>> entry : deptMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
