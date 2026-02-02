/*Hospital Doctor Availability
○ Scenario: Find doctors available on weekends and sort by specialty.
○ Task: Use streams with filter() and sorted().*/

package com.streamapi.commonmethods;

import java.util.*;
import java.util.stream.Collectors;

class Doctor {
	private String name;
	private String specialty;
	private boolean weekendAvailable;
	public Doctor(String name, String specialty, boolean weekendAvailable) {
		this.name = name;
		this.specialty = specialty;
		this.weekendAvailable = weekendAvailable;
	}
	public String getSpecialty() {
		return specialty;
	}
	public boolean isWeekendAvailable() {
		return weekendAvailable;
	}
	@Override
	public String toString() {
		return name + " - " + specialty;
	}
}

public class HospitalDoctorAvailability {
	private static List<Doctor> filterWeekendDoctors(List<Doctor> doctors) {
		return doctors.stream().filter(Doctor::isWeekendAvailable).collect(Collectors.toList());
	}
	private static List<Doctor> sortBySpecialty(List<Doctor> doctors) {
		return doctors.stream().sorted(Comparator.comparing(Doctor::getSpecialty)).collect(Collectors.toList());
	}
	public static List<Doctor> getAvailableDoctors(List<Doctor> doctors) {
		List<Doctor> weekendDoctors = filterWeekendDoctors(doctors);
		return sortBySpecialty(weekendDoctors);
	}
	public static void main(String[] args) {
		List<Doctor> doctors = Arrays.asList(new Doctor("Dr. Sharma", "Cardiology", true),
				new Doctor("Dr. Soni", "Neurology", false), new Doctor("Dr. Chakravarti", "Orthopedics", true),
				new Doctor("Dr. Verma", "Dermatology", true));
		getAvailableDoctors(doctors).forEach(System.out::println);
	}
}
