package com.codex.ec.match;

import java.util.Date;

import com.codex.ec.country.Country;
import com.codex.ec.provider.Commentator;
import com.codex.ec.provider.TelecastProvider;
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
	private ScoreCard scoreCard;
	private Venue venue;
	private Umpire firstUmpire;
	private Umpire secondUmpire;
	private Umpire refree;
	private TelecastProvider provider;
	private Commentator commentator;

	public Match(Country country1, Country country2, Date date, Venue venue, Umpire firstUmpire, Umpire secondUmpire,
			Umpire refree, TelecastProvider provider, Commentator commentator, ScoreCard scoreCard) {
		this.country1 = country1;
		this.country2 = country2;
		this.date = date;
		this.venue = venue;
		this.firstUmpire = firstUmpire;
		this.secondUmpire = secondUmpire;
		this.refree = refree;
		this.provider = provider;
		this.commentator = commentator;
		this.scoreCard = scoreCard;
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

	public TelecastProvider getTelecastProvider() {
		return provider;
	}

	public Commentator getCommentator() {
		return commentator;
	}

	/**
	 * @return the scoreCard
	 */
	public ScoreCard getScoreCard() {
		return scoreCard;
	}

	/**
	 * @param scoreCard the scoreCard to set
	 */
	public void setScoreCard(ScoreCard scoreCard) {
		this.scoreCard = scoreCard;
	}
}
