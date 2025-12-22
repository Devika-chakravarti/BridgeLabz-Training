import java.util.*;
public class ArrayIndexOutOfBoundsException{

	// Method to generate the ArrayIndexOutOfBoundsException(a runtime exception that occurs when a program tries to access an array element using an illegal index)
    	public static void generateException(String[] names){
		System.out.print(names[names.length + 1]);
    	}

	
	// Method to handle the ArrayIndexOutOfBoundsException
    	public static void handleException(String[] names){
        	try{
			System.out.print(names[names.length + 1]);			
		}   	
		catch(Exception e){
            		System.out.println("ArrayIndexOutOfBoundsException is caught and handled " +  e.getMessage());
        	}
    	}

    		
	// Main method to call the generateException and handleException method
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// Take input number of names and names from the user and store in string array names
		System.out.print("Enter number of names: ");
		int numberOfNames = input.nextInt();
		System.out.println("Names are: ");
		String[] names = new String[numberOfNames];
		for(int i=0;i<names.length;i++){
			names[i] = input.next();
		}

        	// Calling generateException() method in try block and handleException() in catch block
        	try{
            		generateException(names);
        	} 
		catch(Exception e){
            		handleException(names);
        	}
    	}

}
