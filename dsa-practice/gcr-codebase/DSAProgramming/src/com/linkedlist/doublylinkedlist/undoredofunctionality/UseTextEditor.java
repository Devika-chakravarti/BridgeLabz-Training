package com.linkedlist.doublylinkedlist.undoredofunctionality;

public class UseTextEditor {
	public static void main(String[] args) {

		TextEditorDoublyLinkedList editor = new TextEditorDoublyLinkedList();

		System.out.println("========================================");
		System.out.println("      TEXT EDITOR UNDO/REDO SYSTEM");
		System.out.println("========================================\n");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 1: ADD TEXT STATES");
		System.out.println("----------------------------------------");
		editor.addState("Devika");
		editor.addState("Devika Chakravarti");
		editor.addState("Devika Chakravarti is smart");
		editor.addState("Devika Chakravarti is smart and intelligent");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 2: UNDO ACTIONS");
		System.out.println("----------------------------------------");
		editor.undo();
		editor.undo();

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 3: REDO ACTION");
		System.out.println("----------------------------------------");
		editor.redo();

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 4: ADD NEW STATE AFTER UNDO");
		System.out.println("----------------------------------------");
		editor.addState("Devika Chakravarti Added a text");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 5: DISPLAY CURRENT STATE");
		System.out.println("----------------------------------------");
		editor.displayCurrent();

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 6: DISPLAY FULL HISTORY");
		System.out.println("----------------------------------------");
		editor.displayHistory();
	}
}
