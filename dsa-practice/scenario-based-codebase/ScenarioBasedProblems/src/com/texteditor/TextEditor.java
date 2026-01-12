package com.texteditor;

public class TextEditor {

	// Stores the actual text
	private StringBuilder text = new StringBuilder();

	// Undo and Redo stacks
	private CustomStack undoStack = new CustomStack();
	private CustomStack redoStack = new CustomStack();

	// Insert text
	public void insertText(String value, int position) {

		// Insert into text
		text.insert(position, value);

		// Save action to undo stack
		undoStack.push(new Action("INSERT", value, position));

		// Clear redo stack
		redoStack.clear();
	}

	// Delete text
	public void deleteText(int position, int length) {

		// Store deleted text
		String deletedText = text.substring(position, position + length);

		// Delete from text
		text.delete(position, position + length);

		// Save action to undo stack
		undoStack.push(new Action("DELETE", deletedText, position));

		// Clear redo stack
		redoStack.clear();
	}

	// Undo last action
	public void undo() {

		if (undoStack.isEmpty()) {
			System.out.println("Nothing to undo.");
			return;
		}

		Action action = undoStack.pop();

		if (action.type.equals("INSERT")) {
			// Reverse insert by deleting
			text.delete(action.position, action.position + action.text.length());
		} else if (action.type.equals("DELETE")) {
			// Reverse delete by inserting
			text.insert(action.position, action.text);
		}

		// Push action to redo stack
		redoStack.push(action);
	}

	// Redo last undone action
	public void redo() {

		if (redoStack.isEmpty()) {
			System.out.println("Nothing to redo.");
			return;
		}

		Action action = redoStack.pop();

		if (action.type.equals("INSERT")) {
			text.insert(action.position, action.text);
		} else if (action.type.equals("DELETE")) {
			text.delete(action.position, action.position + action.text.length());
		}

		// Push back to undo stack
		undoStack.push(action);
	}

	// Display current text
	public void showText() {
		System.out.println("Current Text: " + text.toString());
	}

	public int length() {
		return text.length();
	}
}
