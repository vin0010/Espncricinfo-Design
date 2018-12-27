package com.codex.ec.common;

import com.codex.ec.player.type.BowlingType;
import com.codex.ec.player.type.PlayerType;
import com.codex.ec.statistics.Statistics;

public class Bowling {
	private Statistics statistics;

	/**
	 * @return the statistics
	 */
	public Statistics getStatistics() {
		return statistics;
	}

	/**
	 * @return the playerType
	 */
	public PlayerType getPlayerType() {
		return playerType;
	}

	/**
	 * @return the bowlingType
	 */
	public BowlingType getBowlingType() {
		return bowlingType;
	}

	private PlayerType playerType;
	private BowlingType bowlingType;
}