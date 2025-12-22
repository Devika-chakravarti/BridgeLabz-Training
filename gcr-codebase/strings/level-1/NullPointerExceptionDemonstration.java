public class NullPointerExceptionDemonstration{

	// Method to generate the NullPointerException(runtime exception that occurs when a program attempts to use an object reference that has the value null in a situation where an actual object is required)
    	public static void generateException(){
        	String text = null;
		// Generates exception
        	System.out.println(text.length()); 
    	}

	
	// Method to handle the NullPointerException
    	public static void handleException(){
        	try{
            		String text = null;
			// Generates exception
            		System.out.println(text.length()); 
        	} 
		catch(NullPointerException e){
            		System.out.println("NullPointerException is caught and handled");
        	}
    	}

    		
	// Main method to call the generateException and handleException method
	public static void main(String args[]){

        	// Calling generateException() method in try block and handleException() in catch block
        	try{
            		generateException();
        	} 
		catch(NullPointerException e){
            		handleException();
        	}
    	}

}
