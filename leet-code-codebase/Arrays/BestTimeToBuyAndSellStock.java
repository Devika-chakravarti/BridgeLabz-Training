/*
Problem: Best time to buy and sell stock
Problem description: You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/



class BestTimeToBuyAndSellStock{

    public int maxProfit(int[] prices){
        // Store the lowest price 
	    int minPrice = prices[0]; 
	    // Store maximum profit
        int maxProfit = 0; 
	
	    // using for loop from 0th index to iterate through prices array
        for(int i = 1; i < prices.length; i++){
	    
	        // check if prices are smaller than the minimum price i.e. prices[0] then update the value of minimum price with the current price value
            if(prices[i] < minPrice){
		        // Update minimum buying price
                minPrice = prices[i]; 
            } 
	        // otherwise check for difference between prices and minimum price is greater than maximum profit then update the value of maximum profit
	        else if((prices[i]-minPrice) > maxProfit){
		        // Update profit
                maxProfit = prices[i] - minPrice; 
            }
        }

	    // Return maximum profit
        return maxProfit; 
    }
}
