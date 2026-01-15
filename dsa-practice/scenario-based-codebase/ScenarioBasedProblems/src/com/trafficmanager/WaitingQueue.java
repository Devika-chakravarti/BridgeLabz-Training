package com.trafficmanager;

class WaitingQueue {

	private String[] queue;
	private int front;
	private int rear;
	private int size;
	private int capacity;

	WaitingQueue(int capacity) {
		this.capacity = capacity;
		this.queue = new String[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void enqueue(String carId) {

		if (isFull()) {
			System.out.println("Waiting queue is full");
			return;
		}

		rear = (rear + 1) % capacity;
		queue[rear] = carId;
		size++;
		System.out.println("Car " + carId + " added to waiting queue");
	}

	public String dequeue() {

		if (isEmpty()) {
			return null;
		}

		String carId = queue[front];
		front = (front + 1) % capacity;
		size--;
		return carId;
	}

	public void displayQueue() {

		if (isEmpty()) {
			System.out.println("Waiting queue is empty");
			return;
		}

		System.out.print("Waiting queue: ");
		for (int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			System.out.print(queue[index] + " ");
		}
		System.out.println();
	}
}
