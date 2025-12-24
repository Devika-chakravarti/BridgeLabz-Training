import java.util.*;
public class PalindromeString{

    // Method to check if string is palindrome
    public boolean checkPalindrome(String lowercasedText){
        int start=0;
        int end=lowercasedText.length()-1;
        // Compare characters from start and end
        while(start<end){
            if(lowercasedText.charAt(start)!=lowercasedText.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Main method to take text from the user
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        PalindromeString obj=new PalindromeString();

        // Taking input from user
        System.out.print("Enter the text: ");
        String text=input.nextLine();

        String lowercasedText = text.toLowerCase();
        boolean result=obj.checkPalindrome(lowercasedText);

        // Displaying result
        if(result){
            System.out.println("Given string is a palindrome");
        }else{
            System.out.println("Given string is not a palindrome");
        }
    }
}
