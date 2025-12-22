import java.util.*;
public class IllegalArgumentException{

	// Method to generate the IllegalArgumentException (an unchecked exception in Java, thrown to indicate that a method has been passed an illegal or inappropriate argument)
    	public static void generateException(String text){
		System.out.println(text.substring(6,2));
    	}

	
	// Method to handle the IllegalArgumentException
    	public static void handleException(String text){
        	try{
			System.out.println(text.substring(6,2));
		}   	
		catch(Exception e){
            		System.out.println("IllegalArgumentException is caught and handled" + e.getMessage());
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
