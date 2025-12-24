import java.util.*;
public class GcdLcmCalculator{

    // Non-static method to take integer input from user
    public int takeInput(String message){
        Scanner input=new Scanner(System.in);
        System.out.print(message);
        return input.nextInt();
    }

    // Non-static method to calculate GCD using Euclidean algorithm
    public int calculateGCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
	    // Return GCD
        return a; 
    }

    // Non-static method to calculate LCM using GCD
    public int calculateLCM(int a,int b){
	    // LCM formula
        return (a*b)/calculateGCD(a,b); 
    }

    // Method to call non static method to take two input numbers from the user and calculates GCD and LCM
    public void runProgram(){
        int number1=takeInput("Enter first number: ");
        int number2=takeInput("Enter second number: ");

	    // Calculate GCD and LCM
        int gcd=calculateGCD(number1,number2); 
        int lcm=calculateLCM(number1,number2); 
        System.out.println("GCD of "+number1+" and "+number2+" is "+gcd);
        System.out.println("LCM of "+number1+" and "+number2+" is "+lcm);
    }

    // Main method to call runProgram() to display the result
    public static void main(String[] args){
        GcdLcmCalculator obj=new GcdLcmCalculator();
        obj.runProgram(); 
    }
}
