/* Student / School System

1.Use a lambda expression to print a welcome message for a student.

2.Use lambda to check if a student is pass or fail based on marks.

3.Sort students by name using lambda.

4.Sort students by rank using lambda.

5.Use lambda to display students whose age is above 18.
 * */

package com.lambdaexpression.studentschoolsystem;

public class Student {
	public String name;
	public int age;
	public double marks;
	public int rank;

	public Student(String name, int age, double marks, int rank) {
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.rank = rank;
	}
}
