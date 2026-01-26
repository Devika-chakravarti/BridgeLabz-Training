package com.tree.avltree.gamingapp;

public class Player {

	int playerId;
	String name;
	int score;

	public Player(int playerId, String name, int score) {
		this.playerId = playerId;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "ID: " + playerId + ", Name: " + name + ", Score: " + score;
	}
}
