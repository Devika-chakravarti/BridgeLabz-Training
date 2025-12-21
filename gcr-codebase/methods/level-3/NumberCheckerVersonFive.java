public class NumberCheckerVersonFive{


    // Method to calculate sum of proper divisors of a number
    public static int sumOfProperDivisors(int number){
        int sum = 0;
        for(int i = 1; i <= number / 2; i++){ // proper divisors are less than number
            if(number % i == 0){
                sum += i;
            }
        }
        return sum;
    }


    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number){
        if(number <= 0) return false;
        return sumOfProperDivisors(number) == number;
    }


    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number){
        if(number <= 0) return false;
        return sumOfProperDivisors(number) > number;
    }


    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number){
        if(number <= 0) return false;
        return sumOfProperDivisors(number) < number;
    }


    // Method to calculate factorial of a number
    public static int factorial(int n){
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }


    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number){
        int sum = 0;
        int temp = number;
        while(temp != 0){
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }


}
