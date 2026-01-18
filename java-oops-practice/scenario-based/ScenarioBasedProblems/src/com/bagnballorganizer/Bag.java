package com.bagnballorganizer;

import java.util.ArrayList;

public class Bag implements Storable {

	private String bagId;
	private String color;
	private int capacity;
	private ArrayList<Ball> balls;

	public Bag(String bagId, String color, int capacity) {
		this.bagId = bagId;
		this.color = color;
		this.capacity = capacity;
		this.balls = new ArrayList<>();
	}

	@Override
	public String getId() {
		return bagId;
	}

	@Override
	public String getColor() {
		return color;
	}

	// Adds a ball if capacity allows
	public void addBall(Ball ball) {
		if (balls.size() >= capacity) {
			System.out.println("Can't add ball. Bag is full");
			return;
		}
		balls.add(ball);
		System.out.println("Ball added to bag successfully");
	}

	// Removes a ball using its ID
	public void removeBall(String ballId) {
		for (int i = 0; i < balls.size(); i++) {
			if (balls.get(i).getId().equals(ballId)) {
				balls.remove(i);
				System.out.println("Ball removed successfully");
				return;
			}
		}
		System.out.println("Ball not found in this bag");
	}

	// Displays all balls in this bag
	public void displayBalls() {
		if (balls.size() == 0) {
			System.out.println("No balls in this bag");
			return;
		}
		System.out.println("Balls inside bag " + bagId + ":");
		for (int i = 0; i < balls.size(); i++) {
			Ball b = balls.get(i);
			System.out.println("Ball id: " + b.getId() + ", Color: " + b.getColor() + ", Size: " + b.getSize());
		}
	}

	// Number of balls inside the bag
	public int getBallCount() {
		return balls.size();
	}
}
