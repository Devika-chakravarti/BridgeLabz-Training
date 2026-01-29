/*Testing List Operations
Problem:
Create a ListManager class that has the following methods:
addElement(List<Integer> list, int element): Adds an element to a list.
removeElement(List<Integer> list, int element): Removes an element from a list.
getSize(List<Integer> list): Returns the size of the list.
*/

package com.junit.com;

import java.util.List;

public class ListManager {

	public void addElement(List<Integer> list, int element) {
		list.add(element);
	}

	public void removeElement(List<Integer> list, int element) {
		list.remove(Integer.valueOf(element));
	}

	public int getSize(List<Integer> list) {
		return list.size();
	}
}
