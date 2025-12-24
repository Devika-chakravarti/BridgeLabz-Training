import java.util.*;
public class UniqueCharacters{

    // Method to find length of text without using length()
    public int findTextLength(String text){
        int count=0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(Exception e){
            return count;
        }
    }

    // Method to find unique characters using charAt() and return them as a 1D array
    public char[] findUniqueCharacters(String text){
        int length=findTextLength(text);
        char[] temp=new char[length];
        int index=0;

        // Loop to check each character
        for(int i=0;i<length;i++){
            char current=text.charAt(i);
            boolean isUnique=true;

            // Compare with previous characters
            for(int j=0;j<i;j++){
                if(current==text.charAt(j)){
                    isUnique=false;
                    break;
                }
            }

            // Store only unique characters
            if(isUnique){
                temp[index]=current;
                index++;
            }
        }

        // Create exact size array for unique characters
        char[] result=new char[index];
        for(int i=0;i<index;i++){
            result[i]=temp[i];
        }
        return result;
    }

    // Main method  takes user inputs, calls the user-defined methods, and displays the result
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        UniqueCharacters obj=new UniqueCharacters();

        // Taking input from user
        System.out.print("Enter the text: ");
        String text=input.nextLine();

        char[] uniqueChars=obj.findUniqueCharacters(text);

        // Displaying result
        System.out.print("Unique characters are: ");
        for(int i=0;i<uniqueChars.length;i++){
            System.out.print(uniqueChars[i]+" ");
        }

        input.close();
    }
}
