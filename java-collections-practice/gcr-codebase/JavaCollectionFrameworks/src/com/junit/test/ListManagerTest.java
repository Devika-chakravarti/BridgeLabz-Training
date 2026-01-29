package com.junit.test;

import org.junit.jupiter.api.Test;
import com.junit.com.ListManager;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListManagerTest {

	private ListManager manager = new ListManager();

	@Test
	void testAddElement() {
		List<Integer> list = new ArrayList<>();

		manager.addElement(list, 10);
		manager.addElement(list, 20);

		assertTrue(list.contains(10));
		assertTrue(list.contains(20));
	}

	@Test
	void testRemoveElement() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);

		manager.removeElement(list, 10);

		assertFalse(list.contains(10));
	}

	@Test
	void testListSize() {
		List<Integer> list = new ArrayList<>();

		manager.addElement(list, 5);
		manager.addElement(list, 15);

		assertEquals(2, manager.getSize(list));
	}
}
