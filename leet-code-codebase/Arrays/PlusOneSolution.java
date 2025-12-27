/*
Problem: Plus One
Problem description: You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
*/

class PlusOneSolution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        // Start from the last digit and move backwards
        for(int i = n - 1; i >= 0; i--) {

            // If the digit is less than 9 then just add 1 and return
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9 then make it 0 and continue
            digits[i] = 0;
        }

        // If all digits were 9 then create a new array with extra space
        int[] result = new int[n + 1];
        result[0] = 1; 

        return result;
    }
}
