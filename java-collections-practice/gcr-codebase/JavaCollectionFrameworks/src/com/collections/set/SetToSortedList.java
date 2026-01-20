/*Convert a Set to a Sorted List
Convert a HashSet of integers into a sorted list in ascending order.
Example:
Input: {5, 3, 9, 1} → Output: [1, 3, 5, 9].
*/

package com.collections.set;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Scanner;

public class SetToSortedList {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		Set<Integer> set = new HashSet<>();

		System.out.print("Enter the number of elements: ");
		int n = input.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			set.add(input.nextInt());
		}

		// arraylist to store the list after sorting
		List<Integer> sortedList = new ArrayList<>(set);

		// using sort method
		Collections.sort(sortedList);

		System.out.println("Sorted list: " + sortedList);
	}
}
