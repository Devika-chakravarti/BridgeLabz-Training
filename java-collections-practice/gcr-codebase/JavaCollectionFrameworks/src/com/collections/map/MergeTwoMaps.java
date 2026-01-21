/*Merge Two Maps
Merge two maps such that if a key exists in both, sum their values.
Example:
Map1: {A=1, B=2}, Map2: {B=3, C=4} → Output: {A=1, B=5, C=4}.
*/

package com.collections.map;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MergeTwoMaps {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		// map1
		Map<String, Integer> map1 = new HashMap<>();
		System.out.print("Enter no of entries for map1: ");
		int n1 = input.nextInt();
		for (int i = 0; i < n1; i++) {
			System.out.print("Enter keys(String): ");
			String key = input.next();
			System.out.print("Enter value(Integer): ");
			int value = input.nextInt();
			map1.put(key, value);
		}

		// map2
		Map<String, Integer> map2 = new HashMap<>();
		System.out.print("Enter no of entries for map2: ");
		int n2 = input.nextInt();
		for (int i = 0; i < n2; i++) {
			System.out.print("Enter keys(String): ");
			String key = input.next();
			System.out.print("Enter value(Integer): ");
			int value = input.nextInt();
			map2.put(key, value);
		}

		// merge map2 into map1
		for (Map.Entry<String, Integer> entry : map2.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();

			map1.put(key, map1.getOrDefault(key, 0) + value);
		}

		System.out.println("Merged map: " + map1);
	}
}
