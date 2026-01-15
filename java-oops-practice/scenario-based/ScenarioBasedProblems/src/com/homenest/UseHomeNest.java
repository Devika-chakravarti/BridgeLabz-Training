/* Scenario-based: 22
 * 
 * "HomeNest – Smart Home Device Manager"
Story: A tech company builds HomeNest, a system to control smart lights, ACs, locks, and
cameras.
Requirements:
● Device base class: deviceId, status, energyUsage.
● Subclasses: Light, Camera, Thermostat, Lock.
● Interface IControllable: turnOn(), turnOff(), reset().
● Use constructors to register devices with user.
● Encapsulation: device status cannot be modified externally.
● Operators for energy usage calculations.
● Polymorphism: reset() behavior varies by device.
● Use access modifiers to secure firmware update logs.
 * */

package com.homenest;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class UseHomeNest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		List<Device> devices = new ArrayList<>();

		// Register 4 devices
		devices.add(new Light("1"));
		devices.add(new Thermostat("2"));
		devices.add(new Camera("3"));
		devices.add(new Lock("4"));

		System.out.println("=================================================");
		System.out.println("       WELCOME TO OUR HOMENEST PLATFORM");
		System.out.println("=================================================\n");

		while (true) {
			System.out.println("1. View Registered Devices");
			System.out.println("2. Turn ON a Device");
			System.out.println("3. Turn OFF a Device");
			System.out.println("4. Reset a Device");
			System.out.println("5. View Energy Usage");
			System.out.println("6. Exit");

			System.out.print("Enter your choice: ");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {
			case 1:
				System.out.println("-------------------------------------------------");
				System.out.println("REGISTERED DEVICES");
				System.out.println("-------------------------------------------------");
				System.out.printf("%-4s %-15s %-8s %-12s%n", "ID", "Device Type", "Status", "Energy Usage");
				System.out.println("-------------------------------------------------");
				for (int i = 0; i < devices.size(); i++) {
					Device d = devices.get(i);
					System.out.printf("%-4s %-15s %-8s %-12s%n", d.deviceId, d.getType(), d.getStatus(),
							(int) d.getEnergyUsage() + " kWh");
				}
				System.out.println("-------------------------------------------------");
				break;

			case 2:
				System.out.print("Enter Device ID to turn ON: ");
				String onId = input.nextLine();
				for (int i = 0; i < devices.size(); i++) {
					Device d = devices.get(i);
					if (d.deviceId.equals(onId)) {
						d.turnOn();
					}
				}
				break;

			case 3:
				System.out.print("Enter Device ID to turn OFF: ");
				String offId = input.nextLine();
				for (int i = 0; i < devices.size(); i++) {
					Device d = devices.get(i);
					if (d.deviceId.equals(offId)) {
						d.turnOff();
					}
				}
				break;

			case 4:
				System.out.print("Enter Device ID to reset: ");
				String resetId = input.nextLine();
				for (int i = 0; i < devices.size(); i++) {
					Device d = devices.get(i);
					if (d.deviceId.equals(resetId)) {
						d.reset();
					}
				}
				break;

			case 5:
				System.out.println("-------------------------------------------------");
				System.out.println("TOTAL ENERGY USAGE");
				System.out.println("-------------------------------------------------");
				double total = 0;
				for (int i = 0; i < devices.size(); i++) {
					Device d = devices.get(i);
					System.out.printf("%-12s : %d kWh%n", d.getType(), (int) d.getEnergyUsage());
					total += d.getEnergyUsage();
				}
				System.out.println("-------------------------------------------------");
				System.out.println("Total Energy Usage : " + (int) total + " kWh");
				System.out.println("-------------------------------------------------");
				break;

			case 6:
				System.out.println("\n=================================================");
				System.out.println("   THANK YOU FOR USING OUR HOMENEST PLATFORM");
				System.out.println("=================================================");
				return;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
