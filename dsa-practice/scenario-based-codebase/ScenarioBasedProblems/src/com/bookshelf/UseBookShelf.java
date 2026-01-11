package com.bookshelf;

import java.util.Scanner;

public class UseBookShelf {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		BookShelf shelf = new BookShelf();

		System.out.println("============================================");
		System.out.println("         WELCOME TO OUR BOOKSHELF");
		System.out.println("============================================");
		
		while (true) {
			
			System.out.println("\n1. Show Books");
			System.out.println("2. Borrow Book");
			System.out.println("3. Return Book");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {

			case 1:
				shelf.showBooks();
				break;

			case 2:
				System.out.print("Enter Genre: ");
				String genreBorrow = input.nextLine();

				System.out.print("Enter Book Name: ");
				String bookBorrow = input.nextLine();

				shelf.borrowBook(genreBorrow, bookBorrow);
				break;

			case 3:
				System.out.print("Enter Genre: ");
				String genreReturn = input.nextLine();

				System.out.print("Enter Book Name: ");
				String bookReturn = input.nextLine();

				System.out.print("Enter Author Name: ");
				String authorReturn = input.nextLine();

				shelf.returnBook(genreReturn, bookReturn, authorReturn);
				break;

			case 4:
				System.out.println("\n============================================");
				System.out.println("     THANK YOU FOR USING OUR BOOKSHELF");
				System.out.println("============================================");
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
