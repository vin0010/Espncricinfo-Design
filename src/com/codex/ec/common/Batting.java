package com.codex.ec.common;

import com.codex.ec.player.type.BattingType;
import com.codex.ec.player.type.PlayerType;
import com.codex.ec.statistics.Statistics;

public class Batting {
	private Statistics statistics;
	private PlayerType playerType;
	private BattingType battingType;

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
	 * @return the battingType
	 */
	public BattingType getBattingType() {
		return battingType;
	}

	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	private int order;
}
