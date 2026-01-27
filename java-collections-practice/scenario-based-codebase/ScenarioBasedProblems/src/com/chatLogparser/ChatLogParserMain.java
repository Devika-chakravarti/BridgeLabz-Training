/*ChatLogParser – Messaging Pattern Analyzer
Story: A company wants to analyze employee chat logs for productivity. The logs are stored in
plain text files like:
[12:02 PM] John: Hey, the build failed again!
[12:03 PM] Mary: I’ll check the Jenkins pipeline.
Your task is to build ChatLogParser, a tool that:
● Reads chat logs using BufferedReader
● Uses Regex to extract timestamp, user, and message
● Stores results in a Map<String, List<String>> (user → messages)
● Filters out “idle chat” based on keyword list ("lol", "brb", etc.)
● Uses TreeMap to automatically sort users alphabetically
● Supports generic filtering rules using interfaces like MessageFilter<T>*/

package com.chatLogparser;

import java.util.*;
import java.io.*;

public class ChatLogParserMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ChatLogParser parser = new ChatLogParser();

		System.out.print("Enter chat log file path: ");
		String filePath = input.nextLine();

		// Define idle keywords
		final List<String> idleKeywords = new ArrayList<String>();
		idleKeywords.add("lol");
		idleKeywords.add("brb");
		idleKeywords.add("ttyl");
		idleKeywords.add("omg");

		// Generic filter to skip idle chat messages
		MessageFilter<String> idleFilter = new MessageFilter<String>() {
			public boolean filter(String message) {
				for (int i = 0; i < idleKeywords.size(); i++) {
					if (message.toLowerCase().contains(idleKeywords.get(i))) {
						return true;
					}
				}
				return false;
			}
		};

		try {
			parser.parseLog(filePath, idleFilter);
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
			return;
		}

		// Display results
		Map<String, List<String>> userMessages = parser.getUserMessages();
		System.out.println("\nChat log analysis (filtered and sorted):");

		for (Iterator<String> it = userMessages.keySet().iterator(); it.hasNext();) {
			String user = it.next();
			System.out.println("User: " + user);
			List<String> messages = userMessages.get(user);
			for (int i = 0; i < messages.size(); i++) {
				System.out.println("  " + messages.get(i));
			}
		}
	}
}
