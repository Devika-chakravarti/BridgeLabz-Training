package com.songvault;

public class Media<T> {
	private String title;
	private String creator;
	private String duration;
	private T mediaType; 

	public Media(String title, String creator, String duration, T mediaType) {
		this.title = title;
		this.creator = creator;
		this.duration = duration;
		this.mediaType = mediaType;
	}

	public String getTitle() {
		return title;
	}

	public String getCreator() {
		return creator;
	}

	public String getDuration() {
		return duration;
	}

	public T getMediaType() {
		return mediaType;
	}
}
