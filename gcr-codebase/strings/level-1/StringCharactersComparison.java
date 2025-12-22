import java.util.*;
public class StringCharactersComparison{


    	// Method to return all characters of a string without using toCharArray()
    	public char[] convertStringToCharacterArray(String string){
        	char[] characters = new char[string.length()];
        	for(int i = 0; i < string.length(); i++){
            		characters[i] = string.charAt(i);
        	}
        	return characters;
    	}


    	// Method to compare two character arrays
    	public boolean compareCharacterArrays(char[] arr1, char[] arr2){
        	// Check if lengths are different which means arrays are not same
        	if(arr1.length != arr2.length){
            		return false;
        	}
        	// Compare each character
        	for(int i = 0; i < arr1.length; i++){
            		if(arr1[i] != arr2[i]){
                		return false;
            		}
        	}
        	return true;
    	}


    	// Main method to take input string from the user and create object to call the non static method
    	public static void main(String args[]){
        	Scanner input = new Scanner(System.in);

        	// Take input string
        	System.out.print("Enter the string: ");
        	String string = input.next();

        	// Create object to call non-static methods
        	StringCharactersComparison obj = new StringCharactersComparison();

        	// Convert using user-defined method
        	char[] resultWithoutUsingtoCharArray = obj.convertStringToCharacterArray(string);
        	// Convert using built-in method
        	char[] resultUsingtoCharArray = string.toCharArray();

        	// Compare both character arrays and store the boolean result in isSame variable
        	boolean isSame = obj.compareCharacterArrays(resultWithoutUsingtoCharArray,resultUsingtoCharArray);

        	// Display result
        	if(isSame){
            		System.out.println("Both methods return the same characters");
        	} 
		else{
            		System.out.println("Both methods return different characters");
        	}

        	input.close();
    	}


}
