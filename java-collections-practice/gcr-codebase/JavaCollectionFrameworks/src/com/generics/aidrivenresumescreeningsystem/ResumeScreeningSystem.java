/* AI-Driven Resume Screening System
Concepts: Generic Classes, Generic Methods, Bounded Type Parameters, Wildcards
Problem Statement:
Develop an AI-Driven Resume Screening System that can process resumes for different job roles like Software Engineer, Data Scientist, and Product Manager while ensuring type safety.
Hints:
Create an abstract class JobRole (SoftwareEngineer, DataScientist, ProductManager).
Implement a generic class Resume<T extends JobRole> to process resumes dynamically.
Use a wildcard method (List<? extends JobRole>) to handle multiple job roles in the screening pipeline.
*/

package com.generics.aidrivenresumescreeningsystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		List<Resume<? extends JobRole>> resumeList = new ArrayList<>();
		System.out.print("Enter number of resumes: ");
		int numberOfResume = input.nextInt();
		input.nextLine();
		for (int i = 0; i < numberOfResume; i++) {

			System.out.println("\n1. Software Engineer\n2. Data Scientist\n3. Product Manager");
			System.out.print("Choose job role: ");
			int choice = input.nextInt();
			input.nextLine();

			System.out.print("Enter candidate name: ");
			String name = input.nextLine();

			if (choice == 1) {
				resumeList.add(ResumeProcessor.processResume(name, new SoftwareEngineer()));
			} else if (choice == 2) {
				resumeList.add(ResumeProcessor.processResume(name, new DataScientist()));
			} else if (choice == 3) {
				resumeList.add(ResumeProcessor.processResume(name, new ProductManager()));
			} else {
				System.out.println("Invalid choice");
			}
		}

		System.out.println("\n--- Screening Pipeline ---");
		ScreeningPipeline.screenAll(resumeList);
	}
}
