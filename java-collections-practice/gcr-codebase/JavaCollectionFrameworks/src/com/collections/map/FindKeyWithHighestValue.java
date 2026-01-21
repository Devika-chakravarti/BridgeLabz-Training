/*Find the Key with the Highest Value
Given a Map<String, Integer>, find the key with the maximum value.
Example:
Input: {A=10, B=20, C=15} → Output: B.
*/

package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindKeyWithHighestValue {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		// original map
		Map<String, Integer> map = new HashMap<>();
		System.out.print("Enter no of entries: ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter keys(String): ");
			String key = input.next();
			System.out.print("Enter values(Integer): ");
			int value = input.nextInt();
			map.put(key, value);
		}

		// find key with max value
		String maxKey = null;
		int maxValue = Integer.MIN_VALUE;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();
			}
		}

		System.out.println("Map: " + map);
		System.out.println("Key with highest value: " + maxKey);
	}
}
