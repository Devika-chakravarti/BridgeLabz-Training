import java.util.*;
public class AnagramCheck{

    // Method to check if two texts are anagrams(word or phrase formed by rearranging the same letters to form different words or phrases)
    public boolean checkAnagram(String text1,String text2){

        // Check if the lengths of the two texts are equal
        if(text1.length()!=text2.length()){
            return false;
        }
	
	    // Two array to find the frequency of characters in the two texts
        int[] freq1=new int[256];
        int[] freq2=new int[256];

        // Find frequency of characters in first text
        for(int i=0;i<text1.length();i++){
            freq1[text1.charAt(i)]++;
        }

        // Find frequency of characters in second text
        for(int i=0;i<text2.length();i++){
            freq2[text2.charAt(i)]++;
        }

        // Compare the frequency of characters in the two texts
        for(int i=0;i<256;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }

    // Main method  take user inputs, call user-defined methods, and displays result
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        AnagramCheck obj=new AnagramCheck();

        // Taking inputs from user
        System.out.print("Enter first text: ");
        String text1=input.nextLine();
        System.out.print("Enter second text: ");
        String text2=input.nextLine();

        boolean result=obj.checkAnagram(text1,text2);

        // Displaying result
        if(result){
            System.out.println("The texts are anagrams");
        }else{
            System.out.println("The texts are not anagrams");
        }

	    input.close();
    }
}
