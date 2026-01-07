package com.personalizedlearningplatform;

public class Learner extends User implements ICertifiable {

    private String courseType;

    public Learner(String name, String email, int userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificate(double percentage) {
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("CERTIFICATE STATUS");
        System.out.println("----------------------------------------");

        if (percentage >= 60) {
            if (courseType.equalsIgnoreCase("short")) {
                System.out.println("Short course certificate generated for " + name);
            } else {
                System.out.println("Full-time course certificate generated for " + name);
            }
        } else {
            System.out.println("Certificate not generated due to insufficient score");
        }

        System.out.println("----------------------------------------");
    }
}
