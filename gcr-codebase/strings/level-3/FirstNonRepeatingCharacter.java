import java.util.*;
public class FirstNonRepeatingCharacter{

    // Method to find first non-repeating character using charAt() method and return the character
    public char findFirstNonRepeatingCharacter(String text){
        int[] frequency=new int[256];

        // Loop to count frequency of each character
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            frequency[ch]++;
        }

        // Loop to find first character with frequency 1
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(frequency[ch]==1){
                return ch;
            }
        }
        return '\0';
    }

    //Main method  take user inputs, call user-defined methods, and displays result
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        FirstNonRepeatingCharacter obj=new FirstNonRepeatingCharacter();

        // Taking input from user
        System.out.print("Enter the text: ");
        String text=input.nextLine();

        char result=obj.findFirstNonRepeatingCharacter(text);

        // Displaying result
        if(result!='\0'){
            System.out.println("First non-repeating character is: "+result);
        }else{
            System.out.println("No non-repeating character found");
        }

        input.close();
    }
}
