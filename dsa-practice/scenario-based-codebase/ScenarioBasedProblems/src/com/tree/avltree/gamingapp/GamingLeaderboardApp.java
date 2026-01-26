/* Story: Gaming App - Real-Time Leaderboard
Gamers earn and lose points rapidly.
Scenarios:
● 🔹 Scenario 1: Insert/Update Player — New players join or existing ones gain points.
● 🔹 Scenario 2: Display Top Players — Return top 10 players in rank.
● 🔹 Scenario 3: Remove Player — Handle user bans or exits efficiently.
 * */

package com.tree.avltree.gamingapp;

import java.util.Scanner;

public class GamingLeaderboardApp {

	public static void main(String[] args) {

		LeaderboardAVL avl = new LeaderboardAVL();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Gaming Leaderboard ---");
			System.out.println("1. Add / Update Player");
			System.out.println("2. Remove Player");
			System.out.println("3. Show Top 10 Players");
			System.out.println("4. Exit");
			System.out.print("Choice: ");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Player ID: ");
				int id = input.nextInt();
				input.nextLine();
				System.out.print("Player Name: ");
				String name = input.nextLine();
				System.out.print("Score: ");
				int score = input.nextInt();
				avl.insert(new Player(id, name, score));
				break;

			case 2:
				System.out.print("Enter score to remove: ");
				int removeScore = input.nextInt();
				avl.remove(removeScore);
				break;

			case 3:
				avl.displayTopPlayers();
				break;

			case 4:
				return;
			}
		}
	}
}
