/* Scenario-based: 7
 * 
 * CinemaHouse – Movie Time Sorting (Bubble Sort)
Story: A small local cinema lists daily movie shows. The screen manager updates showtimes
manually and prefers a simple sorting logic. Since the number of shows is small (~10), Bubble
Sort is used.
Key Concepts:
● Manual data entry, simple logic
● Small dataset
● Minimal code complexity
*/

package com.sorting.cinemahouse;

import java.util.Scanner;

public class CinemaHouse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("      CinemaHouse - Movie Time Sorting");
		System.out.println("==============================================\n");

		System.out.print("Enter number of movie shows: ");
		int numberOfMovieShows = input.nextInt();
		input.nextLine();

		MovieShow[] shows = new MovieShow[numberOfMovieShows];

		for (int i = 0; i < numberOfMovieShows; i++) {
			System.out.println("\nShow " + (i + 1));
			System.out.print("Movie Name: ");
			String name = input.nextLine();
			System.out.print("Show Time (HHMM): ");
			int time = input.nextInt();
			input.nextLine();

			shows[i] = new MovieShow(name, time);
		}

		// Bubble Sort by show time (ascending)
		for (int i = 0; i < numberOfMovieShows - 1; i++) {
			for (int j = 0; j < numberOfMovieShows - i - 1; j++) {
				if (shows[j].showTime > shows[j + 1].showTime) {
					MovieShow temp = shows[j];
					shows[j] = shows[j + 1];
					shows[j + 1] = temp;
				}
			}
		}

		System.out.println("\nSorted Movie Shows (By Time):");
		for (int i = 0; i < numberOfMovieShows; i++) {
			shows[i].display();
		}

	}
}
