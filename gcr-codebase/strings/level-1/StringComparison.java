import java.util.*;
public class StringComparison{


    	// Method to compare two strings using charAt() method
    	public boolean checkStringUsingCharAt(String string1, String string2){
        	// Check if lengths are not equal which means strings cannot be equal
        	if(string1.length() != string2.length()){
            		return false;
        	}
        	// Using for loop to compare each character at the same index
        	for(int i = 0; i < string1.length(); i++){
            		if(string1.charAt(i) != string2.charAt(i)){
                		return false;
            		}
        	}
        	// If all characters matched from string1 and string2
        	return true;
    	}


    	// Main method
    	public static void main(String args[]){
        	Scanner input = new Scanner(System.in);
        
		// Take two input strings
        	System.out.print("Enter first string: ");
        	String string1 = input.next();
        	System.out.print("Enter second string: ");
        	String string2 = input.next();

        	// Create object to call non-static method
        	StringComparison obj = new StringComparison();

        	// Compare using charAt()
        	boolean resultUsingCharAt = obj.checkStringUsingCharAt(string1,string2);
        	System.out.println("Are both strings equal using charAt()? " + resultUsingCharAt);

        	// Compare using built-in equals() method
        	boolean resultUsingEquals = string1.equals(string2);
        	System.out.println("Are both strings equal using equals()? " + resultUsingEquals);

        	// Final comparison of both results
        	if(resultUsingCharAt == resultUsingEquals){
            		System.out.println("Result after using charAt() and equals() methods is SAME");
        	} 
		else{
            		System.out.println("Result after using charAt() and equals() methods is DIFFERENT");
        	}

        	input.close();
    	}


}
