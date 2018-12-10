package com.codex.ec.match;

import java.util.Date;

import com.codex.ec.country.Country;
import com.codex.ec.umpire.Umpire;
import com.codex.ec.venue.Venue;

/**
 * @author Vinoth.Gopu
 *
 */
/**
 * @author Vinoth.Gopu
 *
 */
public class Match {
	private Country country1;
	private Country country2;
	private Date date;
	private Venue venue;
	private Umpire firstUmpire;
	private Umpire secondUmpire;
	private Umpire refree;

	public Match(Country country1, Country country2, Date date, Venue venue, Umpire firstUmpire, Umpire secondUmpire,
			Umpire refree) {
		this.country1 = country1;
		this.country2 = country2;
		this.date = date;
		this.venue = venue;
		this.firstUmpire = firstUmpire;
		this.secondUmpire = secondUmpire;
		this.refree = refree;
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

	/**
	 * @return
	 */
	public Venue gteVenue() {
		return venue;
	}

	/**
	 * @return the firstUmpire
	 */
	public Umpire getFirstUmpire() {
		return firstUmpire;
	}

	/**
	 * @return the secondUmpire
	 */
	public Umpire getSecondUmpire() {
		return secondUmpire;
	}

	/**
	 * @return the refree
	 */
	public Umpire getRefree() {
		return refree;
	}

}
