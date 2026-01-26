package com.travellog;

import java.util.*;
import java.util.regex.*;

public class TripAnalyzer {

	// Get all cities visited using REGEX over text (notes)
	public List<String> getCities(List<Trip> trips) {
		List<String> cities = new ArrayList<>();

		// Regex: matches capitalized words (e.g., Delhi, Paris, London)
		String regex = "\\b[A-Z][a-zA-Z]+\\b";
		Pattern pattern = Pattern.compile(regex);

		for (Trip trip : trips) {

			// 1. Add city field directly
			cities.add(trip.getCity());

			// 2. Extract city names from notes using regex
			Matcher matcher = pattern.matcher(trip.getNotes());
			while (matcher.find()) {
				cities.add(matcher.group());
			}
		}
		return cities;
	}

	// Get trips longer than given duration
	public List<Trip> getLongTrips(List<Trip> trips, int minDays) {
		List<Trip> longTrips = new ArrayList<>();
		for (Trip trip : trips) {
			if (trip.getDuration() > minDays) {
				longTrips.add(trip);
			}
		}
		return longTrips;
	}

	// Get unique countries visited
	public Set<String> getUniqueCountries(List<Trip> trips) {
		Set<String> countries = new HashSet<>();
		for (Trip trip : trips) {
			countries.add(trip.getCountry());
		}
		return countries;
	}

	// Get top N most visited cities
	public List<String> getTopCities(List<Trip> trips, int topN) {
		Map<String, Integer> cityCount = new HashMap<>();

		for (Trip trip : trips) {
			String city = trip.getCity();
			cityCount.put(city, cityCount.getOrDefault(city, 0) + 1);
		}

		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(cityCount.entrySet());

		entryList.sort((a, b) -> b.getValue() - a.getValue());

		List<String> topCities = new ArrayList<>();
		for (int i = 0; i < Math.min(topN, entryList.size()); i++) {
			topCities.add(entryList.get(i).getKey() + " (" + entryList.get(i).getValue() + " times)");
		}

		return topCities;
	}
}
