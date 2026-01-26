package com.feedbackguru;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FeedbackAnalyzer<T extends FeedbackType> {

	private Pattern ratingPattern = Pattern.compile("(\\d{1,2})/10");

	public Map<String, List<String>> analyzeFeedback(List<String> feedbacks, T type) {

		Map<String, List<String>> categorizedFeedback = new HashMap<>();
		categorizedFeedback.put(FeedbackCategory.POSITIVE, new ArrayList<>());
		categorizedFeedback.put(FeedbackCategory.NEUTRAL, new ArrayList<>());
		categorizedFeedback.put(FeedbackCategory.NEGATIVE, new ArrayList<>());

		for (String feedback : feedbacks) {
			try {
				int rating = extractRating(feedback);
				categorizeFeedback(feedback, rating, categorizedFeedback);
			} catch (Exception e) {
				System.out.println("Skipping invalid feedback line: " + feedback);
			}
		}

		return categorizedFeedback;
	}

	private int extractRating(String feedback) throws Exception {
		Matcher matcher = ratingPattern.matcher(feedback);

		if (matcher.find()) {
			return Integer.parseInt(matcher.group(1));
		}
		throw new Exception("Rating not found");
	}

	private void categorizeFeedback(String feedback, int rating, Map<String, List<String>> map) {

		if (rating >= 8) {
			map.get(FeedbackCategory.POSITIVE).add(feedback);
		} else if (rating >= 5) {
			map.get(FeedbackCategory.NEUTRAL).add(feedback);
		} else {
			map.get(FeedbackCategory.NEGATIVE).add(feedback);
		}
	}
}
