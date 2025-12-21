public class NumberCheckerVersionThree{


    // Method to find the count of digits in a number
    public static int countDigits(int number){
        int count = 0;
        int temp = number;
        while(temp != 0){
            temp /= 10;
            count++;
        }
        return count;
    }


    // Method to store digits of a number in an array
    public static int[] storeDigits(int number){
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = number;
        for(int i = count - 1; i >= 0; i--){
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }


    // Method to reverse a digits array
    public static int[] reverseArray(int[] array){
        int[] reversed = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }


    // Method to compare two arrays for equality
    public static boolean areArraysEqual(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length) return false;
        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }


    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number){
        int[] digits = storeDigits(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits,reversed);
    }


    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number){
        int[] digits = storeDigits(number);
        for(int i = 0; i < digits.length; i++){
            if (digits[i] == 0) return true;
        }
        return false;
    }


}
