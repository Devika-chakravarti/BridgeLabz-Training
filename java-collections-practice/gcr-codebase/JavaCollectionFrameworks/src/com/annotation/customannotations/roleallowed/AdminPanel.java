package com.annotation.customannotations.roleallowed;

import java.lang.reflect.Method;

public class AdminPanel {

	@RoleAllowed("ADMIN")
	public void deleteUser() {
		System.out.println("User deleted successfully!");
	}

	@RoleAllowed("ADMIN")
	public void viewSensitiveData() {
		System.out.println("Sensitive data viewed!");
	}

	public void viewPublicData() {
		System.out.println("Public data viewed!");
	}

	// Method to simulate access control
	public static void invokeMethod(User user, String methodName) throws Exception {
		AdminPanel panel = new AdminPanel();

		Method method = panel.getClass().getMethod(methodName);

		// Check for RoleAllowed annotation
		if (method.isAnnotationPresent(RoleAllowed.class)) {
			RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

			if (!roleAllowed.value().equals(user.getRole())) {
				System.out.println(
						"Access Denied! User " + user.getUsername() + " does not have role: " + roleAllowed.value());
				return;
			}
		}

		method.invoke(panel);
	}

	public static void main(String[] args) throws Exception {
		User admin = new User("Devika", "ADMIN");
		User guest = new User("Annu", "GUEST");

		// Admin tries to delete user
		invokeMethod(admin, "deleteUser");

		// Guest tries to delete user
		invokeMethod(guest, "deleteUser");

		// Both can view public data
		invokeMethod(admin, "viewPublicData");
		invokeMethod(guest, "viewPublicData");
	}
}
