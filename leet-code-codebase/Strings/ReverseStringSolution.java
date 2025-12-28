/*
Problem: Reverse String
Problem description: Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
*/


class ReverseStringSolution {
    public void reverseString(char[] s) {

        // Left pointer starts from the beginning
        int left = 0;

        // Right pointer starts from the end
        int right = s.length - 1;

        // Swap characters until both pointers meet
        while (left < right) {

            // Store left character temporarily
            char temp = s[left];

            // Move right character to left position
            s[left] = s[right];

            // Place stored character to right position
            s[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }
    }
}
