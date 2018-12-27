package com.codex.ec.match;

import java.util.List;

import com.codex.ec.common.Batting;
import com.codex.ec.common.Bowling;
import com.codex.ec.common.Fielding;
import com.codex.ec.team.Team;

public class Match {
	private Team teamOne;
	private Team teamTwo;
	private MatchType matchType;
	private List<Batting> teamOneBatting;
	private List<Batting> teamTwoBatting;
	private List<Bowling> teamOneBowling;
	private List<Bowling> teamTwoBowling;
	private List<Fielding> teamOneFielding;
	private List<Fielding> teamTwoFielding;
	private Result result;

	/**
	 * @return the teamOne
	 */
	public Team getTeamOne() {
		return teamOne;
	}

	/**
	 * @return the teamTwo
	 */
	public Team getTeamTwo() {
		return teamTwo;
	}

	/**
	 * @return the matchType
	 */
	public MatchType getMatchType() {
		return matchType;
	}

	/**
	 * @return the teamOneBatting
	 */
	public List<Batting> getTeamOneBatting() {
		return teamOneBatting;
	}

	/**
	 * @return the teamTwoBatting
	 */
	public List<Batting> getTeamTwoBatting() {
		return teamTwoBatting;
	}

	/**
	 * @return the teamOneBowling
	 */
	public List<Bowling> getTeamOneBowling() {
		return teamOneBowling;
	}

	/**
	 * @return the teamTwoBowling
	 */
	public List<Bowling> getTeamTwoBowling() {
		return teamTwoBowling;
	}

	/**
	 * @return the teamOneFielding
	 */
	public List<Fielding> getTeamOneFielding() {
		return teamOneFielding;
	}

	/**
	 * @return the teamTwoFielding
	 */
	public List<Fielding> getTeamTwoFielding() {
		return teamTwoFielding;
	}

	/**
	 * @return the result
	 */
	public Result getResult() {
		return result;
	}
}
