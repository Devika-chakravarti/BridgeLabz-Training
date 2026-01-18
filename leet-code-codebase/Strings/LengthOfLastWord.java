/*
Problem: Length of last word
Problem description: Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
*/

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int resultantLength = 0;
	// start from the last character of the string
        int i= s.length()-1;
	// skip all trailing spaces at the end of the string
        while(i>=0 && s.charAt(i)==' ') i--;
	// keep counting until a space or reach start of the string
        while(i>=0 && s.charAt(i)!=' '){
            resultantLength++;
            i--;
        }
        return resultantLength;
    }
}