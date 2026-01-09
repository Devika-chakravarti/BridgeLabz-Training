/* Scenario-based: 19
 * 
 * "Artify – Digital Art Marketplace"
Story: Artists sell digital art via Artify. Buyers can purchase, license, or subscribe to collections.
Requirements:
● Artwork class: title, artist, price, licenseType.
● User class: name, walletBalance.
● Interface IPurchasable with purchase() and license() methods.
● Encapsulation: licensing terms are protected.
● Use constructors to initialize artworks with or without previews.
● Operators: deduct wallet balance on purchase.
● Inheritance: DigitalArt, PrintArt from Artwork.
● Polymorphism: licensing varies across art types.
 * */

package com.artify;

import java.util.Scanner;

public class UseArtify {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean running = true; // Controls menu loop

		System.out.println("=====================================================");
		System.out.println("            WELCOME TO ARTIFY MARKET");
		System.out.println("=====================================================");

		// Read user details
		System.out.print("Enter your name: ");
		String name = input.nextLine();

		System.out.print("Enter wallet balance: ");
		double balance = input.nextDouble();

		// Create user object
		User user = new User(name, balance);

		// Store digital artworks
		Artwork[] digitalArts = { new DigitalArt("Dreamscape", "Archan Nair", 800, "Premium Digital License", true),
				new DigitalArt("Cyber Muse", "Ravi Verma", 650, "Premium Digital License", true),
				new DigitalArt("Neon City", "Ankit Jain", 900, "Premium Digital License", true),
				new DigitalArt("Abstract Flow", "Meera Shah", 700, "Premium Digital License", false) };

		// Store print artworks
		Artwork[] printArts = { new PrintArt("Nature Sketch", "Sophia", 500, "Standard Print License"),
				new PrintArt("Vintage Portrait", "Rahul Roy", 600, "Standard Print License"),
				new PrintArt("Mountain Lines", "Ananya Sen", 550, "Standard Print License"),
				new PrintArt("Ink Blossom", "Kavya Mehta", 450, "Standard Print License") };

		while (running) {

			System.out.println("\nChoose an option:");
			System.out.println("1. View Artworks");
			System.out.println("2. Purchase Artwork");
			System.out.println("3. View License Details");
			System.out.println("4. Check Wallet Balance");
			System.out.println("5. Exit");

			System.out.print("Enter choice: ");
			int choice = input.nextInt();

			switch (choice) {

			// Displays all available artworks
			case 1:
				System.out.println("\n----------------- Available Artworks -----------------");

				System.out.println("\nDIGITAL ARTWORKS:");
				for (int i = 0; i < digitalArts.length; i++) {
					System.out.println("\n" + (i + 1) + ". Digital Art");
					digitalArts[i].displayArtwork();
				}

				System.out.println("\nPRINT ARTWORKS:");
				for (int i = 0; i < printArts.length; i++) {
					System.out.println("\n" + (i + 1) + ". Print Art");
					printArts[i].displayArtwork();
				}
				break;

			// Handles artwork purchase
			case 2:
				System.out.print("Select Category (1-Digital, 2-Print): ");
				int catChoice = input.nextInt();

				System.out.print("Select Artwork Number: ");
				int artIndex = input.nextInt() - 1;

				if (catChoice == 1 && artIndex < digitalArts.length) {
					digitalArts[artIndex].purchase(user);
				} else if (catChoice == 2 && artIndex < printArts.length) {
					printArts[artIndex].purchase(user);
				} else {
					System.out.println("Invalid choice");
				}
				break;

			// Displays license details without purchasing
			case 3:
				System.out.print("Select Category (1-Digital, 2-Print): ");
				int licCat = input.nextInt();

				System.out.print("Select Artwork Number: ");
				int licIndex = input.nextInt() - 1;

				if (licCat == 1 && licIndex < digitalArts.length) {
					digitalArts[licIndex].license();
				} else if (licCat == 2 && licIndex < printArts.length) {
					printArts[licIndex].license();
				} else {
					System.out.println("Invalid choice");
				}
				break;

			// Displays current wallet balance
			case 4:
				System.out.println("-----------------------------------------------------");
				System.out.println("Wallet Balance: " + user.getWalletBalance() + " Rs");
				System.out.println("-----------------------------------------------------");
				break;

			// Exits the application
			case 5:
				running = false;
				break;

			default:
				System.out.println("Invalid option");
			}
		}

		System.out.println("=====================================================");
		System.out.println("           THANK YOU FOR USING ARTIFY");
		System.out.println("=====================================================");

		input.close();
	}
}
