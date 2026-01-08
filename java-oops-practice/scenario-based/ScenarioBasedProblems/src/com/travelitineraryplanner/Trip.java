package com.travelitineraryplanner;

import java.util.List;

public class Trip {
	protected String destination;
	protected double budget;
	protected int duration; // in days

	protected Transport transport;
	protected Hotel hotel;
	protected List<Activity> activities;

	public Trip(String destination, int duration, Transport transport, Hotel hotel, List<Activity> activities) {
		this.destination = destination;
		this.duration = duration;
		this.transport = transport;
		this.hotel = hotel;
		this.activities = activities;
		calculateBudget();
	}

	protected void calculateBudget() {
		double activitiesCost = 0;
		for (Activity a : activities) {
			activitiesCost += a.getCost();
		}
		this.budget = transport.getCost() + hotel.getTotalCost() + activitiesCost;
	}

	public void showTripDetails() {
		System.out.println("Destination : " + destination);
		System.out.println("Duration    : " + duration + " days");
		System.out.println("Transport   : " + transport.getType() + " Rs " + transport.getCost());
		System.out.println("Hotel       : " + hotel.getName() + " Rs " + hotel.getTotalCost());
		System.out.println("Activities  : ");
		for (int i = 0; i < activities.size(); i++) {
			Activity a = activities.get(i);
			System.out.println(" - " + a.getName() + " Rs " + a.getCost());
		}

		System.out.println("Total Budget: Rs " + budget);
	}
}
