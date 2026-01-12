/* Scenario-based: 6
 * 
 * TextEditor – Undo/Redo Functionality (Stack)
Story: Shanaya is building a basic text editor app. Every action (insert, delete, format) is
pushed onto a Stack. An Undo action pops from the stack, and Redo uses another stack to
reapply actions.
Requirements:
● Support insert/delete operations.
● Undo using a stack.
● Maintain redo stack separately.
*/

package com.texteditor;

import java.util.Scanner;

public class UseTextEditor {

	// Object of TextEditor class
	private static TextEditor editor = new TextEditor();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		boolean running = true;

		System.out.println("=================================");
		System.out.println("         TEXT EDITOR");
		System.out.println("=================================");

		while (running) {

			showMenu();
			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {

			case 1:
				insertText();
				break;

			case 2:
				deleteText();
				break;

			case 3:
				editor.undo();
				break;

			case 4:
				editor.redo();
				break;

			case 5:
				editor.showText();
				break;

			case 6:
				running = false;
				System.out.println("Editor closed.");
				break;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	// Method to show the menu
	private static void showMenu() {
		System.out.println("---------------------------------");
		System.out.println("1. Insert Text");
		System.out.println("2. Delete Text");
		System.out.println("3. Undo");
		System.out.println("4. Redo");
		System.out.println("5. Show Text");
		System.out.println("6. Exit");
		System.out.println("---------------------------------");
		System.out.print("Enter your choice: ");
	}

	// Method to pass value to the insertText method in TextEditor
	private static void insertText() {

		System.out.print("Enter text to insert: ");
		String value = input.nextLine();

		System.out.print("Enter position: ");
		int position = input.nextInt();

		if (position < 0 || position > editor.length()) {
			System.out.println("Invalid position.");
			return;
		}

		editor.insertText(value, position);
	}

	// Method to pass value to the deleteText method in TextEditor
	private static void deleteText() {

		System.out.print("Enter position: ");
		int position = input.nextInt();

		System.out.print("Enter length: ");
		int length = input.nextInt();

		if (position < 0 || position + length > editor.length()) {
			System.out.println("Invalid delete range.");
			return;
		}

		editor.deleteText(position, length);
	}
}
