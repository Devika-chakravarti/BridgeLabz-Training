/* Convert CSV Data into Java Objects
Read a CSV file and convert each row into a Student Java object.
Store the objects in a List<Student> and print them.
*/

package com.csvdatahandling;

import java.io.*;
import java.util.*;

class Student {
	private String id;
	private String name;
	private String age;
	private String marks;

	public Student(String id, String name, String age, String marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Marks: " + marks;
	}
}

public class CSVToStudentObjects {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
			String line;
			br.readLine();

			while ((line = br.readLine()) != null) {
				String[] columns = line.split(",");
				Student student = new Student(columns[0], columns[1], columns[2], columns[3]);
				students.add(student); // Add object to list
			}

			// Print all student objects
			for (Student s : students) {
				System.out.println(s);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
