/*Testing List Operations
Problem:
Create a ListManager class that has the following methods:
addElement(List<Integer> list, int element): Adds an element to a list.
removeElement(List<Integer> list, int element): Removes an element from a list.
getSize(List<Integer> list): Returns the size of the list.
*/

package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

	// List manager logic inside same file
	class ListManager {

		// adds an element to the list
		void addElement(List<Integer> list, int element) {
			list.add(element);
		}

		// removes an element from the list
		void removeElement(List<Integer> list, int element) {
			list.remove(Integer.valueOf(element));
		}

		// returns size of the list
		int getSize(List<Integer> list) {
			return list.size();
		}
	}

	ListManager manager = new ListManager();

	@Test
	void testAddElement() {
		List<Integer> list = new ArrayList<>();

		manager.addElement(list, 10);
		manager.addElement(list, 20);

		// checking elements are added
		assertTrue(list.contains(10));
		assertTrue(list.contains(20));
	}

	@Test
	void testRemoveElement() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);

		manager.removeElement(list, 10);

		// checking element is removed
		assertFalse(list.contains(10));
	}

	@Test
	void testListSize() {
		List<Integer> list = new ArrayList<>();

		manager.addElement(list, 5);
		manager.addElement(list, 15);

		// checking correct size
		int size = manager.getSize(list);
		assertEquals(2, size);
	}
}
