package com.jdbcpractice.transactionmanagement;

import java.sql.*;
import java.util.Scanner;

public class Banking {
	static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice_db";
	static final String USER = "root";
	static final String PASS = "DevikA@01";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
			createTables(con);
			insertSampleAccounts(con);

			while (true) {
				System.out.println("1 View All Accounts");
				System.out.println("2 Transfer Money");
				System.out.println("3 Check Balance by Name");
				System.out.println("4 Transaction History");
				System.out.println("5 Exit");

				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					viewAccounts(con);
					break;
				case 2:
					transfer(con, sc);
					break;
				case 3:
					checkBalanceByName(con, sc);
					break;
				case 4:
					history(con);
					break;
				case 5:
					return;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createTables(Connection con) throws SQLException {
		String acc = "CREATE TABLE IF NOT EXISTS account(" + "account_id INT PRIMARY KEY,"
				+ "holder_name VARCHAR(50) NOT NULL," + "balance DECIMAL(12,2) NOT NULL)";

		String txn = "CREATE TABLE IF NOT EXISTS transaction_history(" + "transaction_id INT PRIMARY KEY,"
				+ "from_account INT," + "to_account INT," + "amount DECIMAL(12,2),"
				+ "transaction_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,"
				+ "FOREIGN KEY (from_account) REFERENCES account(account_id))";

		Statement st = con.createStatement();
		st.executeUpdate(acc);
		st.executeUpdate(txn);
	}

	static void insertSampleAccounts(Connection con) throws SQLException {
		ResultSet rs = con.createStatement().executeQuery("SELECT COUNT(*) FROM account");
		rs.next();
		if (rs.getInt(1) == 0) {
			PreparedStatement ps = con.prepareStatement("INSERT INTO account VALUES (?,?,?)");

			ps.setInt(1, 101);
			ps.setString(2, "Devika chakravarti");
			ps.setDouble(3, 500000);
			ps.executeUpdate();

			ps.setInt(1, 102);
			ps.setString(2, "Shivam mishra");
			ps.setDouble(3, 200000);
			ps.executeUpdate();

			ps.setInt(1, 103);
			ps.setString(2, "Astha singh");
			ps.setDouble(3, 250000);
			ps.executeUpdate();

			ps.setInt(1, 104);
			ps.setString(2, "Madhvi vaghela");
			ps.setDouble(3, 300000);
			ps.executeUpdate();
		}
	}

	static void viewAccounts(Connection con) throws SQLException {
		ResultSet rs = con.createStatement().executeQuery("SELECT * FROM account");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getDouble(3));
		}
	}

	static void transfer(Connection con, Scanner sc) throws SQLException {
		System.out.print("Transaction id: ");
		int tid = sc.nextInt();
		System.out.print("From account: ");
		int from = sc.nextInt();
		System.out.print("To account: ");
		int to = sc.nextInt();
		System.out.print("Amount: ");
		double amt = sc.nextDouble();
		sc.nextLine();
		try {
			con.setAutoCommit(false);

			PreparedStatement bal = con.prepareStatement("SELECT balance FROM account WHERE account_id=?");
			bal.setInt(1, from);
			ResultSet rs = bal.executeQuery();

			if (!rs.next() || rs.getDouble(1) < amt) {
				con.rollback();
				con.setAutoCommit(true);
				System.out.println("Transfer rolled back");
				return;
			}

			PreparedStatement d = con.prepareStatement("UPDATE account SET balance=balance-? WHERE account_id=?");
			d.setDouble(1, amt);
			d.setInt(2, from);
			d.executeUpdate();

			PreparedStatement c = con.prepareStatement("UPDATE account SET balance=balance+? WHERE account_id=?");
			c.setDouble(1, amt);
			c.setInt(2, to);
			c.executeUpdate();

			PreparedStatement ins = con
					.prepareStatement("INSERT INTO transaction_history VALUES (?,?,?, ?, CURRENT_TIMESTAMP)");
			ins.setInt(1, tid);
			ins.setInt(2, from);
			ins.setInt(3, to);
			ins.setDouble(4, amt);
			ins.executeUpdate();

			con.commit();
			con.setAutoCommit(true);
			System.out.println("Transfer committed");
		} catch (Exception e) {
			con.rollback();
			con.setAutoCommit(true);
			System.out.println("Transfer rolled back");
			e.printStackTrace();
		}
	}

	static void checkBalanceByName(Connection con, Scanner sc) throws SQLException {
		System.out.print("Holder name: ");
		String name = sc.nextLine();

		PreparedStatement ps = con
				.prepareStatement("SELECT account_id, holder_name, balance FROM account WHERE holder_name=?");
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getDouble(3));
		}
	}

	static void history(Connection con) throws SQLException {
		ResultSet rs = con.createStatement().executeQuery("SELECT * FROM transaction_history");

		while (rs.next()) {
			System.out.println(
					rs.getInt("transaction_id") + " | " + rs.getInt("from_account") + " | " + rs.getInt("to_account")
							+ " | " + rs.getDouble("amount") + " | " + rs.getTimestamp("transaction_time"));
		}
	}
}
