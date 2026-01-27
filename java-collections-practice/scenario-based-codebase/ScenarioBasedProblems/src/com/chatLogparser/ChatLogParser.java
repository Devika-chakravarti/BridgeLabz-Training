package com.chatLogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

	private Map<String, List<String>> userMessages = new TreeMap<String, List<String>>();

	// Read chat log file and parse messages
	public void parseLog(String filePath, MessageFilter<String> filter) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line;

		Pattern pattern = Pattern.compile("\\[(.*?)\\]\\s*(.*?):\\s*(.*)");

		while ((line = br.readLine()) != null) {
			Matcher matcher = pattern.matcher(line);
			if (matcher.matches()) {
				String timestamp = matcher.group(1).trim();
				String user = matcher.group(2).trim();
				String message = matcher.group(3).trim();

				// Apply generic filter
				if (filter != null && filter.filter(message)) {
					continue; 
				}

				// Store messages in TreeMap (users sorted automatically)
				if (!userMessages.containsKey(user)) {
					userMessages.put(user, new ArrayList<String>());
				}
				userMessages.get(user).add("[" + timestamp + "] " + message);
			}
		}

		br.close();
	}

	public Map<String, List<String>> getUserMessages() {
		return userMessages;
	}
}
