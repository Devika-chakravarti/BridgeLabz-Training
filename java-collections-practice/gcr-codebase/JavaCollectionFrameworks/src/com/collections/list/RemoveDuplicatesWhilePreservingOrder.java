/**Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].
*/

package com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class RemoveDuplicatesWhilePreservingOrder {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		System.out.print("Enter the number of elements: ");
		int numberOfElements = input.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < numberOfElements; i++) {
			list.add(input.nextInt());
		}

		// arraylist to store elements without any duplicates
		List<Integer> result = new ArrayList<>();
		// stores collection of unique elements
		Set<Integer> seen = new HashSet<>();

		for (int i = 0; i < list.size(); i++) {
			int element = list.get(i);

			if (!seen.contains(element)) {
				seen.add(element);
				result.add(element);
			}
		}

		System.out.println("List after removing duplicates: " + result);
	}
}
