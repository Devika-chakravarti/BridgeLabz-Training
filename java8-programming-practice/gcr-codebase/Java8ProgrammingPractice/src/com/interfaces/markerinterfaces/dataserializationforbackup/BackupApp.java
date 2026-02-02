/*Data Serialization for Backup
○ Scenario: Mark certain classes as Serializable for backup storage.
○ Task: Implement marker interface for backup processing.*/

package com.interfaces.markerinterfaces.dataserializationforbackup;

public class BackupApp {
	static void processBackup(Object obj) {
		if (obj instanceof BackupEligible) {
			System.out.println("Backing up: " + obj.getClass().getSimpleName());
		} else {
			System.out.println("Skipping backup: " + obj.getClass().getSimpleName());
		}
	}

	public static void main(String[] args) {
		Employee emp = new Employee("Devika", 101);
		Customer cust = new Customer("Annu", "annu@email.com");
		String text = "Non-backup data";

		processBackup(emp);
		processBackup(cust);
		processBackup(text);
	}
}
