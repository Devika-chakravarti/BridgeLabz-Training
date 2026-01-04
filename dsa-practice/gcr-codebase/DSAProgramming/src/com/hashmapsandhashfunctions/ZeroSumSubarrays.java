/*Find All Subarrays with Zero Sum
Problem: Given an array, find all subarrays whose elements sum up to zero.
Hint: Use a hash map to store the cumulative sum and its frequency. If a sum repeats, a zero-sum subarray exists.
*/

package com.hashmapsandhashfunctions;

import java.util.*;

public class ZeroSumSubarrays {

	public static void findZeroSumSubarrays(int[] arr) {

		Map<Integer, List<Integer>> map = new HashMap<>();
		int sum = 0;

		// To handle subarrays starting from index 0
		List<Integer> startList = new ArrayList<>();
		startList.add(-1);
		map.put(0, startList);

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

			// If same sum exists, zero-sum subarray found
			if (map.containsKey(sum)) {

				List<Integer> list = map.get(sum);
				for (int j = 0; j < list.size(); j++) {
					int startIndex = list.get(j);
					System.out.println("Subarray: " + (startIndex + 1) + " to " + i);
				}
			}

			// Add current index to map
			if (!map.containsKey(sum)) {
				map.put(sum, new ArrayList<>());
			}
			map.get(sum).add(i);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
		findZeroSumSubarrays(arr);
	}
}
