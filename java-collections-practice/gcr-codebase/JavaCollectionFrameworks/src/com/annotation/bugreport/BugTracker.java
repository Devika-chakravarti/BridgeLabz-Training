package com.annotation.bugreport;

import java.lang.reflect.Method;

public class BugTracker {

	@BugReport(description = "NullPointerException occurs on empty input")
	@BugReport(description = "Performance issue with large data set")
	public void processData() {
		System.out.println("Processing data!");
	}

	public static void main(String[] args) throws Exception {

		BugTracker tracker = new BugTracker();

		// Getting method reference
		Method method = tracker.getClass().getMethod("processData");

		// Fetching all BugReport annotations
		BugReport[] reports = method.getAnnotationsByType(BugReport.class);

		// Printing all bug descriptions
		for (BugReport report : reports) {
			System.out.println("Bug: " + report.description());
		}

		tracker.processData();
	}
}
