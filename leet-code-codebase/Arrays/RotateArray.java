/*
Problem: Rotate Array
Problem description: Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
*/

class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // k can be greater than array length then simply adjust it
        k = k % n;

        // Reverse the whole array first
        reverse(nums, 0, n - 1);

        // Reverse the first k elements (they are the rotated part)
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements (rest of the array)
        reverse(nums, k, n - 1);
    }

    // Method to reverse elements between two indices
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
