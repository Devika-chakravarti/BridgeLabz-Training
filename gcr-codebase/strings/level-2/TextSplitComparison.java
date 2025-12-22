import java.util.*;
public class TextSplitComparison{

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
        	// Use for loop to count the number of words of the text
        	int wordCount = 1;
        	for(int i = 0; i < length; i++){
            		if(text.charAt(i) == ' '){
                		wordCount++;
            		}
        	}
        	// Use for loop to store space indexes
        	int[] spaceIndexes = new int[wordCount - 1];
        	int index = 0;
        	for(int i = 0; i < length; i++){
            		if(text.charAt(i) == ' '){
                		spaceIndexes[index++] = i;
            		}
        	}
        	// Create an array to store the words and use the indexes to extract the words
        	String[] words = new String[wordCount];
        	int start = 0;
        	for(int i = 0; i < spaceIndexes.length; i++){
            		int end = spaceIndexes[i];
            		words[i] = text.substring(start,end);
            		start = end + 1;
        	}
        	// Last word
        	words[wordCount-1] = text.substring(start);
        	return words;
    	}


    	// Method to compare two string arrays using charAt()
    	public static boolean compareStringArrays(String[] arr1,String[] arr2){
        	if(arr1.length != arr2.length){
            		return false;
        	}
        	for(int i = 0; i < arr1.length; i++){
            		if(arr1[i].length() != arr2[i].length()) {
                		return false;
            		}
            		for(int j = 0; j < arr1[i].length(); j++){
                		if (arr1[i].charAt(j) != arr2[i].charAt(j)) {
                    			return false;
                		}
            		}
        	}
        	return true;
    	}


    	// Main method to take input string from the user and here check the results are same or not after using split() built-in method and user-defined method
    	public static void main(String[] args){
        	Scanner input = new Scanner(System.in);

        	// Take complete text input from the user
        	System.out.print("Enter the text: ");
        	String text = input.nextLine();

        	// Calling User-defined split method
        	String[] resultUsingCharAt = splitTextUsingCharAt(text);
        	// Built-in split method 
        	String[] resultUsingSplit = text.split(" ");

        	// Compare both results og using built-in and user-defined method and save the boolean result in isSame variable
        	boolean isSame = compareStringArrays(resultUsingCharAt,resultUsingSplit);

        	// Display result
        	System.out.println("Result using charAt(): "+Arrays.toString(resultUsingCharAt));
        	System.out.println("Result using split(): " +Arrays.toString(resultUsingSplit));
        	System.out.println("Are both results same? " + isSame);

        	input.close();
    	}


}
