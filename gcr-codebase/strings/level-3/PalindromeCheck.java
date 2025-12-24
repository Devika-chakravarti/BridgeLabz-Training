import java.util.*;
public class PalindromeCheck{

    // Logic 1: method to compare the characters from the start and end of the string to determine whether the text is palindrome
    public boolean checkPalindromeUsingLoop(String text){
        int start=0;
        int end=text.length()-1;

        // Compare characters from start and end
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: recursive method to compare the characters from the start and end of the text passed as parameters using recursion
    public boolean checkPalindromeUsingRecursion(String text,int start,int end){
        if(start>=end){
            return true;
        }
        if(text.charAt(start)!=text.charAt(end)){
            return false;
        }
        return checkPalindromeUsingRecursion(text,start+1,end-1);
    }

    // Method to reverse string using charAt()
    public char[] reverseText(String text){
        char[] reverse=new char[text.length()];
        int index=0;

        // Store characters in reverse order
        for(int i=text.length()-1;i>=0;i--){
            reverse[index]=text.charAt(i);
            index++;
        }
        return reverse;
    }

    // Logic 3: Method to compare the characters from the start and end of the text using character arrays
    public boolean checkPalindromeUsingArray(String text){
        char[] original=text.toCharArray();
        char[] reverse=reverseText(text);

        // Compare original and reverse arrays
        for(int i=0;i<original.length;i++){
            if(original[i]!=reverse[i]){
                return false;
            }
        }
        return true;
    }

    // Main method do palindrome check using the three logic and display result
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        PalindromeCheck obj=new PalindromeCheck();

        // Taking input from user
        System.out.print("Enter the text: ");
        String text=input.nextLine();

        boolean result1=obj.checkPalindromeUsingLoop(text);
        boolean result2=obj.checkPalindromeUsingRecursion(text,0,text.length()-1);
        boolean result3=obj.checkPalindromeUsingArray(text);

        // Displaying results
        System.out.println("Using Loop Logic: "+result1);
        System.out.println("Using Recursion Logic: "+result2);
        System.out.println("Using Array Logic: "+result3);

	    input.close();
    }
}
