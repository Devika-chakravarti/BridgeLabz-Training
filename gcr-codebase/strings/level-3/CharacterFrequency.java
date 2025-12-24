import java.util.*;
public class CharacterFrequency{

    // Method to find character frequencies using charAt()  method and return the characters and their frequencies in a 2D array 
    public Object[][] findCharacterFrequency(String text){
        int[] frequency=new int[256];

        // Count frequency of each character
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            frequency[ch]++;
        }

        int count=0;
        // Count unique characters
        for(int i=0;i<text.length();i++){
            if(frequency[text.charAt(i)]>0){
                count++;
                frequency[text.charAt(i)]=-frequency[text.charAt(i)];
            }
        }

        Object[][] result=new Object[count][2];
        int index=0;

        // Store characters and their frequencies
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(frequency[ch]<0){
                result[index][0]=ch;
                result[index][1]=-frequency[ch];
                frequency[ch]=0;
                index++;
            }
        }
        return result;
    }

    // Main method take user inputs, call user-defined methods, and displays result
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        CharacterFrequency obj=new CharacterFrequency();

        // Taking input from user
        System.out.print("Enter the text: ");
        String text=input.nextLine();

        Object[][] result=obj.findCharacterFrequency(text);

        // Displaying result
        System.out.println("Character Frequency:");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+" : "+result[i][1]);
        }

	    input.close();
    }
}
