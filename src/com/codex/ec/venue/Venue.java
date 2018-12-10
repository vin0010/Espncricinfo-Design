package com.codex.ec.venue;

public class Venue {
	private String venueName;
	private long capacity;

	public Venue(String venueName, long capacity) {
		this.venueName = venueName;
		this.capacity = capacity;
	}

	public String getCommentatorName() {
		return venueName;
	}

	public long getCapacity() {
		return capacity;
	}
}
