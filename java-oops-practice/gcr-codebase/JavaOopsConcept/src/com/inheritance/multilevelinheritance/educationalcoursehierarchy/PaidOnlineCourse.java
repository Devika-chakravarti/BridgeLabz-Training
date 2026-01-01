package com.inheritance.multilevelinheritance.educationalcoursehierarchy;
class PaidOnlineCourse extends OnlineCourse {

    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform,
                            boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // overriding displayInfo method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Course Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
    }
}
