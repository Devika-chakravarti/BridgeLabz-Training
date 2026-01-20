/*Symmetric Difference
Find the symmetric difference (elements present in either set but not in both) of two sets.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Output: {1, 2, 4, 5}.
*/

package com.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class SymmetricDifference {
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

		// Union
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);

		// Intersection
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);

		// Symmetric difference = union - intersection
		union.removeAll(intersection);

		System.out.println("Symmetric difference: " + union);
	}
}
