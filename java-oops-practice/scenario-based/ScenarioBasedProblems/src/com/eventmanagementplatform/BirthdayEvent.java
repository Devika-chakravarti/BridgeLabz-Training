package com.eventmanagementplatform;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String eventName, String location, int date, int attendees) {
        super(eventName, location, date, attendees);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event Scheduled Successfully");
        System.out.println("Event Name : " + eventName);
    }

    @Override
    public void reschedule() {
        System.out.println("Birthday Event Rescheduled");
        System.out.println("Event Name : " + eventName);
    }

    @Override
    public void cancel() {
        isCancelled = true;
        isScheduled = false;
        System.out.println("Birthday Event Cancelled");
        System.out.println("Event Name : " + eventName);
    }
}
