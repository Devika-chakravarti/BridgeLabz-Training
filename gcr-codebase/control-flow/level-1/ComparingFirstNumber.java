import java.util.*;
public class ComparingFirstNumber{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();


		// Comparing number1 with number2 and number3
		if(number1 < number2  && number1 < number3){
			System.out.println("Is the first number the smallest? " + "YES");
		}
		else{
			System.out.println("Is the first number the smallest? " + "NO");
		}


		input.close();
	}
}