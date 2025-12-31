/*
Problem: Merge sorted array
Problem description: You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*/


class MergeSortedArraySolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Pointer for last valid element in nums1
        int i = m - 1;

        // Pointer for last element in nums2
        int j = n - 1;

        // Pointer for last position in nums1 (total space)
        int k = m + n - 1;

        // Compare elements from the back and place the larger one
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If elements are left in nums2 then copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
