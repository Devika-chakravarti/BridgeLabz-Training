import java.util.Scanner;
public class RemoveCharacter{

    // Non-static method to remove all occurrences of a specific character
    public String removeChar(String str, char chToRemove){
        String result = "";
        // Loop through each character of the string
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            // Append to result only if it's not the character to remove
            if(ch != chToRemove){
                result += ch;
            }
        }
	    // Return the modified string
        return result; 
    }

    // Main method to take input string from the user and which character to remove and then display the result
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Take input character to remove
        System.out.print("Enter the character to remove: ");
        char charToRemove = input.next().charAt(0);

        // Create object to call non-static method
        RemoveCharacter obj = new RemoveCharacter();

        // Call method and store result
        String modified = obj.removeChar(text, charToRemove);

        // Display the modified string
        System.out.println("Modified String: " + modified);
        
        input.close();
    }
}
