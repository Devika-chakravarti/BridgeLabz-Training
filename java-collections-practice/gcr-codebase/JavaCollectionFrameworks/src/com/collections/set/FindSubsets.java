/*Find Subsets
Check if one set is a subset of another.
Example:
Set1: {2, 3}, Set2: {1, 2, 3, 4} → Output: true.
*/

package com.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class FindSubsets {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		System.out.print("Enter number of elements in Set 1: ");
		int n1 = input.nextInt();

		System.out.println("Enter elements of Set 1:");
		for (int i = 0; i < n1; i++) {
			set1.add(input.nextInt());
		}

		System.out.print("Enter number of elements in Set 2: ");
		int n2 = input.nextInt();

		System.out.println("Enter elements of Set 2:");
		for (int i = 0; i < n2; i++) {
			set2.add(input.nextInt());
		}

		// using containsAll method
		boolean isSubset = set2.containsAll(set1);

		System.out.println(isSubset);
	}
}
