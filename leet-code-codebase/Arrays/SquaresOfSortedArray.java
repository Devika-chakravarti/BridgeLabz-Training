/*
Problem: Squares of a sorted array
Problem description: Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/

import java.util.Arrays;
class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {

	// Create array to store squares of the array elements
        int[] squares = new int[nums.length];
        for(int i=0;i<nums.length;i++){
	    // Simply find squares of elements
            squares[i]=nums[i]*nums[i];
        }
	// Sort the squares array
        Arrays.sort(squares);
        return squares;
    }
}