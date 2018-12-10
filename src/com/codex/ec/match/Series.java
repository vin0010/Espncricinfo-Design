package com.codex.ec.match;

import com.codex.ec.common.SeriesType;

public class Series {
	private SeriesType seriesType;

	public Series(SeriesType seriesType) {
		this.seriesType = seriesType;
	}

	public SeriesType getSeriesType() {
		return seriesType;
	}
}
