/*
Problem: Find Peak Element
Problem description: A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
You must write an algorithm that runs in O(log n) time.
*/


class FindPeakElementSolution {
    public int findPeakElement(int[] nums) {

	// Intitializing left and right with 0 and last element of the nums array
        int left = 0, right = nums.length - 1;

        // Binary search for the peak element
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is smaller than next element which means peak must be on the right
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } 
	    else {
                // Otherwise, peak is on the left or at mid
                right = mid;
            }
        }

        return left;
    }
}
