import java.util.*;
public class SubstringComparison{

    	// Method to create a substring using charAt()
    	public String createSubstringUsingcharAt(String text, int startingIndex, int endingIndex){
        	String result = "";
        	// Create substring manually using charAt()
        	for(int i = startingIndex; i < endingIndex; i++){
            		result = result + text.charAt(i);
        	}
        	return result;
    	}


    	// Method to compare two strings using charAt()
    	public boolean compareStringsUsingCharAt(String str1, String str2){
        	// Check if lengths are different which means strings are not same
        	if(str1.length() != str2.length()){
            		return false;
        	}
        	// Compare each character of both the strings
        	for(int i = 0; i < str1.length(); i++){
            		if(str1.charAt(i) != str2.charAt(i)){
                		return false;
            		}
        	}
        	return true;
    	}


    	// Main method
    	public static void main(String args[]){
        	Scanner input = new Scanner(System.in);

        	// Take input string, startingIndex and endingIndex from the user
        	System.out.print("Enter the string: ");
        	String string = input.next();
        	System.out.print("Enter the starting index: ");
        	int startingIndex = input.nextInt();
        	System.out.print("Enter the ending index: ");
        	int endingIndex = input.nextInt();

        	// Create object to call non-static methods
        	SubstringComparison obj = new SubstringComparison();

        	// Substring using charAt()
        	String resultUsingcharAt = obj.createSubstringUsingcharAt(string, startingIndex, endingIndex);
        	// Substring using built-in method (substring(startingIndex, endingIndex))
        	String resultUsingSubstring = string.substring(startingIndex, endingIndex);

        	// Compare both results and store it's boolean value(as true or false) in isSame
        	boolean isSame = obj.compareStringsUsingCharAt(resultUsingcharAt, resultUsingSubstring);

        	// Display result
        	if(isSame){
            		System.out.println("Resultant substring after using charAt() and substring() method are same");
        	} 
		else{
            		System.out.println("Resultant substring after using charAt() and substring() method are not same");
        	}

        	input.close();
    	}
}
