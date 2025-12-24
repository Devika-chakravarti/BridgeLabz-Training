import java.util.Scanner;
public class ToggleCase{

    // Non-static method to toggle case of each character
    public String toggleStringCase(String str){
        String result = "";
        // Loop through each character of the string
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            // Check if character is uppercase
            if(Character.isUpperCase(ch)){
		// Convert to lowercase
                result += Character.toLowerCase(ch); 
            }
            // Check if character is lowercase
            else if(Character.isLowerCase(ch)){
		// Convert to uppercase
                result += Character.toUpperCase(ch); 
            } 
            else{
		// Keep non-alphabet characters unchanged
                result += ch; 
            }
        }
        return result; // Return the toggled string
    }

    // Main method to take input string from the user
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Create object to call non-static method
        ToggleCase obj = new ToggleCase();

        // Call method and store the toggled string
        String toggled = obj.toggleStringCase(text);

        // Display the toggled string
        System.out.println("Toggled Case String: " + toggled);
        
        input.close();
    }
}
