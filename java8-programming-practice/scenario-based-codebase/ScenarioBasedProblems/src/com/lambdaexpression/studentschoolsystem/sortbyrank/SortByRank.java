// Sort students by rank using lambda.

package com.lambdaexpression.studentschoolsystem.sortbyrank;

import com.lambdaexpression.studentschoolsystem.Student;

import java.util.*;

public class SortByRank {
	public static void main(String args[]) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Devika", 22, 498, 1));
		students.add(new Student("Ashumika", 21, 350, 3));
		students.add(new Student("Aastha", 23, 400, 2));
		students.sort((s1,s2)->s1.rank-s2.rank);
		for(Student s:students) {
			System.out.println(s.name+ " | Rank: " + s.rank);
		}
	}
}
