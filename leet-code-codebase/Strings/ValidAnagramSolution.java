/*
Problem: Valid anagram
Problem description: Given two strings s and t, return true if t is an anagram of s, and false otherwise.
*/


class ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {

        // Check if lengths are not equal then they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Array to store frequency of each character (a to z)
        int[] count = new int[26];

        // Count how many times each character appears in string s
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Reduce the count using characters from string t
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;

            // Check if count becomes negative then characters don't match
            if (count[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        // If all character counts match then strings are anagrams
        return true;
    }
}
