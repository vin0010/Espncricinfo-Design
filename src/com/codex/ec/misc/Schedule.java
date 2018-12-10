package com.codex.ec.misc;

import java.util.List;

import com.codex.ec.match.Match;

public class Schedule {
	List<Match> matches;

	public Schedule(List<Match> matches) {
		this.matches = matches;
	}

	public void addMatch(Match match) {
		matches.add(match);
	}

	public List<Match> getSchedule() {
		return matches;
	}
}
