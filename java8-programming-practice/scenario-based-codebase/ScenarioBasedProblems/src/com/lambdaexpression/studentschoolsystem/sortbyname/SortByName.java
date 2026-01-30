// Sort students by name using lambda.

package com.lambdaexpression.studentschoolsystem.sortbyname;

import com.lambdaexpression.studentschoolsystem.Student;
import java.util.*;

public class SortByName {
	public static void main(String args[]) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Devika", 22, 498, 1));
		students.add(new Student("Ashumika", 21, 350, 3));
		students.add(new Student("Aastha", 23, 400, 2));
		students.sort((s1, s2) -> s1.name.compareTo(s2.name));
		for (Student s : students) {
			System.out.println(s.name);
		}
	}
}
