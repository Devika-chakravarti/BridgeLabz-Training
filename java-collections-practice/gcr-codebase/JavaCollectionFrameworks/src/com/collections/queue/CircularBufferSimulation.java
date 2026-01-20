/*Circular Buffer Simulation
Implement a circular buffer (fixed-size queue) using an array-based queue. When full, overwrite the oldest element.
Example:
Buffer size=3: Insert 1, 2, 3 → Insert 4 → Buffer: [2, 3, 4].
*/

package com.collections.queue;

import java.util.Scanner;

class CircularBuffer {
	private int[] buffer;
	private int size;
	private int front = 0;
	private int rear = 0;
	private int count = 0;

	public CircularBuffer(int size) {
		this.size = size;
		this.buffer = new int[size];
	}

	public void insert(int value) {
		buffer[rear] = value;
		rear = (rear + 1) % size;

		if (count == size) {
			front = (front + 1) % size;
		} else {
			count++;
		}
	}

	public void display() {
		System.out.print("Buffer: [");
		for (int i = 0; i < count; i++) {
			int index = (front + i) % size;
			System.out.print(buffer[index]);
			if (i != count - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
}

public class CircularBufferSimulation {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter buffer size: ");
		int size = input.nextInt();
		CircularBuffer cb = new CircularBuffer(size);

		System.out.print("Enter the number of inserts: ");
		int n = input.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			int value = input.nextInt();
			cb.insert(value);
			cb.display();
		}
	}
}
