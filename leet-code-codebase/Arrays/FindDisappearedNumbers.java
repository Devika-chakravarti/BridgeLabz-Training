/*
Problem: Find all numbers disappeared in an array.
Problem description: Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
*/

class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // Stores missing numbers
        List<Integer> result = new ArrayList<>();

        // Mark each number's corresponding index as negative
        for (int i = 0; i < nums.length; i++) {
            // get index for current number
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                // mark as visited by making it negative
                nums[index] = -nums[index];
            }
        }

        // Collect indices which are still positive and these numbers are missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                // add missing number to the arraylist
                result.add(i + 1);
            }
        }

        return result;
    }
}
