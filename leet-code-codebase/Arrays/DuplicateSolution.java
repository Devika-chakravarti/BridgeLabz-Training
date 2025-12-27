/*
Problem: Contains duplicate
Problem description: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

import java.util.Arrays;
class DuplicateSolution {
    public boolean containsDuplicate(int[] nums) {

        // Sort the array first
        Arrays.sort(nums);

        // Compare each element with the previous one
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                // Found a duplicate
                return true;
            }
        }

        // No duplicates found
        return false;
    }
}
