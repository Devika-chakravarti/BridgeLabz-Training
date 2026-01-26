package com.annotation.deprecated;

public class LegacyAPI {

	// This method is no longer recommended for use
	@Deprecated
	public void oldFeature() {
		System.out.println("Old feature is executed");
	}

	// New and improved method
	public void newFeature() {
		System.out.println("New feature is executed");
	}

	public static void main(String[] args) {

		LegacyAPI api = new LegacyAPI();

		// Calling deprecated method (will show compiler warning)
		api.oldFeature();

		api.newFeature();
	}
}
