package com.gamebox;

public abstract class Game implements IDownloadable {

	private String title;
	private String genre;
	protected double price;
	private double rating;

	// Constructor for paid games
	public Game(String title, String genre, double price, double rating) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = rating;
	}

	// Constructor for free games
	public Game(String title, String genre, double rating) {
		this.title = title;
		this.genre = genre;
		this.price = 0;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public double getPrice() {
		return price;
	}

	public double getRating() {
		return rating;
	}

	public boolean isFree() {
		return price == 0;
	}

	public void applyDiscount(double percentage) {
		if (price > 0) {
			price = price - (price * percentage / 100);
		}
	}

	@Override
	public void download() {
		if (price == 0) {
			System.out.println("Downloaded successfully.");
		} else {
			System.out.println("Purchase successful. Game downloaded.");
		}
	}
}
