package com.jdbcpractice.crudapplication;

import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD {
	static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice_db";
	static final String USER = "root";
	static final String PASS = "DevikA@01";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
			createTable(con);

			while (true) {
				System.out.println("1 Add Employee");
				System.out.println("2 View All Employees");
				System.out.println("3 Update Salary");
				System.out.println("4 Delete Employee");
				System.out.println("5 Search Employee by Name");
				System.out.println("6 Exit");
				int choice = input.nextInt();
				input.nextLine();

				switch (choice) {
				case 1:
					addEmployee(con, input);
					break;
				case 2:
					viewEmployees(con);
					break;
				case 3:
					updateSalary(con, input);
					break;
				case 4:
					deleteEmployee(con, input);
					break;
				case 5:
					searchEmployee(con, input);
					break;
				case 6:
					return;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createTable(Connection con) throws SQLException {
		String sql = "CREATE TABLE IF NOT EXISTS employee (" + "employee_id INT PRIMARY KEY, "
				+ "name VARCHAR(50) NOT NULL, " + "salary DECIMAL(10,2) NOT NULL, " + "department VARCHAR(40))";

		try (Statement st = con.createStatement()) {
			st.executeUpdate(sql);
		}
	}

	static void addEmployee(Connection con, Scanner sc) throws SQLException {
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter department: ");
		String dept = sc.nextLine();

		String sql = "INSERT INTO employee VALUES (?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, salary);
			ps.setString(4, dept);
			ps.executeUpdate();
		}
	}

	static void viewEmployees(Connection con) throws SQLException {
		String sql = "SELECT * FROM employee";
		try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " " + rs.getString(4));
			}
		}
	}

	static void updateSalary(Connection con, Scanner sc) throws SQLException {
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter new salary: ");
		double sal = sc.nextDouble();
		sc.nextLine();

		String sql = "UPDATE employee SET salary=? WHERE name=?";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setDouble(1, sal);
			ps.setString(2, name);
			ps.executeUpdate();
		}
	}

	static void deleteEmployee(Connection con, Scanner sc) throws SQLException {
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		String sql = "DELETE FROM employee WHERE name=?";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, name);
			ps.executeUpdate();
		}
	}

	static void searchEmployee(Connection con, Scanner sc) throws SQLException {
		System.out.print("Enter keyword: ");
		String key = sc.nextLine();
		String sql = "SELECT * FROM employee WHERE name LIKE ?";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, "%" + key + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " " + rs.getString(4));
			}
		}
	}
}
