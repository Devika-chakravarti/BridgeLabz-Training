import java.util.Scanner;
public class ReplaceWord{

    // Non-static method to replace a word in the sentence
    public String replaceWord(String sentence, String oldWord, String newWord){
        String result = "";
        int i = 0;
        int oldLen = oldWord.length();
        // Loop through the sentence
        while(i < sentence.length()){
            // Check if the current part of sentence matches the old word
            if(i + oldLen <= sentence.length() && sentence.substring(i, i + oldLen).equals(oldWord)){
		// Replace with new word
                result += newWord; 
		// Move index forward by length of old word
                i += oldLen;       
            } else {
		// Keep current character
                result += sentence.charAt(i); 
                i++;
            }
        }
	// Return modified sentence
        return result; 
    }

    // Main method to take input string, word to replace and word to replace with from the user and  display the string after replacing
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Take input sentence from user
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Take input word to replace
        System.out.print("Enter the word to replace: ");
        String oldWord = input.next();

        // Take input new word
        System.out.print("Enter the new word: ");
        String newWord = input.next();

        // Create object to call non-static method
        ReplaceWord obj = new ReplaceWord();

        // Call method and store modified sentence
        String modified = obj.replaceWord(sentence,oldWord,newWord);

        // Display the modified sentence
        System.out.println("Modified Sentence: " + modified);

        input.close();
    }
}
