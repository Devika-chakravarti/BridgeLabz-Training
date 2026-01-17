/* Scenario-based: 9
 * 
 * ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: At an art exhibition, artists register throughout the day. The system continuously adds
each entry and maintains a sorted list by registration time for booth assignment. Insertion Sort
fits well due to the incremental nature.
Key Concepts:
● Real-time insertion
● Nearly sorted data
● Time-based ordering
*/

package com.sorting.artexpo;

import java.util.Scanner;

public class ArtExpo {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("============================");
		System.out.println("         ArtExpo");
		System.out.println("============================\n");

		System.out.print("Enter number of artists: ");
		int numberOfArtists = input.nextInt();
		input.nextLine();

		Artists[] artists = new Artists[numberOfArtists];

		for (int i = 0; i < numberOfArtists; i++) {
			System.out.println("\nArtist " + (i + 1));
			System.out.print("Artist ID: ");
			int artistID = input.nextInt();
			input.nextLine();
			System.out.print("Artist name: ");
			String artistName = input.nextLine();
			System.out.print("Registartion time (HHMM): ");
			int registrationTime = input.nextInt();

			artists[i] = new Artists(artistID, artistName, registrationTime);

			for (int j = i; j > 0; j--) {
				if (artists[j].registrationTime < artists[j - 1].registrationTime) {
					Artists temp = artists[j];
					artists[j] = artists[j - 1];
					artists[j - 1] = temp;
				} else {
					break;
				}
			}
		}
		System.out.println("\nArtists are sorted by registration time(Ascending order): ");
		for (int i = 0; i < numberOfArtists; i++) {
			artists[i].display();
		}
		input.close();
	}
}
