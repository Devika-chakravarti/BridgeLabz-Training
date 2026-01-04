package com.linkedlist.doublylinkedlist.moviemanagementsystem;

class MovieDoublyLinkedList {
	private MovieNode head;
	private MovieNode tail;

	// Add at beginning
	public void addAtBeginning(String t, String d, int y, double r) {
		MovieNode m = new MovieNode(t, d, y, r);
		if (head == null) {
			head = tail = m;
		} else {
			m.next = head;
			head.prev = m;
			head = m;
		}
		printAdd("beginning", m);
	}

	// Add at end
	public void addAtEnd(String t, String d, int y, double r) {
		MovieNode m = new MovieNode(t, d, y, r);
		if (tail == null) {
			head = tail = m;
		} else {
			tail.next = m;
			m.prev = tail;
			tail = m;
		}
		printAdd("end", m);
	}

	// Add at position
	public void addAtPosition(int pos, String t, String d, int y, double r) {
		if (pos <= 1) {
			addAtBeginning(t, d, y, r);
			return;
		}
		MovieNode temp = head;
		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}
		if (temp == null || temp.next == null) {
			addAtEnd(t, d, y, r);
			return;
		}
		MovieNode m = new MovieNode(t, d, y, r);
		m.next = temp.next;
		m.prev = temp;
		temp.next.prev = m;
		temp.next = m;

		System.out.println("Movie added at position " + pos);
		printMovie(m);
	}

	// Remove by title
	public void removeByTitle(String title) {
		MovieNode temp = head;
		while (temp != null && !temp.title.equalsIgnoreCase(title)) {
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

		System.out.println("Movie removed");
		System.out.println("Title : " + title + "\n");
	}

	// Search by director
	public void searchByDirector(String director) {
		MovieNode temp = head;
		while (temp != null) {
			if (temp.director.equalsIgnoreCase(director)) {
				System.out.println("Movie Found");
				System.out.println("Title  : " + temp.title);
				System.out.println("Rating: " + temp.rating + "\n");
			}
			temp = temp.next;
		}
	}

	// Update rating
	public void updateRating(String title, double newRating) {
		MovieNode temp = head;
		while (temp != null) {
			if (temp.title.equalsIgnoreCase(title)) {
				temp.rating = newRating;
				System.out.println("Movie Title : " + title);
				System.out.println("Rating updated to " + newRating + "\n");
				return;
			}
			temp = temp.next;
		}
	}

	// Display forward
	public void displayForward() {
		MovieNode temp = head;
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
		MovieNode temp = tail;
		while (temp != null) {
			System.out.print(temp.title);
			if (temp.prev != null)
				System.out.print(" -> ");
			temp = temp.prev;
		}
		System.out.println("\n");
	}

	private void printAdd(String pos, MovieNode m) {
		System.out.println("Movie added at " + pos);
		printMovie(m);
	}

	private void printMovie(MovieNode m) {
		System.out.println("Title    : " + m.title);
		System.out.println("Director : " + m.director);
		System.out.println("Year     : " + m.year);
		System.out.println("Rating   : " + m.rating + "\n");
	}
}
