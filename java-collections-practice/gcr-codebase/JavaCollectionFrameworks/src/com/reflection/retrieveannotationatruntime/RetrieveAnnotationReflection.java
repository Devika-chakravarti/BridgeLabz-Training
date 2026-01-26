/*Retrieve Annotations at Runtime: Create a custom annotation @Author(name="Author Name"). Apply it to a class and use Reflection to retrieve and display the annotation value at runtime.
*/

package com.reflection.retrieveannotationatruntime;

import java.lang.annotation.Annotation;

public class RetrieveAnnotationReflection {

	public static void main(String[] args) {

		// Get Class object for Book
		Class<Book> cls = Book.class;

		// Check if @Author annotation is present
		if (cls.isAnnotationPresent(Author.class)) {

			// Retrieve the annotation
			Author authorAnnotation = cls.getAnnotation(Author.class);

			// Display the annotation value
			System.out.println("Author: " + authorAnnotation.name());
		}
	}
}
