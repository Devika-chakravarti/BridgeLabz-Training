/*
Problem: Search insert position
Problem description: Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
*/


class SearchInsertPositionSolution {
    public int searchInsert(int[] nums, int target) {

        // Starting index
        int left = 0;

        // Ending index
        int right = nums.length - 1;

        // Binary search loop
        while (left <= right) {

            // Find the middle index
            int mid = left + (right - left) / 2;

            // If target is found then return its index
            if (nums[mid] == target) {
                return mid;
            }
            // If target is greater then search in the right half
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller then search in the left half
            else {
                right = mid - 1;
            }
        }

        // If target is not found then left gives the correct insert position
        return left;
    }
}
