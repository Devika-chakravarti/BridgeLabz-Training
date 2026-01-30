//Create a custom functional interface to validate user login.

package com.functionalinterface.customfunctionalinterface.validateuserlogin;

@FunctionalInterface
interface MyFunctionalInterface {
	public boolean isValid(String username);
}

public class ValidateUserLogin {
	public static void main(String args[]) {
		// lambda expression
		MyFunctionalInterface validity = username -> username != null && !username.isEmpty();
		System.out.println(validity.isValid("Devika"));
	}
}
