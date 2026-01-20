/*Check if Two Sets Are Equal
Compare two sets and determine if they contain the same elements, regardless of order.
Example:
Set1: {1, 2, 3}, Set2: {3, 2, 1} → Output: true.
*/

package com.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class CheckForEqualSets {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		System.out.print("Enter the number of elements in Set 1: ");
		int n1 = input.nextInt();

		System.out.println("Enter elements of Set 1:");
		for (int i = 0; i < n1; i++) {
			set1.add(input.nextInt());
		}

		System.out.print("Enter the number of elements in Set 2: ");
		int n2 = input.nextInt();

		System.out.println("Enter elements of Set 2:");
		for (int i = 0; i < n2; i++) {
			set2.add(input.nextInt());
		}

		// equals method use
		boolean isEqual = set1.equals(set2);

		System.out.println(isEqual);
	}
}
