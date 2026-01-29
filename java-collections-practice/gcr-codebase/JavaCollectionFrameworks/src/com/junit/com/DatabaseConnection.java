/*Testing @BeforeEach and @AfterEach Annotations
Problem:
Create a class DatabaseConnection with a method connect() and disconnect().
Use @BeforeEach to initialize a database connection before each test.
Use @AfterEach to close the connection after each test.
Write JUnit test cases to verify that the connection is established and closed correctly.
*/

package com.junit.com;

public class DatabaseConnection {

	private boolean isConnected;

	public void connect() {
		isConnected = true;
	}

	public void disconnect() {
		isConnected = false;
	}

	public boolean isConnected() {
		return isConnected;
	}
}
