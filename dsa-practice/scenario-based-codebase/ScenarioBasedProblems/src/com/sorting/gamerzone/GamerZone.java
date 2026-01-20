/* GamerZone – High Score Ranking System (Quick Sort)
Story: A global multiplayer game needs to rank thousands of players in real-time based on their
scores after every match. The list is dynamic, large, and often unsorted. Quick Sort is used to
reorder players quickly for leaderboards.
Concepts Involved:
● Quick Sort
● Sorting dynamic, large datasets
● Performance-driven solution
*/

package com.sorting.gamerzone;

import java.util.Scanner;

public class GamerZone {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("==========================================");
		System.out.println("  GamerZone – High Score Ranking System");
		System.out.println("==========================================\n");

		System.out.print("Enter the number of players: ");
		int numberOfPlayers = input.nextInt();

		Scores[] scores = new Scores[numberOfPlayers];

		System.out.println("\nScore rankings of players:");
		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.print("\nEnter the player ID: ");
			int playerId = input.nextInt();
			input.nextLine();
			System.out.print("Enter the player name: ");
			String playerName = input.nextLine();
			System.out.print("Enter the score: ");
			int score = input.nextInt();

			scores[i] = new Scores(playerId, playerName, score);
		}

		quicksort(scores, 0, numberOfPlayers - 1);
		System.out.println("\nHigh Score ranking list");
		System.out.println("------------------------------------------");
		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.print("Rank " + (i + 1) + " | ");
			scores[i].display();
		}
	}

	// Quick sort logic
	public static void quicksort(Scores[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			quicksort(arr, low, p - 1);
			quicksort(arr, p + 1, high);
		}
	}

	// Partitioning based on pivot element
	public static int partition(Scores[] arr, int low, int high) {
		double pivot = arr[high].score;
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j].score >= pivot) {
				i++;
				Scores temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		Scores temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}
}
