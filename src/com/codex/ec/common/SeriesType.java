package com.codex.ec.common;

public enum SeriesType {
	BILATERAL(2), MULTINATION(10), TRISERIES(3);

	private int value;

	private SeriesType(int value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
}
