/*Sliding Window Maximum
Problem: Given an array and a window size k, find the maximum element in each sliding window of size k.
Hint: Use a deque (double-ended queue) to maintain indices of useful elements in each window.*/

package com.stacksandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

	public static int[] maxSlidingWindow(int[] nums, int k) {

		int n = nums.length;
		int[] result = new int[n - k + 1];
		// stores indices
		Deque<Integer> deque = new LinkedList<>();

		for (int i = 0; i < n; i++) {

			// Remove indices outside the window
			if (!deque.isEmpty() && deque.peekFirst() == i - k) {
				deque.pollFirst();
			}

			// Remove smaller elements
			while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
				deque.pollLast();
			}

			// Add current index
			deque.offerLast(i);

			// Store result once first window is formed
			if (i >= k - 1) {
				result[i - k + 1] = nums[deque.peekFirst()];
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;

		int[] output = maxSlidingWindow(nums, k);

		for (int val : output) {
			System.out.print(val + " ");
		}
	}
}
