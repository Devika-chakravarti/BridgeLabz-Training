import java.util.*;
public class CharacterFrequencyNested{

    // Method to find character frequency using nested loops
    public String[] findCharacterFrequency(String text){
	// Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
        char[] chars=text.toCharArray();
        int[] freq=new int[chars.length];

        // Using nestes loops to Calculate frequency of each character
        for(int i=0;i<chars.length;i++){
            freq[i]=1;
            if(chars[i]=='0'){
                continue;
            }
            for(int j=i+1;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    freq[i]++;
                    chars[j]='0';
                }
            }
        }

        int count=0;
        // Count valid characters
        for(int i=0;i<chars.length;i++){
            if(chars[i]!='0'){
                count++;
            }
        }

	// Create a 1D String array to store the characters and their frequencies
        String[] result=new String[count];
        int index=0;

        // Store characters and their frequencies
        for(int i=0;i<chars.length;i++){
            if(chars[i]!='0'){
                result[index]=chars[i]+" : "+freq[i];
                index++;
            }
        }
        return result;
    }

    // Main method takes user inputs, calls the user-defined methods, and displays the result
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        CharacterFrequencyNested obj=new CharacterFrequencyNested();

        // Taking input from user
        System.out.print("Enter the text: ");
        String text=input.nextLine();

        String[] result=obj.findCharacterFrequency(text);

        // Displaying result
        System.out.println("Character Frequency:");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

	    input.close();
    }
}
