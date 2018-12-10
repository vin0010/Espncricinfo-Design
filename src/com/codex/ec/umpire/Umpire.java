package com.codex.ec.umpire;

public class Umpire {
	private int age;
	private String umpireName;

	public Umpire(String umpireName, int age) {
		this.umpireName = umpireName;
		this.age = age;
	}

	public String getPlayerName() {
		return umpireName;
	}

	public int getPlayerAge() {
		return age;
	}
}
