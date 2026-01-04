/*Check for a Pair with Given Sum in an Array
Problem: Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.
Hint: Store visited numbers in a hash map and check if target - current_number exists in the map.*/

package com.hashmapsandhashfunctions;

import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {

	public static boolean hasPair(int[] arr, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			int required = target - arr[i];

			// Check if required number already seen
			if (map.containsKey(required)) {
				return true;
			}

			// Store current element
			map.put(arr[i], i);
		}

		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 8, 7, 2, 5, 3, 1 };
		int target = 10;

		System.out.println(hasPair(arr, target)); 
	}
}
