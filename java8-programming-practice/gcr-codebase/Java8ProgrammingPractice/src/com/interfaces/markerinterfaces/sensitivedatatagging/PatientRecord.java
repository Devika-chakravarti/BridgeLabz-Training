package com.interfaces.markerinterfaces.sensitivedatatagging;

public class PatientRecord implements SensitiveData {
	String name;
	String ssn;

	PatientRecord(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "PatientRecord: " + name + ", ssn = " + ssn;
	}
}

class EmployeeRecord implements SensitiveData {
	String name;
	String salary;

	EmployeeRecord(String name, String salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeRecord: " + name + ", salary ='" + salary;
	}
}
