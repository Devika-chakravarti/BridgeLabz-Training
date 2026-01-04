/*Implement a Custom Hash Map
Problem: Design and implement a basic hash map class with operations for insertion, deletion, and retrieval.
Hint: Use an array of linked lists to handle collisions using separate chaining.
*/

package com.hashmapsandhashfunctions;

public class MyHashMap {

	// Node for linked list
	static class Node {
		int key;
		int value;
		Node next;

		Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	// bucket size
	private int SIZE = 16; 
	private Node[] buckets;

	public MyHashMap() {
		buckets = new Node[SIZE];
	}

	// Hash function
	private int getIndex(int key) {
		return key % SIZE;
	}

	// Insert or update value
	public void put(int key, int value) {

		int index = getIndex(key);
		Node head = buckets[index];

		Node curr = head;
		while (curr != null) {
			if (curr.key == key) {
				// update
				curr.value = value; 
				return;
			}
			curr = curr.next;
		}

		// Insert at beginning
		Node newNode = new Node(key, value);
		newNode.next = head;
		buckets[index] = newNode;
	}

	// Retrieve value
	public int get(int key) {

		int index = getIndex(key);
		Node curr = buckets[index];

		while (curr != null) {
			if (curr.key == key) {
				return curr.value;
			}
			curr = curr.next;
		}

		return -1; 
	}

	// Remove key
	public void remove(int key) {

		int index = getIndex(key);
		Node curr = buckets[index];
		Node prev = null;

		while (curr != null) {
			if (curr.key == key) {
				if (prev == null) {
					// remove head
					buckets[index] = curr.next; 
				} else {
					prev.next = curr.next;
				}
				return;
			}
			prev = curr;
			curr = curr.next;
		}
	}

	public static void main(String[] args) {

		MyHashMap map = new MyHashMap();

		map.put(1, 10);
		map.put(17, 20); 
		map.put(2, 30);

		System.out.println(map.get(1)); 
		System.out.println(map.get(17)); 

		map.remove(1);
		System.out.println(map.get(1));
	}
}
