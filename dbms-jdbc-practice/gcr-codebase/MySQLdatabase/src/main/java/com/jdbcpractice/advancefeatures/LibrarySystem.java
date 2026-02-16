package com.jdbcpractice.advancefeatures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class LibrarySystem {
	static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice_db";
	static final String USER = "root";
	static final String PASS = "DevikA@01";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

			LibraryService service = new LibraryService(con);
			service.createTables();
			service.insertSampleData();

			while (true) {
				System.out.println("1 View Books");
				System.out.println("2 Search Books");
				System.out.println("3 Borrow Book");
				System.out.println("4 Return Book");
				System.out.println("5 Borrow Records");
				System.out.println("6 Exit");

				int ch = input.nextInt();
				input.nextLine();

				switch (ch) {
				case 1:
					service.viewBooks();
					break;
				case 2:
					service.searchBooks(input);
					break;
				case 3:
					service.borrowBook(input);
					break;
				case 4:
					service.returnBook(input);
					break;
				case 5:
					service.viewBorrowRecords();
					break;
				case 6:
					return;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
