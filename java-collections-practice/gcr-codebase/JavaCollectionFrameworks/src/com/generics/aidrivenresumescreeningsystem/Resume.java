package com.generics.aidrivenresumescreeningsystem;

public class Resume<T extends JobRole> {
	String candidateName;
	T jobRole;

	Resume(String candidateName, T jobRole) {
		this.candidateName = candidateName;
		this.jobRole = jobRole;
	}

	void displayResume() {
		System.out.println("Candidate: " + candidateName + ", Applied role: " + jobRole.getRoleName());
	}
}
