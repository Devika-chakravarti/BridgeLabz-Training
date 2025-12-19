import java.util.*;
public class Copy2DArrayInto1DArray{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		// Taking user input for number of rows and columns in matrix
		int rows = input.nextInt();
		int columns = input.nextInt();
		// Declaring the matrix with rows and columns user input value
		int[][] matrix = new int[rows][columns]; 		


		// Using for loop to take input from the user for matrix
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				matrix[i][j] = input.nextInt();
			}
		}
		
		// Create array of size rows*columns
		int[] array = new int[rows*columns];
		int index = 0;

		// Copying elements from matrix to array
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				array[index] = matrix[i][j];
				index++;
			}
		}		


		// Print the array elements
		for(int i=0;i<index;i++){
			System.out.print(array[i] + " ");
		}



		input.close();
	}
}