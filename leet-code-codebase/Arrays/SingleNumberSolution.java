/*
Problem: Single number 
Problem description: Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
*/


class SingleNumberSolution{
    
	public int singleNumber(int[] nums){
        	
		// using outer for loop to iterate through the nums array
		for(int i = 0; i < nums.length; i++){
            	
			// Assume current number is unique
			boolean isUnique = true; 

					// using inner for loop to iterate through again to find the duplicate values(if found then simple jump out of loop and then outside the loop return that value of nums array)
            		for(int j = 0; j < nums.length; j++){
						// Found duplicate
                		if(i != j && nums[i] == nums[j]){ 
                    			isUnique = false;
                    			break;
                		}
            		}

					// check if no duplicate found then simply return the array
            		if(isUnique){ 
                		return nums[i];
            		}
        	}
        	// Otherwise return -1
			return -1; 
    	}
}
