import java.util.*;
public class StringLengthWithoutLengthMethod{

    	// Method to find length of string without using length()
    	public static int findStringLength(String text){
        	int count = 0;
		// Uses try block for infinite while loop to count the characters until throws a runtime exception and catch block to handle the exception and returns the count
        	try{
            		// Infinite loop to access characters
            		while(true){
                		text.charAt(count);
                		count++;
            		}
        	}	 
        	catch(Exception e){
            		// Exception occurs when index goes out of range
            		return count;
        	}
    	}


    	// Main method
    	public static void main(String[] args){
        	Scanner input = new Scanner(System.in);

        	// Take string input
        	System.out.print("Enter a string: ");
        	String text = input.next();

        	// Calling user-defined method and store length in lengthWithoutMethod variable
        	int lengthWithoutMethod = findStringLength(text);
        	// Using built-in length() method (length() method)
        	int lengthUsingMethod = text.length();

        	// Display results of both the methods (user-defined and length())
        	System.out.println("Length of string without using length() method: " + lengthWithoutMethod);
        	System.out.println("Length of string using length() method: " + lengthUsingMethod);

        	input.close();
    	}


}
