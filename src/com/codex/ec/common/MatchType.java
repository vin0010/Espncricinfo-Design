package com.codex.ec.common;

public enum MatchType {
	T20(20), ODI(50), TEST(450);

	private int overs;

	private MatchType(int overs) {
		this.overs = overs;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return overs;
	}
}
