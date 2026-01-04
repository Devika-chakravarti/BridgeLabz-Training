/*Two Sum Problem
Problem: Given an array and a target sum, find two indices such that their values add up to the target.
Hint: Use a hash map to store the index of each element as you iterate. Check if target - current_element exists in the map.
*/

package com.hashmapsandhashfunctions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] arr, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			int needed = target - arr[i];

			// If required value already seen
			if (map.containsKey(needed)) {
				return new int[] { map.get(needed), i };
			}

			// Store current value with index
			map.put(arr[i], i);
		}

		// no pair found
		return new int[] { -1, -1 }; 
	}

	public static void main(String[] args) {

		int[] arr = { 2, 7, 11, 15 };
		int target = 9;

		int[] result = twoSum(arr, target);

		System.out.println(result[0] + " " + result[1]); 
	}
}
