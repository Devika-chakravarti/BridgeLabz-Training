/*
Problem: Roman to Integer
Problem description: Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/

class RomanToIntegerSolution {
    public int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int currentValue = getValue(s.charAt(i));

            // Check next character (only if it exists)
            if (i + 1 < s.length()) {
                int nextValue = getValue(s.charAt(i + 1));

                // If current value is smaller than next, it means subtraction case (like IV, IX, etc.)
                if (currentValue < nextValue) {
                    total = total - currentValue;
                } else {
                    total = total + currentValue;
                }
            } 
            // No character case which means last character
            else {
                total = total + currentValue;
            }
        }

        return total;
    }

    // Method to get integer value of a Roman character
    private int getValue(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
    }
}
