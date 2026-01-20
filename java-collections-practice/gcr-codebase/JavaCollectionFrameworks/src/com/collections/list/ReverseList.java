/* Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].
 * */

package com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseList {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		// ArrayList
		List<Integer> arraylist = new ArrayList<>();

		System.out.println("---- List traversal using ArrayList ----\n");

		// take number of elements
		System.out.print("Enter the number of elements: ");
		int numberOfarrayElements = input.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < numberOfarrayElements; i++) {
			arraylist.add(input.nextInt());
		}

		// arraylist to store list after traversal
		List<Integer> reversedarrayList = new ArrayList<>();
		for (int i = arraylist.size() - 1; i >= 0; i--) {
			reversedarrayList.add(arraylist.get(i));
		}

		System.out.println("Reversed list: " + reversedarrayList);

		System.out.println("\n=========================================\n");

		// LinkedList
		List<Integer> linkedlist = new ArrayList<>();

		System.out.println("---- List traversal using LinkedList ----\n");

		// take number of elements
		System.out.print("Enter the number of elements: ");
		int numberOflinkedlistElements = input.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < numberOflinkedlistElements; i++) {
			linkedlist.add(input.nextInt());
		}

		// linkedlist to store list after traversal
		List<Integer> reversedlinkedList = new ArrayList<>();
		for (int i = linkedlist.size() - 1; i >= 0; i--) {
			reversedlinkedList.add(linkedlist.get(i));
		}

		System.out.println("Reversed list: " + reversedlinkedList);
	}
}
