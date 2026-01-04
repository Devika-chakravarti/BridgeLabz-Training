package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

class TicketCircularList {
	private TicketNode head;
	private TicketNode tail;

	// Add ticket at end
	public void addTicket(String id, String customer, String movie, String seat, String time) {
		TicketNode t = new TicketNode(id, customer, movie, seat, time);
		if (head == null) {
			head = tail = t;
			tail.next = head;
		} else {
			tail.next = t;
			tail = t;
			tail.next = head;
		}
		System.out.println("Ticket added");
		printTicket(t);
	}

	// Remove ticket by ID
	public void removeTicket(String id) {
		if (head == null)
			return;
		TicketNode temp = head;
		TicketNode prev = tail;
		do {
			if (temp.ticketId.equals(id)) {
				if (temp == head) {
					head = head.next;
					tail.next = head;
				} else if (temp == tail) {
					prev.next = head;
					tail = prev;
				} else {
					prev.next = temp.next;
				}
				System.out.println("Ticket removed");
				System.out.println("Ticket ID : " + id + "\n");
				return;
			}
			prev = temp;
			temp = temp.next;
		} while (temp != head);
		System.out.println("Ticket not found\n");
	}

	// Display all tickets
	public void displayAll() {
		if (head == null)
			return;
		TicketNode temp = head;
		do {
			System.out.print(temp.ticketId);
			if (temp.next != head)
				System.out.print(" -> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("\n");
	}

	// Search by customer or movie
	public void searchTicket(String keyword) {
		if (head == null)
			return;
		TicketNode temp = head;
		boolean found = false;
		System.out.println("Searching for Customer/Movie: " + keyword);
		do {
			if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
				System.out.println("Ticket Found:");
				printTicket(temp);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);
		if (!found)
			System.out.println("No tickets found\n");
	}

	// Count total tickets
	public void totalTickets() {
		if (head == null) {
			System.out.println("Total Tickets Booked: 0\n");
			return;
		}
		int count = 0;
		TicketNode temp = head;
		do {
			count++;
			temp = temp.next;
		} while (temp != head);
		System.out.println("Total Tickets Booked: " + count + "\n");
	}

	private void printTicket(TicketNode t) {
		System.out.println("ID        : " + t.ticketId);
		System.out.println("Customer  : " + t.customerName);
		System.out.println("Movie     : " + t.movieName);
		System.out.println("Seat No.  : " + t.seatNo);
		System.out.println("Booking   : " + t.bookingTime + "\n");
	}
}
