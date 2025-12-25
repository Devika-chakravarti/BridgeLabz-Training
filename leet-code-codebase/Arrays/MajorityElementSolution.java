/*
Problem: Majority element 
Problem description: Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/


class MajorityElementSolution{

    public int majorityElement(int[] nums){

	    // using outer for loop to iterate through the nums array
        for(int i = 0; i < nums.length; i++){
	    
	        // Count occurrences of nums[i]	    
            int count = 0; 
	    
	        // using inner for loop to find the repeated elements and then increment the coune value
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
	        // Check majority condition
            if(count > nums.length / 2){ 
                return nums[i];
            }
        }
	    // Otherwise return -1
        return -1; 
    }
}


