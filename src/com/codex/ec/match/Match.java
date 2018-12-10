package com.codex.ec.match;

import java.util.Date;

import com.codex.ec.country.Country;
import com.codex.ec.venue.Venue;

public class Match {
	private Country country1;
	private Country country2;
	private Date date;
	private Venue venue;

	public Match(Country country1, Country country2, Date date, Venue venue) {
		this.country1 = country1;
		this.country2 = country2;
		this.date = date;
		this.venue = venue;
	}

	public Country getTeamOne() {
		return country1;
	}

	public Country getTeamTwo() {
		return country2;
	}

	public Date getDate() {
		return date;
	}

	public Venue gteVenue() {
		return venue;
	}
}
