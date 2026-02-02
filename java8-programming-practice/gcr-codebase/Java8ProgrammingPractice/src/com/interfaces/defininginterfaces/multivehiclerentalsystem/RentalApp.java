/*Multi-Vehicle Rental System
○ Scenario: Cars, bikes, and buses share rent() and returnVehicle()
methods.
○ Task: Use interface-based design.*/

package com.interfaces.defininginterfaces.multivehiclerentalsystem;

public class RentalApp {
	public static void main(String[] args) {

		RentalVehicle car = new Car();
		RentalVehicle bike = new Bike();
		RentalVehicle bus = new Bus();

		car.rent();
		bike.rent();
		bus.rent();

		car.returnVehicle();
		bike.returnVehicle();
		bus.returnVehicle();
	}
}
