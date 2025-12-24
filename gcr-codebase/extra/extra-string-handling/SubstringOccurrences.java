import java.util.Scanner;
public class SubstringOccurrences{

    // Non-static method to count occurrences of substring in main string
    public int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;
        // Loop through the main string to find all occurrences of the substring
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            // Increment count when substring is found
	    count++;         
            // Move index forward to avoid overlapping
	    index += subStr.length(); 
        }
	    // Return total occurrences
        return count;       
    }

    // Main method to main string in which we need to find how many times substring is found
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for main string
        System.out.print("Enter the main string: ");
        String mainStr = input.nextLine();
	    // Take input for substring to search
        System.out.print("Enter the substring to find: ");
        String subStr = input.nextLine();

        // Create object to call non-static method
        SubstringOccurrences obj = new SubstringOccurrences();

        // Call method and store result
        int result = obj.countOccurrences(mainStr, subStr);

        // Display the total occurrences
        System.out.println("The substring occurs " + result + " times");
        
        input.close();
    }
}
