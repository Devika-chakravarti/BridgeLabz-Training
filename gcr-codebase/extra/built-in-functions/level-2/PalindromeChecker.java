import java.util.*;
public class PalindromeChecker{

    // Non-static method to take string input from user
    public String takeInput(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        String lowerCasedText =  text.toLowerCase();

        return lowerCasedText;
    }

    // Non-static method to check if the string is a palindrome
    public boolean isPalindrome(String text){
        int left=0;
        int right=text.length()-1;
        while(left<right){
	        // returns false if characters mismatch
            if(text.charAt(left)!=text.charAt(right)) return false; 
            left++;
            right--;
        }
	    // returns true if all characters matched
        return true; 
    }

    // Non-static method to display the result
    public void displayResult(String text,boolean result){
        if(result){
            System.out.println(text+" is a palindrome");
        }else{
            System.out.println(text+" is not a palindrome");
        }
    }

    // Method to call 
    public void runProgram(){
        String input=takeInput(); 
        boolean result=isPalindrome(input); 
        displayResult(input,result); 
    }

    // Main method to call runProgram() to display the result
    public static void main(String[] args){
        PalindromeChecker obj=new PalindromeChecker();
        obj.runProgram(); 
    }
}
