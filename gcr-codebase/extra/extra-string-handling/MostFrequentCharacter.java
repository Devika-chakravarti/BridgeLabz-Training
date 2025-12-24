import java.util.Scanner;
public class MostFrequentCharacter{

    // Non-static method to find the most frequent character
    public char findMostFrequentChar(String str){
	// Array to store frequency of each ASCII character
        int[] freq = new int[256]; 
        // Count frequency of each character
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }
        // Find the character with maximum frequency
        int maxFreq = 0;
        char mostFreqChar = ' ';
        for(int i = 0; i < 256; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                mostFreqChar = (char)i;
            }
        }
	    // Return the most frequent character
        return mostFreqChar; 
    }

    // Main method to take input string from the user and display the result
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Create object to call non-static method
        MostFrequentCharacter obj = new MostFrequentCharacter();

        // Call method and store result
        char result = obj.findMostFrequentChar(text);

        // Display the most frequent character
        System.out.println("Most Frequent Character: " + result);
        
        input.close();
    }
}
