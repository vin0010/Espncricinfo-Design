package com.codex.ec.provider;

public class Commentator {
	private int age;
	private String commentatorName;

	public Commentator(String commentatorName, int age) {
		this.commentatorName = commentatorName;
		
		this.age = age;
	}

	public String getCommentatorName() {
		return commentatorName;
	}

	public int getCommentatorAge() {
		return age;
	}
}
