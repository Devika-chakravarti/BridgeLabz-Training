import java.util.Scanner;
public class FindingMaxHandshakes{ 
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

	
		// Calculating maximum number of handshakes among n number of students
		int maxHandshakes = (n * (n - 1)) / 2;


		// Displaying the calculated maximum number of handshakes
		System.out.print("Number of possible handshakes are " + maxHandshakes);
	}
}