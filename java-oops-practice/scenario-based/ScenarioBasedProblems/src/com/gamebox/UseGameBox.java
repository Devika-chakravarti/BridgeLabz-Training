/* Scenario-based: 24
 * 
 * "GameBox – Mobile Game Distribution Platform"
Story: GameBox offers mobile games for download and purchase with features like demos,
reviews, and leaderboards.
Requirements:
● Game class: title, genre, price, rating.
● User class with list of owned games.
● Interface IDownloadable: download(), playDemo().
● Constructors to set up free or paid games.
● Use operators to apply seasonal offers.
● Encapsulation: user-owned game data protected.
● Inheritance: ArcadeGame, StrategyGame from Game.
● Polymorphism: playDemo() behaves differently per genre.
*/

package com.gamebox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseGameBox {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Object of class User
		User user = new User();

		List<Game> games = new ArrayList<>();

		// Arcade Games
		games.add(new ArcadeGame("Speed Racer", 199, 4.5));
		games.add(new ArcadeGame("Galaxy Shooter", 4.2));
		games.add(new ArcadeGame("Brick Breaker", 4.0));

		// Strategy Games
		games.add(new StrategyGame("Chess Master", 4.8));
		games.add(new StrategyGame("Empire Builder", 299, 4.6));
		games.add(new StrategyGame("War Tactician", 149, 4.3));

		System.out.println("=========================================================");
		System.out.println("               WELCOME TO GAMEBOX PLATFORM");
		System.out.println("=========================================================");
		
		while (true) {
			System.out.println("1. View Available Games");
			System.out.println("2. Download / Purchase Game");
			System.out.println("3. Play Game Demo");
			System.out.println("4. View Owned Games");
			System.out.println("5. Apply Seasonal Offer");
			System.out.println("6. Exit");
			System.out.println("----------------------------------------------------------");
			System.out.print("Enter your choice: ");

			int choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.println("----------------------------------------------------------");
				System.out.println("AVAILABLE GAMES:");
				System.out.println("----------------------------------------------------------");
				System.out.println("ID   Title               Genre       Price   Rating");
				System.out.println("----------------------------------------------------------");

				int id = 1;
				for (Game game : games) {
					String price = game.isFree() ? "FREE" : String.valueOf((int) game.getPrice());
					System.out.printf("%-4d %-18s %-10s %-7s %.1f%n", id, game.getTitle(), game.getGenre(), price,
							game.getRating());
					id++;
				}
				System.out.println("----------------------------------------------------------");
				break;

			case 2:
				System.out.print("Enter Game ID to download: ");
				int downloadId = input.nextInt();
				if (downloadId >= 1 && downloadId <= games.size()) {
					Game selectedGame = games.get(downloadId - 1);
					System.out.println("----------------------------------------------------------");
					System.out.println("Game: " + selectedGame.getTitle());
					if (!selectedGame.isFree()) {
						System.out.println("Price: " + (int) selectedGame.getPrice());
					}
					selectedGame.download();
					user.addGame(selectedGame);
					System.out.println("----------------------------------------------------------");
				} else {
					System.out.println("Invalid Game ID.");
				}
				break;

			case 3:
				System.out.print("Enter Game ID to play demo: ");
				int demoId = input.nextInt();
				if (demoId >= 1 && demoId <= games.size()) {
					games.get(demoId - 1).playDemo(); 
				} else {
					System.out.println("Invalid Game ID.");
				}
				break;

			case 4:
				user.viewOwnedGames();
				break;

			case 5:
				System.out.print("Enter discount percentage: ");
				double discount = input.nextDouble();
				for (Game game : games) {
					game.applyDiscount(discount);
				}
				System.out.println("----------------------------------------------------------");
				System.out.println("All paid games discounted by " + (int) discount + " percent.");
				System.out.println("----------------------------------------------------------");
				break;

			case 6:
				System.out.println("=========================================================");
				System.out.println("        THANK YOU FOR USING GAMEBOX PLATFORM");
				System.out.println("=========================================================");
				return;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
