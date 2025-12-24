import java.util.*;
public class CharacterTypeDisplay{


    	// Method to check if a character is Vowel, Consonant, or Not a Letter
    	public static String checkCharacterType(char ch){
        	// Convert uppercase to lowercase using ASCII
        	if(ch >= 'A' && ch <= 'Z'){
            		ch = (char)(ch + 32);
        	}
        	// Check if letter
        	if(ch >= 'a' && ch <= 'z'){
            		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                		return "Vowel";
            		}	 
			else{
                		return "Consonant";
            		}
        	}
		return "Not a Letter";
    	}


    	// Method to find vowels and consonants in a string and return a 2D array
    	public static String[][] findCharacterTypes(String text){
        	int length = text.length();
        	String[][] result = new String[length][2];
        	for(int i = 0; i < length; i++){
            		char ch = text.charAt(i);
            		result[i][0] = String.valueOf(ch);
            		result[i][1] = checkCharacterType(ch);
        	}
        	return result;
    	}


    	// Method to display the 2D array in tabular format
    	public static void displayCharacterTypes(String[][] charArray){
        	System.out.println("Character\tType");
        	System.out.println("---------------------");
        	for(int i = 0; i < charArray.length; i++){
            		System.out.println(charArray[i][0] + "\t\t" + charArray[i][1]);
        	}
    	}


    	// Main method to take input string from the user and 
    	public static void main(String[] args){
        	Scanner input = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String text = input.nextLine();

        	// Find character types
        	String[][] charTypes = findCharacterTypes(text);

        	// Display results
        	displayCharacterTypes(charTypes);

        	input.close();
    	}

}
