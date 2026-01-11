package com.ambulanceroute;

public class AmbulanceRoute {

	private UnitNode head;

	// Add unit to circular linked list
	public void addUnit(String name, boolean available) {
		UnitNode newNode = new UnitNode(name, available);

		if (head == null) {
			head = newNode;
			newNode.next = head;
			return;
		}

		UnitNode temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}

		temp.next = newNode;
		newNode.next = head;
	}

	// Show circular route
	public void showRoute() {
		if (head == null) {
			System.out.println("No hospital units configured.");
			return;
		}

		System.out.println("\nCurrent Circular Route:");
		UnitNode temp = head;

		do {
			System.out.print(temp.name + " -> ");
			temp = temp.next;
		} while (temp != head);

		System.out.println(head.name);
	}

	// Show availability status
	public void showStatus() {
		System.out.println("\n------------------------------------------------------------");
		System.out.println("Hospital Units Status:");
		System.out.println("------------------------------------------------------------");
		UnitNode temp = head;

		do {
			System.out.println(temp.name + " : " + (temp.available ? "AVAILABLE" : "NOT AVAILABLE"));
			temp = temp.next;
		} while (temp != head);
	}

	// Ambulance routing logic
	public void findNearestAvailableUnit() {
		UnitNode temp = head;

		System.out.println("\n------------------------------------------------------------");
		System.out.println("Ambulance has arrived at " + head.name);
		System.out.println("------------------------------------------------------------");
		
		do {
			if (temp.available) {
				System.out.println(temp.name + " is AVAILABLE");
				System.out.println("Patient admitted to " + temp.name);
				return;
			} else {
				System.out.println(temp.name + " is NOT available");
				System.out.println("Redirecting to " + temp.next.name + "...\n");
			}
			temp = temp.next;
		} while (temp != head);

		System.out.println("No unit available for emergency treatment.");
	}

	// Mark unit unavailable (maintenance)
	public void markUnderMaintenance(String name) {
		UnitNode temp = head;

		do {
			if (temp.name.equalsIgnoreCase(name)) {
				temp.available = false;
				System.out.println("\n------------------------------------------------------------");
				System.out.println(name + " marked as UNDER MAINTENANCE");
				System.out.println("------------------------------------------------------------");
				return;
			}
			temp = temp.next;
		} while (temp != head);

		System.out.println("Unit not found.");
	}

	// Mark unit available
	public void markAvailable(String name) {
		UnitNode temp = head;

		do {
			if (temp.name.equalsIgnoreCase(name)) {
				temp.available = true;
				System.out.println("\n------------------------------------------------------------");
				System.out.println(name + " marked as AVAILABLE");
				System.out.println("------------------------------------------------------------");
				return;
			}
			temp = temp.next;
		} while (temp != head);

		System.out.println("Unit not found.");
	}
}
