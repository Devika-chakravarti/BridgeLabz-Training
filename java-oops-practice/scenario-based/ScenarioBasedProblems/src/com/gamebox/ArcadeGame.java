package com.gamebox;

public class ArcadeGame extends Game {

	// constructor for paid games
	public ArcadeGame(String title, double price, double rating) {
		super(title, "Arcade", price, rating);
	}

	// constructor for free games
	public ArcadeGame(String title, double rating) {
		super(title, "Arcade", rating);
	}

	@Override
	public void playDemo() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Arcade Game Demo");
		System.out.println("Fast-paced action gameplay running.");
		System.out.println("----------------------------------------------------------");
	}
}
