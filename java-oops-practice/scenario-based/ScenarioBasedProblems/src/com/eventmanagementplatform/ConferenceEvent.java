package com.eventmanagementplatform;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String eventName, String location, int date, int attendees) {
        super(eventName, location, date, attendees);
    }

    @Override
    public void schedule() {
        System.out.println("Conference Event Scheduled Successfully");
        System.out.println("Event Name : " + eventName);
    }

    @Override
    public void reschedule() {
        System.out.println("Conference Event Rescheduled");
        System.out.println("Event Name : " + eventName);
    }

    @Override
    public void cancel() {
        isCancelled = true;
        isScheduled = false;
        System.out.println("Conference Event Cancelled");
        System.out.println("Event Name : " + eventName);
    }
}
