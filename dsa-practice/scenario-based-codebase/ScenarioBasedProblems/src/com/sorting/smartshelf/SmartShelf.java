/* Scenario-based: 2
 * 
 * SmartShelf – Real-Time Book Arrangement (Insertion Sort)
 * Story: In a digital library kiosk, as users add books to their reading list,
 * the system must keep the list sorted alphabetically by title.
 * Since books are added one at a time and the list is mostly sorted,
 * Insertion Sort fits perfectly.
 * Key Concepts:
 * ● Online / real-time sorting
 * ● Efficient for nearly sorted data
 * ● Stable sorting by title
 */

package com.sorting.smartshelf;

import java.util.Scanner;

public class SmartShelf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("        SmartShelf - Digital Library");
		System.out.println("==============================================\n");

		System.out.print("Enter number of books: ");
		int n = input.nextInt();
		input.nextLine();

		Book[] books = new Book[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nBook " + (i + 1));
			System.out.print("Title: ");
			String title = input.nextLine();
			System.out.print("Author: ");
			String author = input.nextLine();

			books[i] = new Book(title, author);

			// Insertion Sort to place new book at correct position
			for (int j = i; j > 0; j--) {
				if (books[j - 1].title.compareToIgnoreCase(books[j].title) > 0) {
					Book temp = books[j];
					books[j] = books[j - 1];
					books[j - 1] = temp;
				} else {
					break;
				}
			}
		}

		System.out.println("\nReading List (Alphabetically Sorted):");
		for (int i = 0; i < n; i++) {
			books[i].show();
		}

		input.close();
	}
}
