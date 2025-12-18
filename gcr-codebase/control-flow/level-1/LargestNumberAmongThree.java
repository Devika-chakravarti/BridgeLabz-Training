import java.util.*;
public class LargestNumberAmongThree{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();


		// Comparing number1 with number2 and number3 (using if block)
		if(number1 > number2 && number1 > number3){
			System.out.println("Is the first number the largest? " + "YES");
			System.out.println("Is the second number the largest? " + "NO");
			System.out.println("Is the third number the largest? " + "NO");
		}

		// Comparing number2 with number1 and number3 (using else if)
		else if(number2 > number1 && number2 > number3){
			System.out.println("Is the first number the largest? " + "NO");
			System.out.println("Is the second number the largest? " + "YES");
			System.out.println("Is the third number the largest? " + "NO");
		}

		// Comparing number3 with number1 and number2 (write the output statement in the else block)
		else{
			System.out.println("Is the first number the largest? " + "NO");
			System.out.println("Is the second number the largest? " + "NO");
			System.out.println("Is the third number the largest? " + "YES");
		}


		input.close();
	}
}