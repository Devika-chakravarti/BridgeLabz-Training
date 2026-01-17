package com.sorting.artexpo;

public class Artists {
	protected int artistID;
	protected String artistName;
	protected int registrationTime; // HHMM

	public Artists(int artistID, String artistName, int registrationTime) {
		this.artistID = artistID;
		this.artistName = artistName;
		this.registrationTime = registrationTime;
	}

	public void display() {
		System.out.println(artistID + " | " + artistName + " | " + registrationTime);
	}
}
