/*Testing @BeforeEach and @AfterEach Annotations
Problem:
Create a class DatabaseConnection with a method connect() and disconnect().
Use @BeforeEach to initialize a database connection before each test.
Use @AfterEach to close the connection after each test.
Write JUnit test cases to verify that the connection is established and closed correctly.
*/

package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

	// flag to check connection status
	private boolean isConnected;

	// method to simulate database connection
	void connect() {
		isConnected = true;
	}

	// method to simulate closing database connection
	void disconnect() {
		isConnected = false;
	}

	@BeforeEach
	void setUp() {
		// connecting before each test
		connect();
	}

	@AfterEach
	void tearDown() {
		// disconnecting after each test
		disconnect();
	}

	@Test
	void testDatabaseIsConnected() {
		// checking connection is established
		assertTrue(isConnected);
	}

	@Test
	void testDatabaseIsDisconnectedAfterTest() {
		// manually disconnect and check
		disconnect();
		assertFalse(isConnected);
	}
}
