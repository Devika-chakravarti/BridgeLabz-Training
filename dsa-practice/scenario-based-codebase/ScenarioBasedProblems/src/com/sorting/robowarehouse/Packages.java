package com.sorting.robowarehouse;

public class Packages {
	protected int packageID;
	protected double weight;
	
	public Packages(int packageID, double weight) {
		this.packageID = packageID;
		this.weight = weight;
	}
	
	public void display() {
		System.out.println(packageID + " | " + weight);
	}
}
