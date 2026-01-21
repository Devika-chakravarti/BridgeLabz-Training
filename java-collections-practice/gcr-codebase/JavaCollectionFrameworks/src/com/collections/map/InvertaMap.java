/*Invert a Map
Invert a Map<K, V> to produce a Map<V, K>. Handle duplicate values by storing them in a list.
Example:
Input: {A=1, B=2, C=1} → Output: {1=[A, C], 2=[B]}.
*/

package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class InvertaMap {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		// Original map logic
		Map<String, Integer> originalMap = new HashMap<>();

		System.out.print("Enter the number of entries: ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter key(String): ");
			String key = input.next();

			System.out.print("Enter value(Integer): ");
			int value = input.nextInt();

			originalMap.put(key, value);
		}

		// Inverted map logic
		Map<Integer, List<String>> invertedMap = new HashMap<>();

		for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();

			// if value not in the invertedMap then create new list
			if (!invertedMap.containsKey(value)) {
				invertedMap.put(value, new ArrayList<String>());
			}

			// add key to the list and it's corresponding value
			invertedMap.get(value).add(key);
		}

		System.out.println("Original Map: " + originalMap);
		System.out.println("Inverted Map: " + invertedMap);
	}
}
