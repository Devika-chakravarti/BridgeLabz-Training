/*
Problem: Two Sum 
Problem description: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/


class TwoSumSolution{
    
	public int[] twoSum(int[] nums,int target){
	
			// using outer loop to iterate through the array nums
        	for(int i = 0; i < nums.length; i++){
	    
	    			// using inner loop to find sum starting from i+1 index
            		for(int j = i+1; j < nums.length; j++){
		
						// Check if pair sums to target
                		if(nums[i]+nums[j] == target){ 
                        	// Return their indices
							return new int[]{i,j}; 
                		}
            		}
        	}

			// Return empty array if no pair found
        	return new int[]{}; 
    	}
}
