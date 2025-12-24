import java.util.*;
public class ShortestAndLongestWord{


    	// Method to find length of string without using length()
    	public static int findLength(String text){
        	int count = 0;
        	try{
            		while(true){
                		text.charAt(count);
                		count++;
            		}
        	} 
		catch(Exception e){
            		return count;
        	}
    	}


    	// Method to split text into words using charAt()
    	public static String[] splitTextUsingCharAt(String text){
        	int length = findLength(text);
        	int wordCount = 1;
        	for(int i = 0; i < length; i++){
            		if(text.charAt(i) == ' '){
                		wordCount++;
            		}
        	}
        	String[] words = new String[wordCount];
        	int start = 0, index = 0;
        	for(int i = 0; i < length; i++){
            		if(text.charAt(i) == ' '){
                		words[index++] = text.substring(start,i);
                		start = i + 1;
            		}
        	}
        	words[index] = text.substring(start);
        	return words;
    	}


    	// Method to create 2D array of word and its length
    	public static String[][] createWordLength2DArray(String[] words){
        	String[][] wordLength = new String[words.length][2];
        	for(int i = 0; i < words.length; i++){
            		wordLength[i][0] = words[i];
            		wordLength[i][1] = String.valueOf(findLength(words[i]));
        	}
        	return wordLength;
    	}


    	// Method to find shortest and longest word index
    	public static int[] findShortestAndLongest(String[][] wordLength){
        	int shortestIndex = 0;
        	int longestIndex = 0;
        	for(int i = 1; i < wordLength.length; i++) {
            	int currentLength = Integer.parseInt(wordLength[i][1]);
            		if(currentLength < Integer.parseInt(wordLength[shortestIndex][1])){
                		shortestIndex = i;
            		}
            		if(currentLength > Integer.parseInt(wordLength[longestIndex][1])){
                		longestIndex = i;
            		}
        	}
        	return new int[]{shortestIndex,longestIndex};
    	}


    	// Main method
    	public static void main(String[] args){
        	Scanner input = new Scanner(System.in);

		// Take input string from the user
        	System.out.print("Enter the text: ");
        	String text = input.nextLine();

        	String[] words = splitTextUsingCharAt(text);
        	String[][] wordLength = createWordLength2DArray(words);

        	int[] result = findShortestAndLongest(wordLength);

        	System.out.println("\nWord\t\tLength");
        	System.out.println("----------------------");
        	for(int i = 0; i < wordLength.length; i++){
            		System.out.println(wordLength[i][0] + "\t\t" + Integer.parseInt(wordLength[i][1]));
        	}

        	System.out.println("\nShortest Word: " + wordLength[result[0]][0]);
        	System.out.println("Longest Word : " + wordLength[result[1]][0]);

        	input.close();
    	}


}
