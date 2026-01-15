package com.trafficmanager;

class RoundaboutManager {

	private VehicleNode head;
	private VehicleNode tail;
	private int currentCars;
	private int maxCapacity;

	RoundaboutManager(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		this.currentCars = 0;
		this.head = null;
		this.tail = null;
	}

	public boolean isFull() {
		return currentCars == maxCapacity;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addCar(String carId) {

		VehicleNode newCar = new VehicleNode(carId);

		if (isEmpty()) {
			head = tail = newCar;
			newCar.next = head;
		} else {
			tail.next = newCar;
			newCar.next = head;
			tail = newCar;
		}

		currentCars++;
		System.out.println("Car " + carId + " entered the roundabout");
	}

	public void removeCar() {

		if (isEmpty()) {
			System.out.println("Roundabout is empty");
			return;
		}

		System.out.println("Car " + head.carId + " exited the roundabout");

		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
			tail.next = head;
		}

		currentCars--;
	}

	public void displayRoundabout() {

		if (isEmpty()) {
			System.out.println("Roundabout is empty");
			return;
		}

		System.out.print("Roundabout cars: ");
		VehicleNode temp = head;

		do {
			System.out.print(temp.carId + " -> ");
			temp = temp.next;
		} while (temp != head);

		System.out.println("(back to " + head.carId + ")");
	}
}
