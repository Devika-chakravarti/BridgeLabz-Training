/*
Problem: Missing Number
Problem description: Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/


class MissingNumberSolution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        // Using outer for loop to check every number from 0 to n
        for (int i = 0; i <= n; i++) {
	    // Assume i is missing
            boolean found = false; 

            // Using inner for loop to look through the array to see if i exists
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
		    // i exists in the array
                    found = true; 
                    break;
                }
            }
            // If i was not found in the array which means it is the missing number
            if (!found) {
                return i;
            }
        }

        return -1; 
    }
}
