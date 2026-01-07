/* Scenario-based: 16
 * 
 * "ParkEase – Smart Parking Management System"
Story: A city wants a smart parking solution that can assign parking slots, calculate charges,
and track availability in real time.
Requirements:
● ParkingSlot class: slotId, isOccupied, vehicleTypeAllowed.
● Vehicle base class → Car, Bike, Truck subclasses.
● IPayable interface with calculateCharges(duration) method.
● Encapsulation: Slot availability shouldn't be altered externally.
● Use constructors for slot initialization with location, vehicle type.
● Operators: (baseRate × hours) + (penalty if over time).
● Polymorphism: calculateCharges() differs by vehicle type.
● Access Modifiers: internal booking records are private, exposed via logs.
 * */


package com.smartparkingmanagementsystem;

import java.util.Scanner;

public class UseSmartParkingManagementSystem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ParkingSlot[] slots = { new ParkingSlot(101, "Car"), new ParkingSlot(102, "Bike"),
				new ParkingSlot(103, "Truck") };

		System.out.println("================================================");
		System.out.println("           WELCOME TO PARKEASE SYSTEM");
		System.out.println("================================================\n");

		// Display available slots
		System.out.println("Available Parking Slots:");
		System.out.println("------------------------------------------------");
		for (ParkingSlot slot : slots) {
			String status = slot.isAvailable() ? "Available" : "Occupied";
			System.out.println(slot.getSlotId() + " - " + slot.getAllowedVehicleType() + " Slot (" + status + ")");
		}
		System.out.println("------------------------------------------------\n");

		// Ask for vehicle details
		System.out.print("Enter Vehicle Type (Car/Bike/Truck) : ");
		String type = input.nextLine().trim();

		System.out.print("Enter Vehicle Number                : ");
		String number = input.nextLine().trim();

		System.out.print("Enter Parking Hours                 : ");
		int hours = input.nextInt();

		Vehicle vehicle = null;

		if (type.equalsIgnoreCase("Car"))
			vehicle = new Car(number);
		else if (type.equalsIgnoreCase("Bike"))
			vehicle = new Bike(number);
		else if (type.equalsIgnoreCase("Truck"))
			vehicle = new Truck(number);
		else {
			System.out.println("\nInvalid vehicle type!");
			input.close();
			return;
		}

		boolean parked = false;

		for (ParkingSlot slot : slots) {
			if (slot.isAvailable() && slot.canPark(type)) {
				slot.parkVehicle(vehicle);
				double bill = slot.calculateCharges(hours);

				System.out.println();
				System.out.println("------------------------------------------------");
				System.out.println("Parking Slot Assigned Successfully!");
				System.out.println("------------------------------------------------");
				System.out.println("Slot ID        : " + slot.getSlotId());
				System.out.println("Vehicle Number : " + number);
				System.out.println("Hours Parked   : " + hours);
				System.out.println("Total Charges  : " + bill + " Rs");
				System.out.println("------------------------------------------------");

				parked = true;
				break;
			}
		}

		if (!parked) {
			System.out.println("------------------------------------------------");
			System.out.println("No available slot for this vehicle type");
			System.out.println("------------------------------------------------");
		}

		System.out.println("\n================================================");
		System.out.println("          THANK YOU FOR USING PARKEASE");
		System.out.println("================================================");

		input.close();
	}
}
