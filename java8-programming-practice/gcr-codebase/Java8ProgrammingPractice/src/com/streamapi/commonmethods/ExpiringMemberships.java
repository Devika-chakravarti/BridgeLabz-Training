/*Filtering Expiring Memberships
Given a list of gym members with their membership expiry dates, use Stream API to filter
out members whose membership expires within the next 30 days.*/

package com.streamapi.commonmethods;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class GymMember {
	private String name;
	private LocalDate expiryDate;
	public GymMember(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	@Override
	public String toString() {
		return name + " - expires on " + expiryDate;
	}
}

public class ExpiringMemberships {
	private static boolean isExpiringWithin30Days(GymMember member) {
		LocalDate today = LocalDate.now();
		LocalDate next30Days = today.plusDays(30);
		return !member.getExpiryDate().isBefore(today) && member.getExpiryDate().isBefore(next30Days);
	}
	private static List<GymMember> getExpiringMembers(List<GymMember> members) {
		return members.stream().filter(ExpiringMemberships::isExpiringWithin30Days).collect(Collectors.toList());
	}
	private static void displayMembers(List<GymMember> members) {
		members.forEach(System.out::println);
	}
	public static void main(String[] args) {
		List<GymMember> members = Arrays.asList(new GymMember("Devika", LocalDate.now().plusDays(10)),
				new GymMember("Annu", LocalDate.now().plusDays(45)),
				new GymMember("Satya", LocalDate.now().plusDays(25)),
				new GymMember("Siya", LocalDate.now().minusDays(5)));
		List<GymMember> expiringMembers = getExpiringMembers(members);
		displayMembers(expiringMembers);
	}
}
