import java.util.*;
public class ReverseString{

    // Method to reverse a string using charAt()
    public String reverseText(String text){
        String reversed="";
        // Loop from end to start to build reversed string
        for(int i=text.length()-1;i>=0;i--){
            reversed=reversed+text.charAt(i);
        }
        return reversed;
    }

    // Main method to take text from the user
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ReverseString obj=new ReverseString();

        // Taking input from user
        System.out.print("Enter the text: ");
        String text=input.nextLine();

        String result=obj.reverseText(text);

        // Displaying result
        System.out.println("Reversed string: "+result);
    }
}
