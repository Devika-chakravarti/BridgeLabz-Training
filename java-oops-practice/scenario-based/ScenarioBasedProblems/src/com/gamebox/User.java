package com.gamebox;

import java.util.ArrayList;
import java.util.List;

public class User {

	// Arraylist to store list of games of two differenct genre 
	private List<Game> ownedGames = new ArrayList<>();

	// Method to add games
	public void addGame(Game game) {
		if (!ownedGames.contains(game)) {
			ownedGames.add(game);
		} else {
			System.out.println("You already own this game.");
		}
	}

	// Method to view the owned games
	public void viewOwnedGames() {
		System.out.println("----------------------------------------------------------");
		if (ownedGames.isEmpty()) {
			System.out.println("You have not downloaded any games yet.");
		} else {
			System.out.println("YOUR GAME LIBRARY:");
			int index = 1;
			for (Game game : ownedGames) {
				System.out.println(index + ". " + game.getTitle());
				index++;
			}
		}
		System.out.println("----------------------------------------------------------");
	}
}
