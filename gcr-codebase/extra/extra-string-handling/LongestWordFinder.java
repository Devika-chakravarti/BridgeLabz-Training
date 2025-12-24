import java.util.*;
public class LongestWordFinder{

    // Method to find the longest word in a sentence
    public String findLongestWord(String sentence){
        String longest="";
        String current="";
        // Loop through each character to build words
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);

            if(ch!=' '){
                current=current+ch;
            }else{
                if(current.length()>longest.length()){
                    longest=current;
                }
                current="";
            }
        }
        // Check last word
        if(current.length()>longest.length()){
            longest=current;
        }
        return longest;
    }

    // Main method to take input string 
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        LongestWordFinder obj=new LongestWordFinder();

        // Taking input from user
        System.out.print("Enter the sentence: ");
        String sentence=input.nextLine();

        String result=obj.findLongestWord(sentence);

        // Displaying result
        System.out.println("Longest word: "+result);
    }
}
