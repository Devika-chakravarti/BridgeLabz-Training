import java.util.*;
public class VowelConsonantCounter{

    // static method to check if a character is vowel, consonant, or not a letter
    public static String checkCharacterType(char ch){

        // Convert uppercase to lowercase using ASCII values
        if(ch>='A'&&ch<='Z'){ch=(char)(ch+32);}
        // Check if character is a letter
        if(ch>='a'&&ch<='z'){
            // Check vowel
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                return "Vowel";
            }
            else{
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Static method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text){
        int vowelCount=0;
        int consonantCount=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            String result=checkCharacterType(ch);
            if(result.equals("Vowel")){vowelCount++;}
            else if(result.equals("Consonant")){consonantCount++;}
        }
        return new int[]{vowelCount,consonantCount};
    }

    // Main method to take input string from the user
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        VowelConsonantCounter obj=new VowelConsonantCounter(); //object creation
        System.out.print("Enter a string: ");
        String text=input.nextLine();
        int[] result=obj.countVowelsAndConsonants(text); //method call using object

        System.out.println("Vowel Count : "+result[0]);
        System.out.println("Consonant Count : "+result[1]);

        input.close();
    }
}
