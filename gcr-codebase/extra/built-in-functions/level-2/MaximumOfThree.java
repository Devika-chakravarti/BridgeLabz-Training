import java.util.*;
public class MaximumOfThree{

    // Non-static method to take integer input from user
    public int takeInput(String message){
        Scanner input=new Scanner(System.in);
        System.out.print(message);
        return input.nextInt();
    }

    // Non-static method to find maximum of three numbers
    public int findMaximum(int a,int b,int c){
        int max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        // Return the maximum value
	    return max; 
    }

    // Method to call non static method to take three input integers and to find maximum
    public void runProgram(){
        int number1=takeInput("Enter first number: ");
        int number2=takeInput("Enter second number: ");
        int number3=takeInput("Enter third number: ");

	    // Find maximum
        int max=findMaximum(number1,number2,number3); 
        System.out.println("Maximum number is "+max);
    }

    // Main method to call runProgram() to display the result
    public static void main(String[] args){
        MaximumOfThree obj=new MaximumOfThree();
        obj.runProgram();
    }
}
