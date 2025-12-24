import java.util.*;
public class FibonacciGenerator{

    // Non-static method to generate and print Fibonacci sequence
    public void generateFibonacci(int terms){
        int a=0,b=1;
        System.out.print("Fibonacci series: ");
        for(int i=1;i<=terms;i++){
        // Print current term
	    System.out.print(a+" "); 
        // Calculate next term
	    int next=a+b; 
            a=b;
            b=next;
        }
        System.out.println();
    }

    // Method to take input number from the user and to call the generateFibonacci() 
    public void runProgram(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int number=input.nextInt();
	    // Call method to generate sequence
        generateFibonacci(number); 
    }

    // Main method to call the runProgram() and display the result
    public static void main(String[] args){
        FibonacciGenerator obj=new FibonacciGenerator();
        obj.runProgram(); 
    }
}
