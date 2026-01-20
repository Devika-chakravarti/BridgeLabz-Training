/*Hospital Triage System
Simulate a hospital triage system using a PriorityQueue where patients with higher severity are treated first.
Example:
Patients: [("John", 3), ("Alice", 5), ("Bob", 2)] → Order: Alice, John, Bob.
*/

package com.collections.queue;

import java.util.PriorityQueue;
import java.util.Scanner;

class Patient {
	protected String name;
	protected int severity;

	public Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}

	public String toString() {
		return name + "(" + severity + ")";
	}
}

public class HospitalTriageSystem {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		// Descending order
		PriorityQueue<Patient> pq = new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

		System.out.print("Enter the number of patients: ");
		int n = input.nextInt();
		input.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter patient name: ");
			String name = input.nextLine();
			System.out.print("Enter severity: ");
			int severity = input.nextInt();
			input.nextLine();
			pq.add(new Patient(name, severity));
		}
		System.out.println("\nTreatment order:");
		while (!pq.isEmpty()) {
			System.out.println(pq.poll().name);
		}
	}
}
