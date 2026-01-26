/*Access and Modify Static Fields: Create a Configuration class with a private static field API_KEY. Use Reflection to modify its value and print it.
*/

package com.reflection.accessnmodifystaticfields;

import java.lang.reflect.Field;

public class AccessModifyStaticFieldReflection {

	public static void main(String[] args) throws Exception {

		// Get Class object
		Class<Configuration> cls = Configuration.class;

		// Access private static field
		Field apiKeyField = cls.getDeclaredField("API_KEY");
		apiKeyField.setAccessible(true);

		// Retrieve and print original value
		String originalKey = (String) apiKeyField.get(null);
		System.out.println("Original API_KEY: " + originalKey);

		// Modify the static field value
		apiKeyField.set(null, "UPDATED_KEY");

		// Retrieve and print modified value
		String modifiedKey = (String) apiKeyField.get(null);
		System.out.println("Modified API_KEY: " + modifiedKey);
	}
}
