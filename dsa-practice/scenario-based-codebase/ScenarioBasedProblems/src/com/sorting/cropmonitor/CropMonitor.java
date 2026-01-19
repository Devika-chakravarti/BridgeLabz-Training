/* Scenario-based: 8
 * 
 * CropMonitor – Sensor Data Ordering (Quick Sort)
Story: An agri-tech firm uses drone sensors that record soil temperatures at random intervals.
The large data needs to be sorted quickly by timestamp before visualization. Quick Sort is
chosen due to its fast average performance.
Key Concepts:
● Unordered sensor data
● High-speed sorting
● Quick partitioning based on timestamps
*/

package com.sorting.cropmonitor;

import java.util.Scanner;

public class CropMonitor {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("      CropMonitor – Sensor Data Ordering");
		System.out.println("==============================================\n");

		System.out.print("Enter number of sensor readings: ");
		int numberOfSensor = input.nextInt();

		SensorData[] readings = new SensorData[numberOfSensor];

		for (int i = 0; i < numberOfSensor; i++) {
			System.out.println("\nSensor reading " + (i + 1));
			System.out.print("Enter the sensorID: ");
			int sensorID = input.nextInt();
			System.out.print("Enter the the timestamp: ");
			long timestamp = input.nextLong();
			System.out.print("Enter the temperature: ");
			double temperature = input.nextDouble();

			readings[i] = new SensorData(sensorID, timestamp, temperature);
		}
		quicksort(readings, 0, numberOfSensor - 1);
		System.out.println("\nSensor data sorted by timestamp (Ascending order):");
		for (int i = 0; i < numberOfSensor; i++) {
			readings[i].display();
		}
	}

	public static void quicksort(SensorData[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			quicksort(arr, low, p - 1);
			quicksort(arr, p + 1, high);
		}
	}

	public static int partition(SensorData[] arr, int low, int high) {
		double pivot = arr[high].timestamp;
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j].timestamp <= pivot) {
				i++;
				SensorData temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		SensorData temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}
}
