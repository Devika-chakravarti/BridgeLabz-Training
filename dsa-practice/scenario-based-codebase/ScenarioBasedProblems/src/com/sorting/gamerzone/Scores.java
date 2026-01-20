package com.sorting.gamerzone;

public class Scores {
	protected int playerId;
	protected String playerName;
	protected int score;

	public Scores(int playerId, String playerName, int score) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.score = score;
	}

	public void display() {
		System.out.println("Player ID: " + playerId + " | Player Name: " + playerName + " | Score: " + score);
	}
}
