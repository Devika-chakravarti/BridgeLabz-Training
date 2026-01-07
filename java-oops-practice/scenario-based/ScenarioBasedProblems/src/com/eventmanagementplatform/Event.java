package com.eventmanagementplatform;

public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected int date;
    protected int attendees;

    protected boolean isScheduled;
    protected boolean isCancelled;

    public Event(String eventName, String location, int date, int attendees) {
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.isScheduled = true;
        this.isCancelled = false;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public boolean isScheduled() {
        return isScheduled;
    }

    public void displayEventDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Event Name : " + eventName);
        System.out.println("Location   : " + location);
        System.out.println("Date       : " + date);
        System.out.println("Attendees  : " + attendees);
        System.out.println("----------------------------------------");
    }
}
