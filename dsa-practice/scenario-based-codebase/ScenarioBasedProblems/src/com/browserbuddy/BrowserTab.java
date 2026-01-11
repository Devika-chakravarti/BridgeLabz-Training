package com.browserbuddy;

public class BrowserTab {

	private HistoryNode head;
	private HistoryNode current;

	// Visit a new page
	public void visitPage(String url) {

		HistoryNode newNode = new HistoryNode(url);

		if (head == null) {
			head = newNode;
			current = newNode;
			return;
		}

		// clear forward history
		current.next = null;

		newNode.prev = current;
		current.next = newNode;
		current = newNode;
	}

	public void goBack() {
		if (current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Moved Back to: " + current.url);
		} else {
			System.out.println("No previous page.");
		}
	}

	public void goForward() {
		if (current != null && current.next != null) {
			current = current.next;
			System.out.println("Moved Forward to: " + current.url);
		} else {
			System.out.println("No forward page.");
		}
	}

	public void showCurrentPage() {
		if (current != null) {
			System.out.println("Current Page: " + current.url);
		} else {
			System.out.println("No page opened yet.");
		}
	}

	public boolean isEmpty() {
		return head == null;
	}
}
