package com.interfaces.markerinterfaces.dataserializationforbackup;

class Employee implements BackupEligible {
	String name;
	int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

class Customer implements BackupEligible {
	String name;
	String email;

	Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
}
