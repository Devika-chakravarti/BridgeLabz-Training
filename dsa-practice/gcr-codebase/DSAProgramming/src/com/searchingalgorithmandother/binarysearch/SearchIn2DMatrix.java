package com.searchingalgorithmandother.binarysearch;

import java.util.Scanner;

public class SearchIn2DMatrix {

	public static boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		int left = 0;
		int right = rows * cols - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			int row = mid / cols;
			int col = mid % cols;

			if (matrix[row][col] == target) {
				return true;
			}

			if (matrix[row][col] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int r = input.nextInt();

		System.out.print("Enter number of columns: ");
		int c = input.nextInt();

		int[][] matrix = new int[r][c];

		System.out.println("Enter matrix elements row by row:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		System.out.print("Enter the target value to search: ");
		int target = input.nextInt();

		boolean found = searchMatrix(matrix, target);

		if (found) {
			System.out.println("Target value found");
		} else {
			System.out.println("Target value not found");
		}

		input.close();
	}
}
