package com.artify;

public abstract class Artwork implements IPurchasable {

	// Common properties shared by all artworks
	protected String title;
	protected String artist;
	private double price;
	protected String licenseType;
	protected boolean hasPreview;

	// Constructor without preview information
	public Artwork(String title, String artist, double price, String licenseType) {
		this(title, artist, price, licenseType, false);
	}

	// Main constructor to initialize all artwork details
	Artwork(String title, String artist, double price, String licenseType, boolean hasPreview) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		this.hasPreview = hasPreview;
	}

	// Returns the price of the artwork
	public double getPrice() {
		return price;
	}

	// Displays basic artwork details
	public void displayArtwork() {
		System.out.println("Title  : " + title);
		System.out.println("Artist : " + artist);
		System.out.println("Price  : " + price + " Rs");
		System.out.println("Preview Available : " + (hasPreview ? "Yes" : "No"));
	}

	// Handles purchase logic common to all artworks
	@Override
	public void purchase(User user) {
		// Check if user has sufficient wallet balance
		if (user.getWalletBalance() >= price) {

			System.out.println("-----------------------------------------------------");
			System.out.println("Artwork Purchased Successfully!");
			displayArtwork();
			license();
			System.out.println("Amount Deducted : " + price + " Rs");

			user.setWalletBalance(user.getWalletBalance() - price);

			System.out.println("Remaining Wallet Balance: " + user.getWalletBalance() + " Rs");
			System.out.println("-----------------------------------------------------");

		} else {
			// Message shown when wallet balance is insufficient
			System.out.println("-----------------------------------------------------");
			System.out.println("Insufficient Wallet Balance!");
			System.out.println("-----------------------------------------------------");
		}
	}
}
