package com.interfaces.functionalinterfaces.stringlengthchecker;

import java.util.function.Function;

class MessageValidator {
	static boolean isLimitExceeded(String message, Function<String, Integer> lengthCalculator, int limit) {
		return lengthCalculator.apply(message) > limit;
	}
}
