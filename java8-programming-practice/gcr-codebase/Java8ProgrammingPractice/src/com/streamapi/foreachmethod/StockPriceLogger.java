/*Stock Price Logger
○ Scenario: Display all stock prices from a live feed.
○ Task: Use forEach() to print updates.*/

package com.streamapi.foreachmethod;

import java.util.*;

class Stock {
	private String symbol;
	private double price;

	public Stock(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
	}

	@Override
	public String toString() {
		return symbol + " : " + price;
	}
}

public class StockPriceLogger {
	private static void logStockPrices(List<Stock> stocks) {
		stocks.forEach(stock -> System.out.println(stock));
	}

	public static void main(String[] args) {
		List<Stock> liveFeed = Arrays.asList(new Stock("TCS", 3845.50), new Stock("INFY", 1520.75),
				new Stock("HDFC", 1689.30), new Stock("RELIANCE", 2940.10));

		logStockPrices(liveFeed);
	}
}
