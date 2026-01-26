/* Story: Music App - Organize Songs by Track ID
A music streaming app organizes tracks in a library using track IDs.
Scenarios:
● 🔹 Scenario 1: Search Track — Users want to search a song using track ID.
● 🔹 Scenario 2: Insert New Track — Add new releases to the library.
● 🔹 Scenario 3: Show Playlist Alphabetically — In-order traversal by song title.
 * */

package com.tree.binarysearchtree.musicapp;

import java.util.Scanner;

public class MusicAppBST {

	public static void main(String[] args) {

		SongBST bst = new SongBST();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("==============================================");
			System.out.println("            WELCOME TO MY MUSIC APP");
			System.out.println("==============================================\n");

			System.out.println("1. Add Song");
			System.out.println("2. Search Song");
			System.out.println("3. Display Playlist");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter Track ID: ");
				int id = input.nextInt();
				input.nextLine();
				System.out.print("Enter Song Title: ");
				String title = input.nextLine();
				System.out.print("Enter Artist Name: ");
				String artist = input.nextLine();
				bst.insert(new Song(id, title, artist));
				break;

			case 2:
				System.out.print("Enter Track ID to search: ");
				int searchId = input.nextInt();
				Song song = bst.search(searchId);
				System.out.println(song != null ? song : "Song not found");
				break;

			case 3:
				bst.displayPlaylist();
				break;

			case 4:
				System.out.println("\n==============================================");
				System.out.println("     THANK YOU FOR USING MY MUSIC APP");
				System.out.println("==============================================");
				return;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
