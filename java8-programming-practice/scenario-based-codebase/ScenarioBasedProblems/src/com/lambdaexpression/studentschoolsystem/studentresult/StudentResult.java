// Use lambda to check if a student is pass or fail based on marks.

package com.lambdaexpression.studentschoolsystem.studentresult;

public class StudentResult {
	public static void main(String args[]) {
		Result r = (marks) -> marks >= 33.0;
		double marks = 95;
		if (r.isPass(marks)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}
}
