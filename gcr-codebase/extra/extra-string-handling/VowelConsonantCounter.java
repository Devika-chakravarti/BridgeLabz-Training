import java.util.*;
public class VowelConsonantCounter{

    // Method to count vowels and consonants
    public int[] countVowelsAndConsonants(String text){
        int vowels=0;
        int consonants=0;

        // Loop through each character of string
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            // Check only alphabet characters
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
                ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        return new int[]{vowels,consonants};
    }

    // Main method to take text from the user
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        VowelConsonantCounter obj=new VowelConsonantCounter();

        // Taking input from user
        System.out.print("Enter the text: ");
        String text=input.nextLine();

        int[] result=obj.countVowelsAndConsonants(text);

        // Displaying result
        System.out.println("Vowels: "+result[0]);
        System.out.println("Consonants: "+result[1]);
    }
}
