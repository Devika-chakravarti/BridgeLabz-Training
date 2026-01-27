package com.chatLogparser;

public interface MessageFilter<T> {
	boolean filter(T message);
}
