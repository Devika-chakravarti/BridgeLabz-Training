package com.artify;

public class PrintArt extends Artwork {

	// Constructor to initialize print artwork details
	public PrintArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}

	// Displays license details specific to print artwork
	@Override
	public void license() {
		System.out.println("-----------------------------------------------------");
		System.out.println("License Type : " + licenseType);
		System.out.println("Usage        : Physical prints only");
		System.out.println("-----------------------------------------------------");
	}
}
