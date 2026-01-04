/*Stock Span Problem
Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).
Hint: Use a stack to keep track of indices of prices in descending order.
*/

package com.stacksandqueues;

import java.util.Stack;

public class StockSpanProblem {

	public static int[] calculateSpan(int[] prices) {
		int n = prices.length;
		int[] span = new int[n];
		// stores indices
		Stack<Integer> stack = new Stack<>(); 

		for (int i = 0; i < n; i++) {

			// Remove smaller or equal prices
			while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
				stack.pop();
			}

			// If stack empty, span is full range
			if (stack.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - stack.peek();
			}

			// Push current index
			stack.push(i);
		}

		return span;
	}

	public static void main(String[] args) {
		int[] prices = { 100, 80, 60, 70, 60, 75, 85 };

		int[] result = calculateSpan(prices);

		for (int val : result) {
			System.out.print(val + " ");
		}
	}
}
