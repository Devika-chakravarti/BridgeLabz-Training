import java.util.Scanner;
public class AnagramCheck{

    // Non-static method to check if two strings are anagrams
    public boolean areAnagrams(String str1, String str2){
        // Remove spaces and convert to lowercase for accurate comparison of both the input strings
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();
        // Check if lengths are different which means they cannot be anagrams
        if(str1.length() != str2.length()){
            return false;
        }
	// Array to store frequency of characters
        int[] freq = new int[256]; 
        // Count characters in first string
        for(int i = 0; i < str1.length(); i++){
            freq[str1.charAt(i)]++;
        }
        // Subtract frequency using second string
        for(int i = 0; i < str2.length(); i++){
            freq[str2.charAt(i)]--;
        }
        // Check if all frequencies are zero
        for(int i = 0; i < 256; i++){
            if(freq[i] != 0){
		// Not an anagram
                return false; 
            }
        }
	// Strings are anagrams
        return true; 
    }

    // Main method to take two input string from the user and display whether these two are anagrams or not
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for first string
        System.out.print("Enter String 1: ");
        String str1 = input.nextLine();
        // Take input for second string
        System.out.print("Enter String 2: ");
        String str2 = input.nextLine();

        // Create object to call non-static method
        AnagramCheck obj = new AnagramCheck();

        // Call method and store result
        boolean result = obj.areAnagrams(str1,str2);

        // Display whether strings are anagrams or not
        if(result){
            System.out.println("The strings are anagrams of each other");
        } 
	else{
            System.out.println("The strings aren't anagrams of each other");
        }

        input.close();
    }
}
