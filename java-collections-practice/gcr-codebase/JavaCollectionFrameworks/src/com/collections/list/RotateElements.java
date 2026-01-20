/*Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].
*/

package com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateElements {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		System.out.print("Enter the number of elements: ");
		int numberOfElements = input.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < numberOfElements; i++) {
			list.add(input.nextInt());
		}

		System.out.print("Enter rotation count: ");
		int rotationCount = input.nextInt();

		int size = list.size();
		rotationCount = rotationCount % size;

		// arraylist to store the list after rotation
		List<Integer> rotatedList = new ArrayList<>();

		// add elements from rotationCount to end
		for (int i = rotationCount; i < size; i++) {
			rotatedList.add(list.get(i));
		}

		// add first rotationCount elements at end
		for (int i = 0; i < rotationCount; i++) {
			rotatedList.add(list.get(i));
		}

		System.out.println("Rotated list: " + rotatedList);
	}
}
