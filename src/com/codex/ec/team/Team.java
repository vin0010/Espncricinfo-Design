package com.codex.ec.team;

import java.util.List;

import com.codex.ec.match.Match;
import com.codex.ec.player.Player;
import com.codex.ec.statistics.Statistics;
import com.codex.ec.team.type.TeamType;

public class Team {
	private List<Player> players;
	private TeamType teamType;
	private Statistics statistics;
	private List<Match> matches;

	/**
	 * @return the players
	 */
	public List<Player> getPlayers() {
		return players;
	}

	/**
	 * @return the teamType
	 */
	public TeamType getTeamType() {
		return teamType;
	}

	/**
	 * @return the statistics
	 */
	public Statistics getStatistics() {
		return statistics;
	}

	/**
	 * @return the matches
	 */
	public List<Match> getMatches() {
		return matches;
	}
}
