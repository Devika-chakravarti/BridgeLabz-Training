import java.util.*;
public class CharacterFrequencyUsingUnique{

    // Method to find unique characters in a string using the charAt() method and return them as a 1D array
    public char[] uniqueCharacters(String text){
        char[] temp=new char[text.length()];
        int index=0;

        // Loop to pick each character
        for(int i=0;i<text.length();i++){
            char current=text.charAt(i);
            boolean isUnique=true;

            // Check if character appeared before
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

        char[] result=new char[index];
        for(int i=0;i<index;i++){
            result[i]=temp[i];
        }
        return result;
    }

    // Method to find frequency of characters in a string and return the characters and their frequencies in a 2D array
    public String[][] findCharacterFrequency(String text){
        int[] frequency=new int[256];

        // Count frequency of characters
        for(int i=0;i<text.length();i++){
            frequency[text.charAt(i)]++;
        }

        char[] unique=uniqueCharacters(text);
        // 2D String array to store the unique characters and their frequencies
        String[][] result=new String[unique.length][2];

        // Store unique characters and their frequencies
        for(int i=0;i<unique.length;i++){
            result[i][0]=String.valueOf(unique[i]);
            result[i][1]=String.valueOf(frequency[unique[i]]);
        }
        return result;
    }

    // Main method take user inputs, call user-defined methods, and displays result
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        CharacterFrequencyUsingUnique obj=new CharacterFrequencyUsingUnique();

        // Taking input from user
        System.out.print("Enter the text: ");
        String text=input.nextLine();

        String[][] result=obj.findCharacterFrequency(text);

        // Displaying result
        System.out.println("Character Frequency:");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+" : "+result[i][1]);
        }

	    input.close();
    }
}
