import java.util.*;
public class NumberFormatException{

	// Method to generate the NumberFormatException(a common unchecked (runtime) exception that is thrown when an application attempts to convert a string to a numeric type, but the string does not have the appropriate format)
    	public static void generateException(String text){
		System.out.println(Integer.parseInt(text));
    	}

	
	// Method to handle the NumberFormatException
    	public static void handleException(String text){
        	try{
			System.out.println(Integer.parseInt(text));
		}   	
		catch(Exception e){
            		System.out.println("NumberFormatException is caught and handled " +  e.getMessage());
        	}
    	}

    		
	// Main method to call the generateException and handleException method
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// Take input string from the user
		System.out.print("Enter a string: ");
		String text = input.next();

        	// Calling generateException() method in try block and handleException() in catch block
        	try{
            		generateException(text);
        	} 
		catch(Exception e){
            		handleException(text);
        	}
    	}

}
