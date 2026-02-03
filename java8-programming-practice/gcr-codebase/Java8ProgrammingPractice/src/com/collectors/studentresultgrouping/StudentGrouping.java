/*Student Result Grouping
○ Scenario: Group students by grade level and collect names.
○ Task: Use Collectors.groupingBy().*/

package com.collectors.studentresultgrouping;

import java.util.*;
import java.util.stream.Collectors;

class Student {
	String name;
	String grade;

	Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}
}

public class StudentGrouping {
	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Devika", "A"), new Student("Ankit", "B"),
				new Student("Annu", "A"), new Student("Raj", "C"), new Student("Siya", "A"));

		Map<String, List<String>> result = students.stream().collect(
				Collectors.groupingBy(Student::getGrade, Collectors.mapping(Student::getName, Collectors.toList())));

		System.out.println(result);
	}
}
