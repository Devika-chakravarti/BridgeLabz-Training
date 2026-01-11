package com.browserbuddy;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class UseBrowserTab {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Multiple open tabs
		ArrayList<BrowserTab> openTabs = new ArrayList<>();
		Stack<BrowserTab> closedTabs = new Stack<>();

		// Start with one tab
		BrowserTab currentTab = new BrowserTab();
		openTabs.add(currentTab);
		int currentTabIndex = 0;

		System.out.println("==============================================");
		System.out.println("        WELCOME TO OUR BROWSERBUDDY");
		System.out.println("==============================================");

		while (true) {

			System.out.println("\nCurrent Tab: " + (currentTabIndex + 1));
			System.out.println("1. Visit New Page");
			System.out.println("2. Back");
			System.out.println("3. Forward");
			System.out.println("4. Show Current Page");
			System.out.println("5. Open New Tab");
			System.out.println("6. Switch Tab");
			System.out.println("7. Close Current Tab");
			System.out.println("8. Restore Closed Tab");
			System.out.println("9. Exit");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter URL: ");
				currentTab.visitPage(input.nextLine());
				break;

			case 2:
				currentTab.goBack();
				break;

			case 3:
				currentTab.goForward();
				break;

			case 4:
				currentTab.showCurrentPage();
				break;

			case 5:
				BrowserTab newTab = new BrowserTab();
				openTabs.add(newTab);
				currentTabIndex = openTabs.size() - 1;
				currentTab = newTab;
				System.out.println("New tab opened.");
				break;

			case 6:
				System.out.print("Enter tab number to switch (1 to " + openTabs.size() + "): ");
				int index = input.nextInt() - 1;

				if (index >= 0 && index < openTabs.size()) {
					currentTabIndex = index;
					currentTab = openTabs.get(index);
					System.out.println("Switched to Tab " + (index + 1));
				} else {
					System.out.println("Invalid tab number.");
				}
				break;

			case 7:
				if (!openTabs.isEmpty()) {
					closedTabs.push(currentTab);
					openTabs.remove(currentTabIndex);

					if (openTabs.isEmpty()) {
						currentTab = new BrowserTab();
						openTabs.add(currentTab);
						currentTabIndex = 0;
					} else {
						currentTabIndex = 0;
						currentTab = openTabs.get(0);
					}

					System.out.println("Current tab closed.");
				}
				break;

			case 8:
				if (!closedTabs.isEmpty()) {
					BrowserTab restoredTab = closedTabs.pop();
					openTabs.add(restoredTab);
					currentTabIndex = openTabs.size() - 1;
					currentTab = restoredTab;
					System.out.println("Closed tab restored.");
					currentTab.showCurrentPage();
				} else {
					System.out.println("No closed tabs to restore.");
				}
				break;

			case 9:
				System.out.println("==============================================");
				System.out.println("     THANK YOU FOR USING BROWSERBUDDY");
				System.out.println("==============================================");
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
