package com.gamebox;

public class StrategyGame extends Game {

	// constructor for paid games
	public StrategyGame(String title, double price, double rating) {
		super(title, "Strategy", price, rating);
	}

	// constructor for free games
	public StrategyGame(String title, double rating) {
		super(title, "Strategy", rating);
	}

	@Override
	public void playDemo() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Turn-based planning and decision making.");
		System.out.println("----------------------------------------------------------");
	}
}
