import java.util.*;
public class BasicCalculator{

    // Non-static method to perform addition
    public double add(double a,double b){
        return a+b;
    }

    // Non-static method to perform subtraction
    public double subtract(double a,double b){
        return a-b;
    }

    // Non-static method to perform multiplication
    public double multiply(double a,double b){
        return a*b;
    }

    // Non-static method to perform division
    public double divide(double a,double b){
        if(b==0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a/b;
    }

    // Method to call the non static methods 
    public void runProgram(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1=input.nextDouble();
        System.out.print("Enter second number: ");
        double num2=input.nextDouble();

        System.out.print("Choose operator(+,-,*,/): ");
        char op=input.next().charAt(0);

        double result=0;
        switch(op){
            case '+': result=add(num1,num2); break;
            case '-': result=subtract(num1,num2); break; 
            case '*': result=multiply(num1,num2); break; 
            case '/': result=divide(num1,num2); break; 
            default: System.out.println("Invalid operator"); 
            return;
        }

        System.out.println("Result: "+result);
    }

    // Main method to call the runProgram() to display the result
    public static void main(String[] args){
        BasicCalculator obj=new BasicCalculator();
        obj.runProgram(); 
    }
}
