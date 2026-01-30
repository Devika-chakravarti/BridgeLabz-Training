// Use a lambda expression to print a welcome message for a student.

package com.lambdaexpression.studentschoolsystem.welcomemessage;

public class WelcomeMessage {
	public static void main(String args[]) {
		// lambda expression
		Welcome w = (name)->System.out.println("Welcome to the school " + name);
		w.message("Devika");
	}
}
