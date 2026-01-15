/*
Problem: Container with most water
Problem description: You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
*/

class MostWaterContainer {
    public int maxArea(int[] height) {
        int left = 0;                  
        int right = height.length - 1; 
        int maxArea = 0;               

        while (left < right) {
            // Width between the lines
            int width = right - left;
            
            // Height is determined by the shorter line
            int currentHeight = Math.min(height[left], height[right]);
            
            // Calculate area
            int area = width * currentHeight;
            
            // Update maxArea if current area is bigger
            if (area > maxArea) {
                maxArea = area;
            }

            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
