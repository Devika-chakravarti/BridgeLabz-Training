/*
Problem: Find first and last position of element in sorted array
Problem description: Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
*/

class FindPositionsOfElement {
    public int[] searchRange(int[] nums, int target) {
	
	    // default if target not found
        int[] result = new int[]{-1, -1};         
        if (nums == null || nums.length == 0) return result;

        // find first occurrence
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else { 
                right = mid - 1;
            }
        }
        // check if target exists
        if (left >= nums.length || nums[left] != target) return result;
        result[0] = left;

        // find last occurrence
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else { 
                left = mid + 1;
            }
        }
        result[1] = right;

        return result;
    }
}
