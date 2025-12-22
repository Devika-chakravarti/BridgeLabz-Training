import java.util.*;
public class UppercaseConversion{


    	// Method to convert string to uppercase using charAt() and ASCII logic
    	public String convertToUppercaseUsingCharAt(String text){
        	char[] result = new char[text.length()];
		for(int i = 0; i < text.length(); i++){
            		char ch = text.charAt(i);
            		// If character is lowercase (a-z)
            		if(ch >= 'a' && ch <= 'z'){
                		result[i] = (char)(ch - 32); 
            		} 
			else{
                		result[i] = ch; 
            		}
        	}
        	return new String(result);
    	}


    	// Method to compare two strings using charAt()
    	public boolean compareStringsUsingCharAt(String str1, String str2){
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


	// Main method to take input String from the user and create object to call the non static methods
    	public static void main(String args[]){
        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter a text: ");
        	String text = input.nextLine();

		// Create object to call the non static methods
        	UppercaseConversion obj = new UppercaseConversion();

        	// Convert using charAt()
        	String resultUsingCharAt = obj.convertToUppercaseUsingCharAt(text);
        	// Convert using built-in method
        	String resultUsingToUpperCase = text.toUpperCase();

        	// Compare both results and saves the result(as true or false) in isSame variable
        	boolean isSame = obj.compareStringsUsingCharAt(resultUsingCharAt,resultUsingToUpperCase);

        	System.out.println("Is the result same after using charAt() and toUpperCase() method? " + isSame);

        	input.close();
    	}


}
