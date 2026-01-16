package com.sorting.cropmonitor;

public class SensorData {
	protected int sensorID;
	protected long timestamp;
	protected double temperature;

	public SensorData(int sensorID, long timestamp, double temperature) {
		this.sensorID = sensorID;
		this.timestamp = timestamp;
		this.temperature = temperature;
	}

	public void display() {
		System.out.println(sensorID + " | " + timestamp + " | " + temperature);
	}
}
