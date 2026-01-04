package com.linkedlist.doublylinkedlist.undoredofunctionality;

class TextEditorDoublyLinkedList {
	private TextStateNode head;
	private TextStateNode tail;
	private TextStateNode current;
	private int size;
	private final int MAX_HISTORY = 10;

	// Add new text state at end
	public void addState(String text) {
		TextStateNode newNode = new TextStateNode(text);

		// If undo was used, discard redo history
		if (current != tail) {
			TextStateNode temp = current.next;
			while (temp != null) {
				TextStateNode next = temp.next;
				temp.prev = null;
				temp.next = null;
				temp = next;
				size--;
			}
			current.next = null;
			tail = current;
		}

		if (head == null) {
			head = tail = current = newNode;
			size = 1;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			current = newNode;
			size++;
			if (size > MAX_HISTORY) {
				head = head.next;
				head.prev = null;
				size--;
			}
		}

		System.out.println("Text state added");
		System.out.println("Current Text : " + text + "\n");
	}

	// Undo functionality
	public void undo() {
		if (current == null || current.prev == null) {
			System.out.println("No undo available\n");
			return;
		}
		current = current.prev;
		System.out.println("Undo performed");
		System.out.println("Current Text : " + current.text + "\n");
	}

	// Redo functionality
	public void redo() {
		if (current == null || current.next == null) {
			System.out.println("No redo available\n");
			return;
		}
		current = current.next;
		System.out.println("Redo performed");
		System.out.println("Current Text : " + current.text + "\n");
	}

	// Display current text
	public void displayCurrent() {
		if (current == null) {
			System.out.println("No text available\n");
			return;
		}
		System.out.println("Current Text : " + current.text + "\n");
	}

	// Display full history
	public void displayHistory() {
		TextStateNode temp = head;
		int count = 1;
		while (temp != null) {
			System.out.println(count + " : " + temp.text);
			temp = temp.next;
			count++;
		}
		System.out.println();
	}
}
