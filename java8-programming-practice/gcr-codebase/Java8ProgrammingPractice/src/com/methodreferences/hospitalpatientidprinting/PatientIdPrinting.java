/*Hospital Patient ID Printing
○ Scenario: Need to print all patient IDs from a list for admin verification.
○ Task: Use method references instead of lambdas.*/

package com.methodreferences.hospitalpatientidprinting;

import java.util.*;

public class PatientIdPrinting {
	static class Patient {
		String id;

		Patient(String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}
	}

	public static void main(String args[]) {
		List<Patient> patientIds = Arrays.asList(new Patient("P101"), new Patient("P102"), new Patient("P103"));
		
		// printing all patient ids by using method reference
		patientIds.stream().map(Patient::getId).forEach(System.out::println);
	}
}
