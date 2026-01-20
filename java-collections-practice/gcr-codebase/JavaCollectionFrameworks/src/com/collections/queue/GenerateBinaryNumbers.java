/*Generate Binary Numbers Using a Queue
Generate the first N binary numbers (as strings) using a queue.
Example:
N=5 → Output: ["1", "10", "11", "100", "101"].
*/

package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		Queue<String> queue = new LinkedList<>();

		System.out.print("Enter the value of N: ");
		int n = input.nextInt();

		queue.add("1");

		System.out.print("Binary numbers: [");

		for (int i = 0; i < n; i++) {
			String current = queue.remove();

			System.out.print(current);
			if (i != n - 1) {
				System.out.print(", ");
			}

			queue.add(current + "0");
			queue.add(current + "1");
		}

		System.out.println("]");
	}
}
