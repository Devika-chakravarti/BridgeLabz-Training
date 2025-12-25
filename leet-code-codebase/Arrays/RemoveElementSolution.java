/*
Problem: Remove element 
Problem description: Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k. 
*/


class RemoveElementSolution{
    
	public int removeElement(int[] nums, int val){
	
		// Position to place next valid or non-val element
        int k = 0; 
	
		// using for loop to iterate through the array nums
        	for(int i = 0; i < nums.length; i++){
	    
	    		// check if the current element isn't equal to the value we want to remove
            	if(nums[i] != val){ 
					// Place the valid element at index k
                	nums[k] = nums[i];
					// Move k forward for the next valid element 
            		k++; 
            	}
        	}
			// Return number of elements not equal to val
        	return k; 
    	}
}
