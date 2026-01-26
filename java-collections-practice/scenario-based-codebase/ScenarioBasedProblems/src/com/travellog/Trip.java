package com.travellog;

import java.io.Serializable;

public class Trip implements Serializable {
	private String city;
	private String country;
	private int duration; 
	private String notes; 

	public Trip(String city, String country, int duration, String notes) {
		this.city = city;
		this.country = country;
		this.duration = duration;
		this.notes = notes;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public int getDuration() {
		return duration;
	}

	public String getNotes() {
		return notes;
	}

	@Override
	public String toString() {
		return "City: " + city + ", Country: " + country + ", Duration: " + duration + " days";
	}
}
