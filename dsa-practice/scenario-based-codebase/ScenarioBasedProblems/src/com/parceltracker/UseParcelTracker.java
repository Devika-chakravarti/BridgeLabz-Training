/* Scenario-based: 10
 * 
 * ParcelTracker – Delivery Chain Management (Singly Linked List)
Story: A courier company tracks parcels through stages like Packed → Shipped → In Transit →
Delivered. Each stage is a node in a Singly Linked List.
Requirements:
● Forward tracking through stages.
● Add custom intermediate checkpoints.
● Handle lost/missing parcels (null pointers).
*/

package com.parceltracker;

import java.util.Scanner;

public class UseParcelTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();

        System.out.println("====================================================");
        System.out.println("   WELCOME TO OUR PARCEL TRACKER SYSTEM");
        System.out.println("====================================================");
        
        while (true) {

            System.out.println("\nParcel Tracker Menu:");
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Intermediate Checkpoint");
            System.out.println("3. Simulate Lost Parcel");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

            case 1:
                tracker.trackParcel();
                break;

            case 2:
                System.out.print("Enter existing stage name: ");
                String existingStage = input.nextLine();

                System.out.print("Enter new checkpoint name: ");
                String checkpoint = input.nextLine();

                tracker.addCheckpointAfter(existingStage, checkpoint);
                break;

            case 3:
                System.out.print("Enter stage after which parcel is lost: ");
                String lossStage = input.nextLine();

                tracker.simulateParcelLoss(lossStage);
                break;

            case 4:
            	System.out.println("\n====================================================");
                System.out.println("   THANK YOU FOR USING OUR PARCEL TRACKER SYSTEM");
                System.out.println("====================================================");
                return;

            default:
                System.out.println("Invalid choice");
            }
        }
    }
}
