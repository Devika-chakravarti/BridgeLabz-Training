package com.smartparkingmanagementsystem;

public class ParkingSlot implements IPayable {

	private int slotId;
	private boolean occupied;
	private String allowedVehicleType;
	private Vehicle parkedVehicle;

	public ParkingSlot(int slotId, String allowedVehicleType) {
		this.slotId = slotId;
		this.allowedVehicleType = allowedVehicleType;
		this.occupied = false;
	}

	public boolean isAvailable() {
		return !occupied;
	}

	public boolean canPark(String vehicleType) {
		return allowedVehicleType.equalsIgnoreCase(vehicleType);
	}

	public void parkVehicle(Vehicle vehicle) {
		this.parkedVehicle = vehicle;
		this.occupied = true;
	}

	public int getSlotId() {
		return slotId;
	}

	public String getAllowedVehicleType() {
		return allowedVehicleType;
	}

	@Override
	public double calculateCharges(int hours) {
		double amount = parkedVehicle.getBaseRate() * hours;
		if (hours > 5) { // overtime penalty Rs 100
			amount += 100;
		}
		return amount;
	}
}
