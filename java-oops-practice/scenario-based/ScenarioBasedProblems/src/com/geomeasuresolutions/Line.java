package com.geomeasuresolutions;

public class Line {

	private double x1;
	private double y1;
	private double x2;
	private double y2;

	public Line(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// Calculates and returns the length of the line
	public double calculateLength() {
		double dx = x2 - x1;
		double dy = y2 - y1;
		return Math.sqrt((dx * dx) + (dy * dy));
	}

	// Compares this line with another line
	public String compareWith(Line otherLine) {
		double length1 = this.calculateLength();
		double length2 = otherLine.calculateLength();

		if (length1 == length2) {
			return "Both lines are of equal length.";
		} else if (length1 > length2) {
			return "Line 1 is longer than Line 2.";
		} else {
			return "Line 2 is longer than Line 1.";
		}
	}
}
