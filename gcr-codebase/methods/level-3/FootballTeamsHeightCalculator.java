public class FootballTeamsHeightCalculator{


	// Method to generate random heights between 150 and 250 cm
	public int[] generateHeights(){
        	int[] heights = new int[11];
        	for(int i=0;i<heights.length;i++){
            		heights[i] = 150 + (int)(Math.random() * 101); // 150 to 250
        	}
        	return heights;
    	}	


	// Method to Find the sum of all the elements present in the array
	public int findSum(int[] heights){
        	int sum = 0;
        	for(int i=0;i<heights.length;i++){
            		sum += heights[i];
        	}
        	return sum;
    	}


	// Method to find the mean height of the players on the football team
	public double findMeanHeight(int[] heights){
        	int sum = findSum(heights);
        	return (double) sum / heights.length;
    	}
	
	
	// Method to find the shortest height of the players on the football team 
	public int findShortestHeight(int[] heights){
        	int min = heights[0];
        	for(int i=1;i<heights.length;i++){
            		if(heights[i] < min){
                		min = heights[i];
            		}
        	}
        	return min;
    	}


	// Method to find the tallest height of the players on the football team
	public int findTallestHeight(int[] heights){
        	int max = heights[0];
        	for(int i=1;i<heights.length;i++){
            		if(heights[i] > max){
                		max = heights[i];
            		}
        	}
        	return max;
    	}



	// Main method to take input heights and create object to call the methods and display the results
	public static void main(String args[]){
		FootballTeamsHeightCalculator obj = new FootballTeamsHeightCalculator();

        	// Generate random heights
        	int[] heights = obj.generateHeights();

        	// Display heights
        	System.out.println("Heights of Football Team Players:");
        	for(int i = 0; i < heights.length; i++){
            		System.out.print(heights[i] + " ");
        	}
        	System.out.println();

        	// Calculations (function calling through objects)
        	int sum = obj.findSum(heights);
        	double mean = obj.findMeanHeight(heights);
        	int shortest = obj.findShortestHeight(heights);
        	int tallest = obj.findTallestHeight(heights);

        	// Display results
        	System.out.println("Sum of Heights: " + sum);
        	System.out.println("Mean Height: " + mean);
        	System.out.println("Shortest Height: " + shortest);
        	System.out.println("Tallest Height: " + tallest);

	}

}