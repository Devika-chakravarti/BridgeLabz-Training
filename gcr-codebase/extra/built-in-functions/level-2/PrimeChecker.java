import java.util.*;

public class PrimeChecker{

    // Non-static method to check if a number is prime
    public boolean isPrime(int num){
         // Numbers <=1 are not prime
	    if(num<=1) return false;
	    // Check divisibility up to square root
        for(int i=2;i<=Math.sqrt(num);i++){ 
        // if divisible then not a prime
	    if(num%i==0) return false; 
        }
	    // if no divisor found then it is a prime
        return true; 
    }

    public void runProgram(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=input.nextInt();
	 
	    // Call method to check prime
        boolean result=isPrime(number); 
        if(result){
            System.out.println(number+" is a prime number");
        }else{
            System.out.println(number+" is not a prime number");
        }
    }

    public static void main(String[] args){
        PrimeChecker obj=new PrimeChecker();
        obj.runProgram(); 
    }
}
