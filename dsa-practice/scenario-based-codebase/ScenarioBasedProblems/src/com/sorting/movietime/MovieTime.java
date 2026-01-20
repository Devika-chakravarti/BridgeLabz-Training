/* MovieTime – Theater Show Listings (Insertion Sort)
Story: A movie theater allows users to sort upcoming showtimes. Since shows are added
throughout the day and the existing list is almost sorted, the app uses Insertion Sort to insert
each new show in the correct time slot.
Concepts Involved:
● Insertion Sort
● Real-time insertion
● Time-based ordering
 * */

package com.sorting.movietime;

import java.util.Scanner;

public class MovieTime {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("    MovieTime – Theater Show Listings");
		System.out.println("==============================================");

		System.out.print("Enter the number of shows: ");
		int numberOfShows = input.nextInt();

		Shows[] shows = new Shows[numberOfShows];

		for (int i = 0; i < numberOfShows; i++) {
			System.out.println("\nShow " + (i + 1));
			System.out.print("Enter show Id: ");
			int showId = input.nextInt();
			input.nextLine();
			System.out.print("Enter the show name: ");
			String showName = input.nextLine();
			System.out.print("Enter the show time: ");
			int showTime = input.nextInt();

			shows[i] = new Shows(showId, showName, showTime);

			// Insertion sort logic
			for (int j = i; j > 0; j--) {
				if (shows[j].showTime < shows[j - 1].showTime) {
					Shows temp = shows[j];
					shows[j] = shows[j - 1];
					shows[j - 1] = temp;
				} else {
					break;
				}
			}
		}
		System.out.println("\nTheatre show listings (in ascending order):");
		for (int i = 0; i < numberOfShows; i++) {
			shows[i].display();
		}
	}
}
