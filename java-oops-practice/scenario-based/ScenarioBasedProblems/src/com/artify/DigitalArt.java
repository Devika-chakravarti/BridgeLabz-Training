package com.artify;

public class DigitalArt extends Artwork {

	// Constructor to initialize digital artwork details
	public DigitalArt(String title, String artist, double price, String licenseType, boolean hasPreview) {
		super(title, artist, price, licenseType, hasPreview);
	}

	// Displays license details specific to digital artwork
	@Override
	public void license() {
		System.out.println("-----------------------------------------------------");
		System.out.println("License Type : " + licenseType);
		System.out.println("Usage        : Commercial + Online use allowed");
		System.out.println("-----------------------------------------------------");
	}
}
