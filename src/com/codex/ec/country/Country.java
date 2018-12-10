package com.codex.ec.country;

import java.util.List;

import com.codex.ec.player.Player;

public class Country {
	private String counryName;
	private List<Player> players;
	private String coachName;

	public Country(String counryName, List<Player> players, String coachName) {
		this.counryName = counryName;
		this.players = players;
		this.coachName = coachName;
	}

	public String getCountryName() {
		return counryName;
	}

	public List<Player> getPlayersList() {
		return players;
	}

	public String getCoachName() {
		return coachName;
	}
}
