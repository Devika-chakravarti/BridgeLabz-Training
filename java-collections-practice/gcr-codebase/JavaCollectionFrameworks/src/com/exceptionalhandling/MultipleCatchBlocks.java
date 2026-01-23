/*Problem Statement:
Create a Java program that performs array operations.
Accept an integer array and an index number.
Retrieve and print the value at that index.
Handle the following exceptions:
ArrayIndexOutOfBoundsException if the index is out of range.
NullPointerException if the array is null.*/

package com.exceptionalhandling;

import java.util.Scanner;

public class MultipleCatchBlocks {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		try {

			// only possible case for ArrayIndexOutOfBoundsException
			System.out.print("Enter the size of the array: ");
			int size = input.nextInt();
			input.nextLine();
			System.out.println("Enter elements:");
			int[] intArray = new int[size];
			for (int i = 0; i < size; i++) {
				intArray[i] = input.nextInt();
			}
			System.out.print("Enter index position: ");
			int index = input.nextInt();
			System.out.println("Value at index " + index + ": " + intArray[index]);

			// possible case for NullPointerException
			// int[] intArray = null; System.out.println(intArray[5]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index!");
		} catch (NullPointerException e) {
			System.out.println("Array is not initialized!");
		}
	}
}
