/*
Problem: Largest number
Problem description: Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
Since the result may be very large, so you need to return a string instead of an integer.
*/

import java.util.*;

class LargestNumber {

    public String largestNumber(int[] nums) {

        // Convert numbers into strings
        String[] numbers = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = nums[i] + "";
        }

        // Sort numbers based on which combination is bigger
        Arrays.sort(numbers, (n1, n2) -> {
            String order1 = n1 + n2;
            String order2 = n2 + n1;
            return order2.compareTo(order1);
        });

        // If the largest number is 0, answer is simply "0"
        if (numbers[0].equals("0")) {
            return "0";
        }

        // Join all numbers to form the final result
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }

        return result;
    }
}
