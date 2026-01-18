package com.generics.aidrivenresumescreeningsystem;

public class ResumeProcessor {
	static <T extends JobRole> Resume<T> processResume(String name, T role) {
		return new Resume<>(name, role);
	}
}
