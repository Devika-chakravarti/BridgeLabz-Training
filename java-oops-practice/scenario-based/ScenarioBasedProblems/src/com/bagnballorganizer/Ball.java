package com.bagnballorganizer;

public class Ball implements Storable {
	private String ballId;
	private String color;
	private String size;

	public Ball(String ballId, String color, String size) {
		this.ballId = ballId;
		this.color = color;
		this.size = size;
	}

	@Override
	public String getId() {
		return ballId;
	}

	@Override
	public String getColor() {
		return color;
	}

	public String getSize() {
		return size;
	}

}
