/*
Problem: Find the duplicate number
Problem description: Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space.
*/

class DuplicateNumberSolution {
    public int findDuplicate(int[] nums) {

        // Initialize slow and fast pointers
        int slow = nums[0];
        int fast = nums[0];

        // Detect cycle using Floyd’s Tortoise and Hare
        do {
	    // Move slow by 1 step
            slow = nums[slow];        
	    // Move fast by 2 steps
            fast = nums[nums[fast]];  
        }
	// Loop until they meet 
	while(slow != fast);        

        // Find the entrance of the cycle (duplicate number)
        fast = nums[0];
        while(slow != fast) {
	    // Move both by 1 step
            slow = nums[slow];  
            fast = nums[fast];
        }

        // Return the duplicate number
        return slow;
    }
}
