/*  Problem Statement:
A school maintains student marks in an array. Implement Bubble Sort to sort the student 
marks in ascending order.
*/

/*  Bubble Sort
Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and
swaps them if they are in the wrong order. This process continues until the entire array is sorted.
*/


package com.sortingalgorithm;

import java.util.*;

public class BubbleSort {

	public static void bubbleSort(double[] studentMarks) {
        int n = studentMarks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (studentMarks[j] > studentMarks[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    double temp = studentMarks[j];
                    studentMarks[j] = studentMarks[j + 1];
                    studentMarks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: Stop if no swaps occurred
        }
    }
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		System.out.println("\nEnter the marks: ");
		double[] studentMarks = new double[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
				System.out.print("Student " + (i+1) + " marks: ");
				studentMarks[i] = input.nextDouble();
		}
		System.out.println();
		
		bubbleSort(studentMarks);
        System.out.println(Arrays.toString(studentMarks));
        
        input.close();
	}

}
