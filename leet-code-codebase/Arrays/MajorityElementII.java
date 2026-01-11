/*
Problem: Majority element II
Problem description: Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
*/

class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // We can have at most 2 elements occurring more than n/3 times
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        // choose possible candidates
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == candidate1) {
                count1++;

            } else if (nums[i] == candidate2) {
                count2++;

            } else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;

            } else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;

            } else {
                count1--;
                count2--;
            }
        }

        // reset counts to check real frequency
        count1 = 0;
        count2 = 0;

        // Count how many times candidates actually appear
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) {
                count1++;
            } else if (nums[i] == candidate2) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) result.add(candidate1);
        if (count2 > nums.length / 3) result.add(candidate2);

        return result;
    }
}

