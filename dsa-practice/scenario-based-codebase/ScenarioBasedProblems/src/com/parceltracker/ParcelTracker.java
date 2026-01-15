package com.parceltracker;

public class ParcelTracker {

	private StageNode head;

	// Constructor initializes default delivery stages
	public ParcelTracker() {
		initializeStages();
	}

	// Predefined delivery flow
	private void initializeStages() {

		StageNode packed = new StageNode("Packed");
		StageNode shipped = new StageNode("Shipped");
		StageNode inTransit = new StageNode("In Transit");
		StageNode delivered = new StageNode("Delivered");

		packed.next = shipped;
		shipped.next = inTransit;
		inTransit.next = delivered;

		head = packed;
	}

	// Displays parcel tracking in a clean arrow format
	public void trackParcel() {

		if (head == null) {
			System.out.println("No tracking information available");
			return;
		}

		StageNode current = head;

		while (current != null) {
			System.out.print(current.stageName);

			if (current.next != null) {
				System.out.print(" -> ");
			}

			current = current.next;
		}

		System.out.println();
	}

	// Adds a custom checkpoint after a given stage
	public void addCheckpointAfter(String existingStage, String newCheckpoint) {

		StageNode current = head;

		while (current != null) {
			if (current.stageName.equalsIgnoreCase(existingStage)) {

				StageNode checkpoint = new StageNode(newCheckpoint);
				checkpoint.next = current.next;
				current.next = checkpoint;

				return;
			}
			current = current.next;
		}
	}

	// Simulates lost parcel by breaking the chain after a stage
	public void simulateParcelLoss(String stageName) {

		StageNode current = head;

		while (current != null) {
			if (current.stageName.equalsIgnoreCase(stageName)) {
				current.next = null;
				return;
			}
			current = current.next;
		}
	}
}
