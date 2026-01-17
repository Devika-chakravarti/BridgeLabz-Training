/* Scenario-based: 11
 * 
 * IceCreamRush – Sorting Flavors by Popularity (Bubble Sort)
Story: At “IceCreamRush,” a small local vendor sells 8 different ice cream flavors. At the end of
each week, the shopkeeper wants to sort these flavors based on how many times each was
sold. Since the list is short and he updates it manually, he prefers a simple sorting method —
Bubble Sort — where he repeatedly compares adjacent sales figures and swaps them if
Needed.

Concepts Involved:
● Bubble Sort
● Small data size
● Repeated adjacent comparisons
 * */

package com.sorting.icecreamrush;

import java.util.Scanner;

public class IceCreamRush {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("====================================================");
		System.out.println("     IceCreamRush – Sorting Flavors by Popularity");
		System.out.println("====================================================\n");

		IceCreams[] icecreamFlavours = new IceCreams[8];

		System.out.println("\nIcecreams");
		
		for (int i = 0; i < 8; i++) {
			System.out.print("IceCream flavour " + (i + 1) + ": ");
			String iceCreamFlavour = input.next();
			System.out.print("Number of icecream sold: ");
			int quantity = input.nextInt();

			icecreamFlavours[i] = new IceCreams(iceCreamFlavour, quantity);
		}

		// Bubble sort logic
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8 - i - 1; j++) {
				if (icecreamFlavours[j].quantity > icecreamFlavours[j + 1].quantity) {
					IceCreams temp = icecreamFlavours[j];
					icecreamFlavours[j] = icecreamFlavours[j + 1];
					icecreamFlavours[j + 1] = temp;
				}
			}
		}
		System.out.println("\nSorted all 8 IceCream flavours based on sold quantity (ascending order):");
		for (int i = 0; i < 8; i++) {
			icecreamFlavours[i].display();
		}
	}
}
