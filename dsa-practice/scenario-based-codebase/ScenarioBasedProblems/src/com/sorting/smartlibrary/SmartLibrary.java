/* Scenario-based: 12
 * 
 * SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: A digital kiosk in a library maintains a list of books a user has borrowed. Every time a
new book is issued, the system adds it to the user's list while keeping it alphabetically sorted
by title. Since insertions are done one at a time, and the list is usually already sorted, Insertion
Sort is the perfect fit.

Concepts Involved:
● Insertion Sort
● Dynamic list insertion
● Nearly sorted data
*/

package com.sorting.smartlibrary;

import java.util.Scanner;

public class SmartLibrary {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("   SmartLibrary – Auto-Sort Borrowed Books");
		System.out.println("==============================================\n");

		System.out.print("Enter the number of books: ");
		int numberOfBooks = input.nextInt();
		input.nextLine();

		Book[] books = new Book[numberOfBooks];

		for (int i = 0; i < numberOfBooks; i++) {
			System.out.println("\nBooks " + (i + 1));
			System.out.print("Title: ");
			String title = input.nextLine();
			System.out.print("Author: ");
			String author = input.nextLine();

			books[i] = new Book(title, author);

			// Insertion sort logic
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
		System.out.println("\nBooks arranged (alphabetically sorted):");
		for (int i = 0; i < numberOfBooks; i++) {
			books[i].display();
		}
	}
}
