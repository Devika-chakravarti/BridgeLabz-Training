/*Top 5 Trending Movies
○ Scenario: From a huge movie list, find the top 5 based on rating and release
year.
○ Task: Use filter(), sorted(), limit().*/

package com.streamapi.commonmethods;

import java.util.*;
import java.util.stream.*;

class Movie {
	private String title;
	private double rating;
	private int releaseYear;
	public Movie(String title, double rating, int releaseYear) {
		this.title = title;
		this.rating = rating;
		this.releaseYear = releaseYear;
	}
	public String getTitle() {
		return title;
	}
	public double getRating() {
		return rating;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	@Override
	public String toString() {
		return title + " | " + rating + " | " + releaseYear;
	}
}

class MovieService {
	public static List<Movie> getTop5TrendingMovies(List<Movie> movies, int yearThreshold) {
		return movies.stream()
				.filter(movie -> movie.getReleaseYear() >= yearThreshold)
				.sorted(Comparator.comparingDouble(Movie::getRating).reversed().thenComparing(Movie::getReleaseYear,
						Comparator.reverseOrder()))
				.limit(5).collect(Collectors.toList());
	}
}

public class MovieApp {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(new Movie("Movie A", 8.9, 2024), new Movie("Movie B", 9.1, 2023),
				new Movie("Movie C", 8.5, 2024), new Movie("Movie D", 9.0, 2022), new Movie("Movie E", 8.8, 2023),
				new Movie("Movie F", 9.3, 2024), new Movie("Movie G", 8.2, 2021));
		List<Movie> trendingMovies = MovieService.getTop5TrendingMovies(movies, 2022);
		trendingMovies.forEach(System.out::println);
	}
}
