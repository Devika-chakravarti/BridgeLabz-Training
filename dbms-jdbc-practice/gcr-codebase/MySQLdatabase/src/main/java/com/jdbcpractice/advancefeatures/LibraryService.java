package com.jdbcpractice.advancefeatures;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class LibraryService {
	private Connection con;

	public LibraryService(Connection con) {
		this.con = con;
	}

	void createTables() throws SQLException {
		String student = "CREATE TABLE IF NOT EXISTS student(" + "student_id INT PRIMARY KEY,"
				+ "student_name VARCHAR(60) NOT NULL)";

		String book = "CREATE TABLE IF NOT EXISTS book(" + "book_id INT PRIMARY KEY," + "title VARCHAR(100) NOT NULL,"
				+ "author VARCHAR(100)," + "genre VARCHAR(100)," + "copies_available INT NOT NULL)";

		String borrow = "CREATE TABLE IF NOT EXISTS borrow_record(" + "borrow_id INT PRIMARY KEY," + "student_id INT,"
				+ "book_id INT," + "borrow_date DATE," + "return_date DATE," + "fine_amount DECIMAL(10,2),"
				+ "FOREIGN KEY (student_id) REFERENCES student(student_id),"
				+ "FOREIGN KEY (book_id) REFERENCES book(book_id))";

		Statement st = con.createStatement();
		st.executeUpdate(student);
		st.executeUpdate(book);
		st.executeUpdate(borrow);
	}

	void insertSampleData() throws SQLException {
		ResultSet rs1 = con.createStatement().executeQuery("SELECT COUNT(*) FROM book");
		rs1.next();
		if (rs1.getInt(1) == 0) {
			PreparedStatement ps = con.prepareStatement("INSERT INTO book VALUES (?,?,?,?,?)");

			ps.setInt(1, 1001);
			ps.setString(2, "The Alchemist");
			ps.setString(3, "Paulo coelho");
			ps.setString(4, "Fiction");
			ps.setInt(5, 100);
			ps.executeUpdate();

			ps.setInt(1, 1002);
			ps.setString(2, "The Atomic habits");
			ps.setString(3, "James clear");
			ps.setString(4, "Self-help");
			ps.setInt(5, 50);
			ps.executeUpdate();

			ps.setInt(1, 1003);
			ps.setString(2, "Clean code");
			ps.setString(3, "Robert C. Martin");
			ps.setString(4, "Fantasy");
			ps.setInt(5, 60);
			ps.executeUpdate();

			ps.setInt(1, 1004);
			ps.setString(2, "The silent patient");
			ps.setString(3, "Alex Michaelides");
			ps.setString(4, "Mystery");
			ps.setInt(5, 80);
			ps.executeUpdate();
		}

		ResultSet rs2 = con.createStatement().executeQuery("SELECT COUNT(*) FROM student");
		rs2.next();
		if (rs2.getInt(1) == 0) {
			PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES (?,?)");

			ps.setInt(1, 1);
			ps.setString(2, "Devika chakravarti");
			ps.executeUpdate();

			ps.setInt(1, 2);
			ps.setString(2, "Astha singh");
			ps.executeUpdate();

			ps.setInt(1, 3);
			ps.setString(2, "Shivam Mishra");
			ps.executeUpdate();

			ps.setInt(1, 4);
			ps.setString(2, "Madhvi vaghela");
			ps.executeUpdate();
		}
	}

	void viewBooks() throws SQLException {
		ResultSet rs = con.createStatement().executeQuery("SELECT * FROM book");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | "
					+ rs.getString(4) + " | " + rs.getInt(5));
		}
	}

	void searchBooks(Scanner input) throws SQLException {
		System.out.print("Genre: ");
		String genre = input.nextLine();
		System.out.print("Author keyword: ");
		String auth = input.nextLine();

		PreparedStatement ps = con.prepareStatement("SELECT * FROM book WHERE genre=? AND author LIKE ?");
		ps.setString(1, genre);
		ps.setString(2, "%" + auth + "%");

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | "
					+ rs.getString(4) + " | " + rs.getInt(5));
		}
	}

	void borrowBook(Scanner input) throws SQLException {
		System.out.print("Borrow id: ");
		int bid = input.nextInt();
		System.out.print("Student id: ");
		int sid = input.nextInt();
		System.out.print("Book id: ");
		int bookId = input.nextInt();
		input.nextLine();

		try {
			con.setAutoCommit(false);

			PreparedStatement chk = con.prepareStatement("SELECT copies_available FROM book WHERE book_id=?");
			chk.setInt(1, bookId);
			ResultSet rs = chk.executeQuery();

			if (!rs.next() || rs.getInt(1) <= 0) {
				con.rollback();
				con.setAutoCommit(true);
				System.out.println("Not available");
				return;
			}

			PreparedStatement ins = con.prepareStatement("INSERT INTO borrow_record VALUES (?,?,?,?,?,?)");
			ins.setInt(1, bid);
			ins.setInt(2, sid);
			ins.setInt(3, bookId);
			ins.setDate(4, Date.valueOf(LocalDate.now()));
			ins.setDate(5, null);
			ins.setDouble(6, 0);
			ins.executeUpdate();

			PreparedStatement upd = con
					.prepareStatement("UPDATE book SET copies_available=copies_available-1 WHERE book_id=?");
			upd.setInt(1, bookId);
			upd.executeUpdate();

			con.commit();
			con.setAutoCommit(true);
			System.out.println("Borrow recorded");

		} catch (Exception e) {
			con.rollback();
			con.setAutoCommit(true);
			System.out.println("Borrow failed");
			e.printStackTrace();
		}
	}

	void returnBook(Scanner input) throws SQLException {
		System.out.print("Borrow id: ");
		int bid = input.nextInt();
		input.nextLine();

		PreparedStatement ps = con.prepareStatement("SELECT book_id, borrow_date FROM borrow_record WHERE borrow_id=?");
		ps.setInt(1, bid);
		ResultSet rs = ps.executeQuery();

		if (!rs.next()) {
			System.out.println("Invalid borrow id");
			return;
		}

		int bookId = rs.getInt(1);
		LocalDate borrowDate = rs.getDate(2).toLocalDate();
		LocalDate ret = LocalDate.now();

		long days = java.time.temporal.ChronoUnit.DAYS.between(borrowDate, ret);
		double fine = days > 7 ? (days - 7) * 10 : 0;

		PreparedStatement upd1 = con
				.prepareStatement("UPDATE borrow_record SET return_date=?, fine_amount=? WHERE borrow_id=?");
		upd1.setDate(1, Date.valueOf(ret));
		upd1.setDouble(2, fine);
		upd1.setInt(3, bid);
		upd1.executeUpdate();

		PreparedStatement upd2 = con
				.prepareStatement("UPDATE book SET copies_available=copies_available+1 WHERE book_id=?");
		upd2.setInt(1, bookId);
		upd2.executeUpdate();

		System.out.println("Returned, fine = " + fine);
	}

	void viewBorrowRecords() throws SQLException {
		ResultSet rs = con.createStatement().executeQuery("SELECT * FROM borrow_record");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getInt(2) + " | " + rs.getInt(3) + " | " + rs.getDate(4)
					+ " | " + rs.getDate(5) + " | " + rs.getDouble(6));
		}
	}
}
