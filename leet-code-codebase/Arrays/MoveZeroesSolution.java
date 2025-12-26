/*
Problem: Move Zeroes
Problem description: Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
*/


class MoveZeroesSolution {
    public void moveZeroes(int[] nums) {

	// Position to place the next non-zero element
        int k = 0; 

        // Using for loop to move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
		// Move k forward
                k++; 
            }
        }

        // Using for loop to fill the remaining positions with zeros
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
