package com.trafficmanager;

class VehicleNode {
	String carId;
	VehicleNode next;

	VehicleNode(String carId) {
		this.carId = carId;
		this.next = null;
	}
}
