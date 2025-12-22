import java.util.*;
public class LowercaseConversion{

    	// Method to convert string to lowercase using charAt() and ASCII logic
    	public String convertToLowercaseUsingCharAt(String text){
        	char[] result = new char[text.length()];
        	// Loop through each character of the string
        	for(int i = 0; i < text.length(); i++){
            		char ch = text.charAt(i);
            		// If character is uppercase (A-Z)
            		if(ch >= 'A' && ch <= 'Z'){
                		result[i] = (char)(ch + 32); 
            		} 
			else{
                		result[i] = ch; // Keep character as it is
            		}
        	}
        	// Convert char array back to String
        	return new String(result);
    	}


	// Method to compare two strings using charAt()
	public boolean compareStringsUsingCharAt(String str1, String str2){
    		// If lengths differ of strings are not same
    		if(str1.length() != str2.length()){
        		return false;
    		}
    		// Compare each character of str1 and str2
    		for(int i = 0; i < str1.length(); i++){
        		if(str1.charAt(i) != str2.charAt(i)){
            			return false;
        		}
    		}
    		return true;
	}


	// Main method to take text input from user and non sttaic method calling through object 
    	public static void main(String args[]){
        	Scanner input = new Scanner(System.in);

        	// Take complete text input
        	System.out.print("Enter a text: ");
        	String text = input.nextLine();

		// Create object to call the non static method
        	LowercaseConversion obj = new LowercaseConversion();

        	// Convert using user-defined method (charAt)
        	String resultUsingCharAt = obj.convertToLowercaseUsingCharAt(text);
        	// Convert using built-in method (toLowerCase)
        	String resultUsingToLowerCase = text.toLowerCase();
        
		// Compare both results and save the result in isSame variable
        	boolean isSame = obj.compareStringsUsingCharAt(resultUsingCharAt,resultUsingToLowerCase);

        	// Display result
        	System.out.println("Is the result same after using charAt() and toLowerCase() method? " + isSame);

        	input.close();
    	}


}
