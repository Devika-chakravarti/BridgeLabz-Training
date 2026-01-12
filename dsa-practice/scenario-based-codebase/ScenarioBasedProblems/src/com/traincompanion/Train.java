package com.traincompanion;

public class Train {

	// Train's head and tail and customer's current position
	private CompartmentNode head;
	private CompartmentNode tail;
	private CompartmentNode current;

	// Insert at end of the linkedlist
	public void addCompartment(String name) {
		CompartmentNode newNode = new CompartmentNode(name);

		if (head == null) {
			head = tail = current = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		System.out.println("Compartment " + name + " added to the train.");
	}

	// Method to remove compartment by the name
	public void removeCompartment(String name) {
		CompartmentNode temp = head;

		while (temp != null) {
			if (temp.name.equals(name)) {
				if (temp.prev != null)
					temp.prev.next = temp.next;
				else
					head = temp.next;

				if (temp.next != null)
					temp.next.prev = temp.prev;
				else
					tail = temp.prev;

				if (current == temp)
					current = temp.next != null ? temp.next : temp.prev;

				System.out.println("Compartment " + name + " removed from the train.");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Compartment " + name + " not found.");
	}

	// Method to move forward
	public void moveForward() {
		if (current != null && current.next != null) {
			current = current.next;
			System.out.println("Moved to compartment: " + current.name);
		} else {
			System.out.println("You are at the last compartment.");
		}
	}

	// Method to move backward
	public void moveBackward() {
		if (current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Moved to compartment: " + current.name);
		} else {
			System.out.println("You are at the first compartment.");
		}
	}

	// Method to show adjacent compartments
	public void showAdjacent() {
		if (current == null) {
			System.out.println("Train is empty.");
			return;
		}
		System.out.println("Previous: " + (current.prev != null ? current.prev.name : "None"));
		System.out.println("Current: " + current.name);
		System.out.println("Next: " + (current.next != null ? current.next.name : "None"));
	}

	// Method to display all added compartments
	public void displayTrain() {
		if (head == null) {
			System.out.println("Train has no compartments.");
			return;
		}

		System.out.print("Train Compartments: ");
		CompartmentNode temp = head;
		while (temp != null) {
			System.out.print(temp.name + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
