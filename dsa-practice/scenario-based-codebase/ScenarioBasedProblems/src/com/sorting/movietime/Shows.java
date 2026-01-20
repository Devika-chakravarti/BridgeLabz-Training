package com.sorting.movietime;

public class Shows {
	protected int showId;
	protected String showName;
	protected int showTime;

	public Shows(int showId, String showName, int showTime) {
		this.showId = showId;
		this.showName = showName;
		this.showTime = showTime;
	}

	public void display() {
		System.out.println("Show ID: " + showId + " | Show name: " + showName + " | Show time: " + showTime);
	}
}
