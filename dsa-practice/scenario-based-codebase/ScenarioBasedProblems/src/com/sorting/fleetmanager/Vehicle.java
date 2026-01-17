package com.sorting.fleetmanager;

public class Vehicle {
	protected int vehicleID;
	protected String vehicleName;
	protected int mileage;

	public Vehicle(int vehicleID, String vehicleName, int mileage) {
		this.vehicleID = vehicleID;
		this.vehicleName = vehicleName;
		this.mileage = mileage;
	}
}
