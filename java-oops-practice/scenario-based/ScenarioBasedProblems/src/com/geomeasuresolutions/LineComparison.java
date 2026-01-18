package com.geomeasuresolutions;

public class LineComparison {

	private Line line1;
	private Line line2;
	private String result;

	public LineComparison(Line line1, Line line2, String result) {
		this.line1 = line1;
		this.line2 = line2;
		this.result = result;
	}

	public String getResult() {
		return result;
	}
}
