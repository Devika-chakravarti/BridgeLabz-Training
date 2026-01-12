package com.texteditor;

public class Action {

	// Type of action INSERT or DELETE
	protected String type;

	// Text involved in the action
	protected String text;

	// Position at which action happened
	protected int position;

	// Constructor to initialize action
	public Action(String type, String text, int position) {
		this.type = type;
		this.text = text;
		this.position = position;
	}
}
