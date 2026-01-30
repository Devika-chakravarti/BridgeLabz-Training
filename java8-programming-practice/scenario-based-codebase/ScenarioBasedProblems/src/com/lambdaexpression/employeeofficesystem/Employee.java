/* Employee / Office System

1.Use lambda to calculate employee bonus (salary > 30,000).

2.Sort employees by salary using lambda.

3.Use lambda to check promotion eligibility (experience > 3 years).

4.Use lambda to print employee details.

5.Use lambda to compare two employees’ salaries.
 * */

package com.lambdaexpression.employeeofficesystem;

public class Employee {
	public int empId;
	public String empName;
	public double experienceYear;
	public int salary;

	public Employee(int empId, String empName, double experienceYear, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.experienceYear = experienceYear;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public String toString() {
		return empId + " |Employee name: " + empName + " |Experience Year: " + experienceYear + " |Salary: " + salary;
	}
}
