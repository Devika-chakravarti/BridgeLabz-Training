package com.junit.test;

import com.junit.com.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatabaseConnectionTest {

	private DatabaseConnection dbConnection;

	@BeforeEach
	void setUp() {
		dbConnection = new DatabaseConnection();
		dbConnection.connect();
	}

	@AfterEach
	void tearDown() {
		dbConnection.disconnect();
	}

	@Test
	void testDatabaseIsConnected() {
		assertTrue(dbConnection.isConnected());
	}

	@Test
	void testDatabaseIsDisconnectedAfterTest() {
		dbConnection.disconnect();
		assertFalse(dbConnection.isConnected());
	}
}
