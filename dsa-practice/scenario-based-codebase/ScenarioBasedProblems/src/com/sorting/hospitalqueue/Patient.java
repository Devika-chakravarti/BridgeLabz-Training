package com.sorting.hospitalqueue;

class Patient {
	String name;
	int arrivalTime;
	int criticality;

	Patient(String name, int arrivalTime, int criticality) {
		this.name = name;
		this.arrivalTime = arrivalTime;
		this.criticality = criticality;
	}

	void show() {
		System.out.println(name + " | Arrival: " + arrivalTime + " | Criticality: " + criticality);
	}
}
