/*IoT Sensor Readings
○ Scenario: Print all readings above threshold.
○ Task: Use streams with forEach().*/

package com.streamapi.foreachmethod;

import java.util.*;

class SensorReading {
	private String sensorId;
	private double value;
	public SensorReading(String sensorId, double value) {
		this.sensorId = sensorId;
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	@Override
	public String toString() {
		return sensorId + " : " + value;
	}
}

public class IoTSensorReadings {
	private static boolean isAboveThreshold(SensorReading reading, double threshold) {
		return reading.getValue() > threshold;
	}

	private static void printReadingsAboveThreshold(List<SensorReading> readings, double threshold) {
		readings.stream().filter(reading -> isAboveThreshold(reading, threshold)) 
				.forEach(reading -> System.out.println(reading));
	}

	public static void main(String[] args) {
		List<SensorReading> readings = Arrays.asList(new SensorReading("S1", 28.5), new SensorReading("S2", 35.2),
				new SensorReading("S3", 19.8), new SensorReading("S4", 42.1));
		double threshold = 30.0;
		printReadingsAboveThreshold(readings, threshold);
	}
}
