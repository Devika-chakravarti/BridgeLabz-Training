/*
Problem: Maximum subarray
Problem description: Given an integer array nums, find the subarray with the largest sum, and return its sum.
*/


class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currentSum = nums[0];

        // For loop is starts from the second element
        for (int i = 1; i < nums.length; i++) {
            // If currentSum is negative then starting new subarray is better
            if (currentSum < 0) {
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }

            // Update maxSum if currentSum is larger
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
