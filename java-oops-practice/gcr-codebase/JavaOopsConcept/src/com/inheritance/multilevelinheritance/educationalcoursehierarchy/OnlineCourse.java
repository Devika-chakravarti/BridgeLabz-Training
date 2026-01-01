package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

class OnlineCourse extends Course {

    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // overriding displayInfo method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}
