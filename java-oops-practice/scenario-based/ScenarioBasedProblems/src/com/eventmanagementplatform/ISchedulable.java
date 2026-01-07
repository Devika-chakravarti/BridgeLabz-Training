package com.eventmanagementplatform;

public interface ISchedulable {
    void schedule();
    void reschedule();
    void cancel();
}
