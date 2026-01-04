package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class UseOnlineTicketReservationSystem {
	public static void main(String[] args) {

		TicketCircularList tickets = new TicketCircularList();

		System.out.println("========================================");
		System.out.println("       ONLINE TICKET RESERVATION");
		System.out.println("========================================\n");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 1: ADD TICKET RESERVATIONS");
		System.out.println("----------------------------------------");
		tickets.addTicket("T101", "Alice", "Avatar", "A1", "2026-01-04 10:00");
		tickets.addTicket("T102", "Bob", "Inception", "B2", "2026-01-04 10:30");
		tickets.addTicket("T103", "Charlie", "Avatar", "A2", "2026-01-04 11:00");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 2: DISPLAY ALL TICKETS");
		System.out.println("----------------------------------------");
		tickets.displayAll();

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 3: SEARCH TICKET BY CUSTOMER");
		System.out.println("----------------------------------------");
		tickets.searchTicket("Alice");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 4: REMOVE TICKET");
		System.out.println("----------------------------------------");
		tickets.removeTicket("T102");

		System.out.println("----------------------------------------");
		System.out.println("UPDATED TICKET LIST");
		System.out.println("----------------------------------------");
		tickets.displayAll();

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 5: TOTAL BOOKED TICKETS");
		System.out.println("----------------------------------------");
		tickets.totalTickets();

	}
}
