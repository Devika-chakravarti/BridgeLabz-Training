package com.sorting.cinemahouse;

class MovieShow {
	protected String movieName;
	protected int showTime; 

	public MovieShow(String movieName, int showTime) {
		this.movieName = movieName;
		this.showTime = showTime;
	}

	public void display() {
		System.out.println(movieName + " | Time: " + showTime);
	}
}
