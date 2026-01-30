/*Smart Home Lighting Automation
○ Scenario: A building has smart lights. Different triggers (motion, time of day, voice
commands) need to execute different light patterns.
○ Task: Use lambdas to define these light activation behaviors dynamically without
creating multiple classes.*/

package com.lambdaexpression.smarthomelightingautomation;

public class SmartHomeLighting {
	@FunctionalInterface
	interface LightPattern {
		void activate();
	}

	public static void main(String args[]) {
		// defining light behaviours
		LightPattern motionTrigger = () -> System.out.println("Lights ON at full brightness");
		LightPattern timeOfDayTrigger = () -> System.out.println("Lights set to warm dim mode at evening time");
		LightPattern voiceCommandTrigger = () -> System.out.println("Lights turned OFF");

		runLightPattern(motionTrigger);
		runLightPattern(timeOfDayTrigger);
		runLightPattern(voiceCommandTrigger);
	}

	public static void runLightPattern(LightPattern pattern) {
		// execute selected light behaviour
		pattern.activate();
	}
}
