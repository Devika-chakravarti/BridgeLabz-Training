/*
Problem: Isomorphic string
Problem description: Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
*/

class IsomorphicStringSolution {
    public boolean isIsomorphic(String s, String t) {

        // mapFromS stores mapping of characters from string s to string t
        int[] mapFromS = new int[256];

        // mapFromT stores reverse mapping from string t to string s
        int[] mapFromT = new int[256];

        // Traverse both strings character by character
        for (int i = 0; i < s.length(); i++) {

            char charFromS = s.charAt(i);
            char charFromT = t.charAt(i);

            // If charFromS was already mapped before,
            // it must map to the same charFromT
            if (mapFromS[charFromS] != 0 && mapFromS[charFromS] != charFromT) {
                return false;
            }

            // If charFromT was already mapped before,
            // it must map back to the same charFromS
            if (mapFromT[charFromT] != 0 && mapFromT[charFromT] != charFromS) {
                return false;
            }

            // Create the mapping in both directions
            mapFromS[charFromS] = charFromT;
            mapFromT[charFromT] = charFromS;
        }

        // If all characters follow a consistent one-to-one mapping
        return true;
    }
}
