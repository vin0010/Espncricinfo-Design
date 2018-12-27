package com.codex.ec.statistics;

public class TeamStatistics implements Statistics {
	private long totalRuns;
	private int numberOfMatches;
	private int numberOfWins;
	private int numberOfTies;
	private int numberOfDraws;
	private int numberOfNoResults;
	private float winningPercentage;

	public long getTotalRuns() {
		return totalRuns;
	}

	@Override
	public int getNumberOfMacthes() {
		return numberOfMatches;
	}

	@Override
	public int getNumberOfWins() {
		return numberOfWins;
	}

	@Override
	public int getNumberOfTies() {
		return numberOfTies;
	}

	@Override
	public int getNumberOfDraws() {
		return numberOfDraws;
	}

	@Override
	public int getNumberOfNoResults() {
		return numberOfNoResults;
	}

	@Override
	public float getWinningPercentage() {
		return winningPercentage;
	}
}
