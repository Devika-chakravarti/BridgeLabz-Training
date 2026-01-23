/*Serialization - Save and Retrieve an Object
📌 Problem Statement:
Design a Java program that allows a user to store a list of employees in a file using Object Serialization and later retrieve the data from the file.
Requirements:
Create an Employee class with fields: id, name, department, salary.
Serialize the list of employees into a file (ObjectOutputStream).
Deserialize and display the employees from the file (ObjectInputStream).
Handle ClassNotFoundException and IOException.
*/

package com.iostreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveAndRetrieveObject {

	// Employee class for serialization
	static class Employee implements Serializable {

		private static final long serialVersionUID = 1L;

		int id;
		String name;
		String department;
		double salary;

		Employee(int id, String name, String department, double salary) {
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
		}

		public String toString() {
			return id + " | " + name + " | " + department + " | " + salary;
		}
	}

	public static void main(String[] args) {

		File file = new File("employees.dat");

		// Create list of employees
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Devika", "IT", 500000));
		employeeList.add(new Employee(102, "Annu", "HR", 450000));
		employeeList.add(new Employee(103, "Shree", "Finance", 60000));

		// Serialize employee list
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {

			oos.writeObject(employeeList);
			System.out.println("Employee data saved successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialize employee list
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

			List<Employee> retrievedList = (List<Employee>) ois.readObject();

			// Display retrieved employees
			for (Employee emp : retrievedList) {
				System.out.println(emp);
			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
