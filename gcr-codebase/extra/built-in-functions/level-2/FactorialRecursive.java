import java.util.*;
public class FactorialRecursive{

    // Non-static method to take integer input from user
    public int takeInput(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    // Non-static recursive method to calculate factorial
    public long factorial(int n){
	    // Base case
        if(n==0 || n==1) return 1; 
	    // Recursive call
        return n*factorial(n-1); 
    }

    // Non-static method to display the result
    public void displayResult(int n,long fact){
        System.out.println("Factorial of "+n+" is: "+fact);
    }

    // Method to call the non static method
    public void runProgram(){
        int number=takeInput();
        long result=factorial(number); 
        displayResult(number,result); 
    }

    // Main method to call the runProgram() to display the result
    public static void main(String[] args){
        FactorialRecursive obj=new FactorialRecursive();
        obj.runProgram(); 
    }
}
