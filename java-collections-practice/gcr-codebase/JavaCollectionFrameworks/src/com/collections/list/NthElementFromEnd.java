/*Find the Nth Element from the End
Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
Example:
Input: [A, B, C, D, E], N=2 → Output: D.
*/

package com.collections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NthElementFromEnd {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		List<String> list = new LinkedList<>();

		System.out.print("Enter the number of elements: ");
		int numberOfElements = input.nextInt();
		input.nextLine();

		System.out.println("Enter elements:");
		for (int i = 0; i < numberOfElements; i++) {
			list.add(input.nextLine());
		}

		System.out.print("Enter N(from end): ");
		int n = input.nextInt();

		int fast = 0, slow = 0;

		// loop used to move fast pointer n steps ahead
		for (int i = 0; i < n; i++) {
			if (fast >= list.size()) {
				System.out.println("n is greater than list length");
				return;
			}
			fast++;
		}

		// move both the pointers
		while (fast < list.size()) {
			fast++;
			slow++;
		}

		System.out.println("Nth element from end: " + list.get(slow));
	}
}
