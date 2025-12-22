public class StringIndexOutOfBoundsException{

	// Method to generate the StringIndexOutOfBoundsException (a runtime exception in Java that is thrown when a program tries to access a character or a substring of a string using an index that is invalid)
    	public static void generateException(){
       	 	String text = "BridgeLabz";
	 	System.out.println(text.charAt(10)); 
    	}

	
	// Method to handle the StringIndexOutOfBoundsException
    	public static void handleException(){
        	try{
            		String text = "BridgeLabz";
		 	System.out.println(text.charAt(10));

        	} 
		catch(Exception e){
            		System.out.println("StringIndexOutOfBoundsException is caught and handled" + e.getMessage());
        	}
    	}

    		
	// Main method to call the generateException and handleException method
	public static void main(String args[]){

        	// Calling generateException() method in try block and handleException() in catch block 
        	try{
            		generateException();
        	} 
		catch(Exception e){
            		handleException();
        	}
    	}

}
