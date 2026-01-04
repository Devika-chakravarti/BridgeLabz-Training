/*Longest Consecutive Sequence
Problem: Given an unsorted array, find the length of the longest consecutive elements sequence.
Hint: Use a hash map to store elements and check for consecutive elements efficiently.*/

package com.hashmapsandhashfunctions;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

	public static int longestConsecutive(int[] arr) {

		Map<Integer, Boolean> map = new HashMap<>();

		// Store all elements
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], true);
		}

		int maxLength = 0;

		// Check for sequence starts
		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];

			// Start only if previous number does not exist
			if (!map.containsKey(num - 1)) {

				int currentNum = num;
				int count = 1;

				// Count consecutive numbers
				while (map.containsKey(currentNum + 1)) {
					currentNum++;
					count++;
				}

				if (count > maxLength) {
					maxLength = count;
				}
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {

		int[] arr = { 100, 4, 200, 1, 3, 2 };
		System.out.println(longestConsecutive(arr)); 
	}
}
