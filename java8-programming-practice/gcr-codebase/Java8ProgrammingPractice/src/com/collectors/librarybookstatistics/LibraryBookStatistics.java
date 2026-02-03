/*Library Book Statistics
Given a list of books with their genres and number of pages, use
Collectors.summarizingInt()
to find total pages, average pages, and maximum pages per genre.*/

package com.collectors.librarybookstatistics;

import java.util.*;
import java.util.stream.Collectors;

class Book {
	private String title;
	private String genre;
	private int pages;

	Book(String title, String genre, int pages) {
		this.title = title;
		this.genre = genre;
		this.pages = pages;
	}

	public String getGenre() {
		return genre;
	}

	public int getPages() {
		return pages;
	}
}

public class LibraryBookStatistics {
	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book("Book A", "Fiction", 320), new Book("Book B", "Fiction", 280),
				new Book("Book C", "Science", 450), new Book("Book D", "Science", 500),
				new Book("Book E", "History", 300));

		Map<String, IntSummaryStatistics> statsByGenre = books.stream()
				.collect(Collectors.groupingBy(Book::getGenre, Collectors.summarizingInt(Book::getPages)));

		statsByGenre.forEach((genre, stats) -> {
			System.out.println("Genre: " + genre);
			System.out.println("Total Pages: " + stats.getSum());
			System.out.println("Average Pages: " + stats.getAverage());
			System.out.println("Max Pages: " + stats.getMax());
			System.out.println();
		});
	}
}
