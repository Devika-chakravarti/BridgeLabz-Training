package com.generics.universitycoursemanagementsystem;

import java.util.List;

public class CourseUtil {
	static void displayAllCourses(List<Course<? extends CourseType>> courses) {
		for (int i = 0; i < courses.size(); i++) {
			courses.get(i).displayCourse();
		}
	}
}
