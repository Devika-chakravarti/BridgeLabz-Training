import java.util.Scanner;
public class LexicographicalCompare{

    // Non-static method to compare two strings lexicographically
    public void compareStrings(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        // Loop through each character to compare
        for(int i = 0; i < minLen; i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            // Compare characters
            if(ch1 < ch2){
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                return;
            } 
	    else if(ch1 > ch2){
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
                return;
            }
        }
        // If all characters till minLen are same, compare lengths
        if(len1 < len2) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if(len1 > len2) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are equal in lexicographical order");
        }
    }

    // Main method to take two input string from the user to compare and display the result
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Take input for first string
        System.out.print("Enter String 1: ");
        String str1 = input.nextLine();
        // Take input for second string
        System.out.print("Enter String 2: ");
        String str2 = input.nextLine();

        // Create object to call non-static method
        LexicographicalCompare obj = new LexicographicalCompare();

        // Call method to compare strings
        obj.compareStrings(str1,str2);
        
        input.close();
    }
}
