package com.linkedlist.doublylinkedlist.librarymanagementsystem;

class LibraryDoublyLinkedList {
	private BookNode head;
	private BookNode tail;

	// Add at beginning
	public void addAtBeginning(String t, String a, String g, int id, String s) {
		BookNode b = new BookNode(t, a, g, id, s);
		if (head == null) {
			head = tail = b;
		} else {
			b.next = head;
			head.prev = b;
			head = b;
		}
		printBook("beginning", b);
	}

	// Add at end
	public void addAtEnd(String t, String a, String g, int id, String s) {
		BookNode b = new BookNode(t, a, g, id, s);
		if (tail == null) {
			head = tail = b;
		} else {
			tail.next = b;
			b.prev = tail;
			tail = b;
		}
		printBook("end", b);
	}

	// Add at position
	public void addAtPosition(int pos, String t, String a, String g, int id, String s) {
		if (pos <= 1) {
			addAtBeginning(t, a, g, id, s);
			return;
		}
		BookNode temp = head;
		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}
		if (temp == null || temp.next == null) {
			addAtEnd(t, a, g, id, s);
			return;
		}
		BookNode b = new BookNode(t, a, g, id, s);
		b.next = temp.next;
		b.prev = temp;
		temp.next.prev = b;
		temp.next = b;

		System.out.println("Book added at position " + pos);
		printBookDetails(b);
	}

	// Remove by Book ID
	public void removeById(int id) {
		BookNode temp = head;
		while (temp != null && temp.bookId != id) {
			temp = temp.next;
		}
		if (temp == null)
			return;

		if (temp == head)
			head = temp.next;
		if (temp == tail)
			tail = temp.prev;
		if (temp.prev != null)
			temp.prev.next = temp.next;
		if (temp.next != null)
			temp.next.prev = temp.prev;

		System.out.println("Book removed");
		System.out.println("Book ID : " + id + "\n");
	}

	// Search by Title or Author
	public void searchByTitleOrAuthor(String title, String author) {
		BookNode temp = head;
		while (temp != null) {
			if ((title != "" && temp.title.equalsIgnoreCase(title))
					|| (author != "" && temp.author.equalsIgnoreCase(author))) {
				System.out.println("Book Found");
				System.out.println("Title : " + temp.title);
				System.out.println("Genre : " + temp.genre);
				System.out.println("Status: " + temp.status + "\n");
			}
			temp = temp.next;
		}
	}

	// Update availability
	public void updateStatus(int id, String status) {
		BookNode temp = head;
		while (temp != null) {
			if (temp.bookId == id) {
				temp.status = status;
				System.out.println("Book ID : " + id);
				System.out.println("Status updated to " + status + "\n");
				return;
			}
			temp = temp.next;
		}
	}

	// Display forward
	public void displayForward() {
		BookNode temp = head;
		while (temp != null) {
			System.out.print(temp.title);
			if (temp.next != null)
				System.out.print(" -> ");
			temp = temp.next;
		}
		System.out.println("\n");
	}

	// Display reverse
	public void displayReverse() {
		BookNode temp = tail;
		while (temp != null) {
			System.out.print(temp.title);
			if (temp.prev != null)
				System.out.print(" -> ");
			temp = temp.prev;
		}
		System.out.println("\n");
	}

	// Count books
	public void countBooks() {
		int count = 0;
		BookNode temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println("Total books in library : " + count + "\n");
	}

	private void printBook(String pos, BookNode b) {
		System.out.println("Book added at " + pos);
		printBookDetails(b);
	}

	private void printBookDetails(BookNode b) {
		System.out.println("Title  : " + b.title);
		System.out.println("Author : " + b.author);
		System.out.println("Genre  : " + b.genre);
		System.out.println("Book ID: " + b.bookId);
		System.out.println("Status : " + b.status + "\n");
	}
}
