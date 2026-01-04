package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

class TicketNode {
	String ticketId;
	String customerName;
	String movieName;
	String seatNo;
	String bookingTime;
	TicketNode next;

	TicketNode(String id, String customer, String movie, String seat, String time) {
		ticketId = id;
		customerName = customer;
		movieName = movie;
		seatNo = seat;
		bookingTime = time;
		next = null;
	}
}
