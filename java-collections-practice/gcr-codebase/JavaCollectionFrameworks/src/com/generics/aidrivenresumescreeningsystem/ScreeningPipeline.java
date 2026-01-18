package com.generics.aidrivenresumescreeningsystem;

import java.util.List;

public class ScreeningPipeline {
	static void screenAll(List<? extends Resume<? extends JobRole>> resumes) {
		for (int i = 0; i < resumes.size(); i++) {
			resumes.get(i).displayResume();
		}
	}
}
