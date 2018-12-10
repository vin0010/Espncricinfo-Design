package com.codex.ec.player;

public class Player {
	private int age;
	private String playerName;

	public Player(String playerName, int age) {
		this.playerName = playerName;
		this.age = age;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getPlayerAge() {
		return age;
	}
}
