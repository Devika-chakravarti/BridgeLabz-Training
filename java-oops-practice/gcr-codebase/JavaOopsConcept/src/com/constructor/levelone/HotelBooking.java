package com.constructor.levelone;

public class HotelBooking {

    // Attributes
    private String guestName;
    private String roomType;
    private double nights;

    // Default constructor
    HotelBooking() {
        this("Krishna Murti", "Single", 2.0);
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, double nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking booking) {
        this(booking.guestName, booking.roomType, booking.nights);
    }

    // Getters
    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getNights() {
        return nights;
    }

    // Display booking details
    void displayHotelBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Booked for: " + nights + " nights\n");
    }

    public static void main(String[] args) {

        HotelBooking booking1 = new HotelBooking();
        booking1.displayHotelBookingDetails();

        HotelBooking booking2 = new HotelBooking("Ramnarayan", "Double", 7.0);
        booking2.displayHotelBookingDetails();

        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayHotelBookingDetails();
    }
}
