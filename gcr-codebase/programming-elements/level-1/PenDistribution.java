public class PenDistribution{
	public static void main(String args[]){		

		int pens = 14;
		int students = 3;



		// Calculating how many pens which will be equally distributed to the students
		int distributedpens = pens / students;

		// Calculating how many pens will remain non-distributed
		int nondistributedpens = pens % students;



		// Calculation of the pens, how many are equally distributed and how many remain undistributed
		System.out.println("The Pen Per Student is " + distributedpens + " and the remaining pen not distributed is " + nondistributedpens); 
	}
}