import java.util.*;
public class WordLength2DArray{


    	// Method to find length of string without using length()
    	public static int findLength(String text){
		// counts the characters
        	int count = 0;
        	try{
            		while(true){
                		text.charAt(count); // access each character 
                		count++;  //increase the count value by 1 each time
            		}
        	} 
			catch(Exception e){
            		return count;	// return count when index goes out of range
        	}
    	}


    	// Method to split text into words using charAt()
    	public static String[] splitTextUsingCharAt(String text){
			// get the length of the text
        	int length = findLength(text);
        	// Count how many words are present
        	int wordCount = 1;
        	for(int i = 0; i < length; i++){
            		if(text.charAt(i) == ' '){
						// increase count when space is found
                		wordCount++;
            		}
        	}
			// Array words to store all words
        	String[] words = new String[wordCount];
        	// starting index of array
			int start = 0;
			// index for words array
        	int wordIndex = 0;
			// extract words using space position
        	for(int i = 0; i < length; i++){
            		if(text.charAt(i) == ' '){
                		words[wordIndex++] = text.substring(start,i);
                		// move to next word
				start = i + 1;
            		}
        	}
        	// Stores the last word
        	words[wordIndex] = text.substring(start);
        	return words;
    	}


    	// Method to create 2D array of word and its length
    	public static String[][] createWordLength2DArray(String[] words){
        	String[][] result = new String[words.length][2];
			// Store the word and it's length
        	for(int i = 0; i < words.length; i++){
			// word
            		result[i][0] = words[i];
			// length as string
            		result[i][1] = String.valueOf(findLength(words[i]));
        	}
        	return result;
    	}


    	// Main method
    	public static void main(String[] args){
        	Scanner input = new Scanner(System.in);
        	// Take input string from the user
        	System.out.print("Enter the text: ");
        	String text = input.nextLine();

        	// Split text into words
        	String[] words = splitTextUsingCharAt(text);

        	// Create 2D array of words and lengths
        	String[][] wordLengthTable = createWordLength2DArray(words);

        	// Display results in tabular format
        	System.out.println("Word\tLength");
        	for(int i = 0; i < wordLengthTable.length; i++){
            		String word = wordLengthTable[i][0];
            		int length = Integer.parseInt(wordLengthTable[i][1]);
            		System.out.println(word + "\t" + length);
        	}

        	input.close();
    	}


}
