import java.util.*;
public class TrimStringUsingCharAt{


    	// Method to find start and end index after trimming leading and trailing spaces using charAt()
    	public static int[] trimUsingCharAt(String text){
        	int start = 0;
        	int end = text.length() - 1;
        	// Trim leading spaces
        	while(start <= end && text.charAt(start) == ' '){
            		start++;
        	}
        	// Trim trailing spaces
        	while(end >= start && text.charAt(end) == ' '){
            		end--;
        	}
        	return new int[]{start,end};
    	}


    	// Method to create substring using charAt() from start to end indices (including both start and end index)
    	public static String substringUsingCharAt(String text, int start, int end){
        	StringBuilder sb = new StringBuilder();
        	for(int i = start; i <= end; i++){
            		sb.append(text.charAt(i));
        	}
        	return sb.toString();
    	}


    	// Method to compare two strings using charAt()
    	public static boolean compareStringsUsingCharAt(String str1,String str2){
        	if(str1.length() != str2.length()){
            		return false;
        	}
        	for(int i = 0; i < str1.length(); i++){
            		if(str1.charAt(i) != str2.charAt(i)){
                		return false;
            		}
        	}
        	return true;
    	}


    	// Main method
    	public static void main(String[] args){
        	Scanner input = new Scanner(System.in);

			// Take input 
        	System.out.print("Enter a string with leading and trailing spaces: ");
        	String text = input.nextLine();

        	// Get start and end index after trimming
        	int[] indices = trimUsingCharAt(text);

        	// Create trimmed string using substringUsingCharAt
        	String trimmedCustom = substringUsingCharAt(text,indices[0],indices[1]);
			// Trim string using built-in trim()
        	String trimmedBuiltIn = text.trim();

        	// Compare the results
        	boolean isSame = compareStringsUsingCharAt(trimmedCustom,trimmedBuiltIn);

        	// Display results
        	System.out.println("Trimmed string using charAt(): \"" + trimmedCustom + "\"");
        	System.out.println("Trimmed string using trim(): \"" + trimmedBuiltIn + "\"");
        	System.out.println("Are both strings same? " + isSame);

        	input.close();
    	}


}
