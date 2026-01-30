// Use lambda to display students whose age is above 18.

package com.lambdaexpression.studentschoolsystem.studentage;

import com.lambdaexpression.studentschoolsystem.Student;
import java.util.*;

public class StudentAge {
	public static void main(String args[]) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Devika", 22, 498, 1));
		students.add(new Student("Ashumika", 21, 350, 3));
		students.add(new Student("Aastha", 17, 400, 2));
		students.forEach(s -> {
			if (s.age > 18) {
				System.out.println(s.name + " |Age: " + s.age);
			}
		});
	}
}
