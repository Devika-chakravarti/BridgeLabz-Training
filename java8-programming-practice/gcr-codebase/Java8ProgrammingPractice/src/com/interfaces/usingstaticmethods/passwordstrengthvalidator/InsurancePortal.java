/*Password Strength Validator
○ Scenario: In an insurance portal, password policy rules are centrally defined.
○ Task: Create a static method in an interface SecurityUtils to check password
strength.*/

package com.interfaces.usingstaticmethods.passwordstrengthvalidator;

public class InsurancePortal {
	public static void main(String[] args) {
		String password = "Secure123";
		if (SecurityUtils.isStrongPassword(password)) {
			System.out.println("Password is strong");
		} else {
			System.out.println("Password is weak");
		}
	}
}
