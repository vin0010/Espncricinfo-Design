package com.codex.ec.player;

import com.codex.ec.common.Batting;
import com.codex.ec.common.Bowling;
import com.codex.ec.common.Fielding;

public class Player {
	private String name;
	private short age;
	private Batting batting;
	private Bowling bowling;
	private Fielding fielding;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public short getAge() {
		return age;
	}

	/**
	 * @return the batting
	 */
	public Batting getBatting() {
		return batting;
	}

	/**
	 * @return the bowling
	 */
	public Bowling getBowling() {
		return bowling;
	}

	/**
	 * @return the fielding
	 */
	public Fielding getFielding() {
		return fielding;
	}
}
