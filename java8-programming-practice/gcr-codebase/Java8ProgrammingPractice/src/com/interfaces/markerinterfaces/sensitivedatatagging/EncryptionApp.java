/*Sensitive Data Tagging
○ Scenario: Mark sensitive data classes for encryption.
○ Task: Create a custom marker interface.*/

package com.interfaces.markerinterfaces.sensitivedatatagging;

public class EncryptionApp {
	static void processEncryption(Object obj) {
		if (obj instanceof SensitiveData) {
			System.out.println("Encrypting data for: " + obj.getClass().getSimpleName());
		} else {
			System.out.println("No encryption needed for: " + obj.getClass().getSimpleName());
		}
	}

	public static void main(String[] args) {

		PatientRecord patient = new PatientRecord("Devika", "123-45-6789");
		EmployeeRecord employee = new EmployeeRecord("Annu", "50000");
		String publicData = "Public information";

		processEncryption(patient);
		processEncryption(employee);
		processEncryption(publicData);
	}
}
