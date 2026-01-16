/*
Problem: Product of array except self
Problem description: Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
*/

class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

	// Array to store product of elements except self
        int[] result = new int[nums.length];
	// For first element there are no elements on the left
        result[0] = 1;
	// For loop to store the product of the left elements of current index
        for(int i=1;i<nums.length;i++){
            result[i]=result[i-1]*nums[i-1];
        }
	// stores the product of elements to the right
        int rightProduct = 1;
        // For loop to store the multiplication of right and left elements in result
	for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*rightProduct;
            rightProduct = rightProduct*nums[i];
        }
        return result;
    }
}