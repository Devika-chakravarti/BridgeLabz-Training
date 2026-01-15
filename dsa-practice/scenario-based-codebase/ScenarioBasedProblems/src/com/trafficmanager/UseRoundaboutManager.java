/*	Scenario-based: 7
 * 
 * TrafficManager – Roundabout Vehicle Flow (Circular Linked List +
Queue)
Story: A smart city roundabout allows vehicles to enter and exit dynamically. Each vehicle is a
node in a Circular Linked List. A Queue manages vehicles waiting to enter.
Requirements:
● Add or remove cars in a circular path.
● Queue overflow/underflow handling.
● Print state of roundabout at any time.
*/

package com.trafficmanager;

import java.util.Scanner;

public class UseRoundaboutManager {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("      WELCOME TO OUR TRAFFIC MANAGER");
		System.out.println("==============================================\n");

		System.out.print("Enter roundabout capacity: ");
		int roundCapacity = input.nextInt();

		System.out.print("Enter waiting queue capacity: ");
		int queueCapacity = input.nextInt();

		RoundaboutManager roundabout = new RoundaboutManager(roundCapacity);
		WaitingQueue waitingQueue = new WaitingQueue(queueCapacity);

		while (true) {

			System.out.println("\n1. Add Car");
			System.out.println("2. Remove Car");
			System.out.println("3. Display Roundabout");
			System.out.println("4. Display Waiting Queue");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Car ID: ");
				String carId = input.next();

				if (!roundabout.isFull()) {
					roundabout.addCar(carId);
				} else {
					waitingQueue.enqueue(carId);
				}
				break;

			case 2:
				roundabout.removeCar();
				String nextCar = waitingQueue.dequeue();
				if (nextCar != null) {
					roundabout.addCar(nextCar);
				}
				break;

			case 3:
				roundabout.displayRoundabout();
				break;

			case 4:
				waitingQueue.displayQueue();
				break;

			case 5:
				System.out.println("\n==============================================");
				System.out.println("   THANK YOU FOR USING OUR TRAFFIC MANAGER");
				System.out.println("==============================================");
				return;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
