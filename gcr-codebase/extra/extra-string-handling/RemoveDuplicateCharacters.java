import java.util.*;
public class RemoveDuplicateCharacters{

    // Method to remove duplicate characters
    public String removeDuplicates(String text){
        String result="";
        // Loop through each character
        for(int i=0;i<text.length();i++){
            char current=text.charAt(i);
            boolean isDuplicate=false;
            // Check if character already exists in result
            for(int j=0;j<result.length();j++){
                if(current==result.charAt(j)){
                    isDuplicate=true;
                    break;
                }
            }
            // Add only non-duplicate characters
            if(!isDuplicate){
                result=result+current;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        RemoveDuplicateCharacters obj=new RemoveDuplicateCharacters();

        // Taking input from user
        System.out.print("Enter the text: ");
        String text=input.nextLine();

        String result=obj.removeDuplicates(text);

        // Displaying result
        System.out.println("String after removing duplicates: "+result);
    }
}
