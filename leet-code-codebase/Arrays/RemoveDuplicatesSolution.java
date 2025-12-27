/*
Problem: Remove duplicates from sorted array
Problem description: Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
*/

class RemoveDuplicatesSolution {
    public int removeDuplicates(int[] nums) {

        // If array is empty then return 0
        if(nums.length == 0) return 0;

        // k keeps track of the position for the next unique element
        int k = 1;

        // Start from the second element since the first is always unique
        for(int i = 1; i < nums.length; i++) {

            // If current element is different from the previous one
            if(nums[i] != nums[i - 1]) {

                // Place it at the k-th position
                nums[k] = nums[i];

                // Move k forward
                k++;
            }
        }

        // k represents the number of unique elements
        return k;
    }
}
