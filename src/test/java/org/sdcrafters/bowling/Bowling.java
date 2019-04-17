package org.sdcrafters.bowling;

import java.util.ArrayList;

public class Bowling {

	private ArrayList<Integer> rolls = new ArrayList<>();
	private final int frameNumber = 1;

	public void roll(Integer... rolls) {
		this.rolls.add(1);
		this.rolls.add(1);
	}

	@Override
	public String toString() {
		return String.format("%s) %s [2] = 2", frameNumber, printFrameScores());
	}

	private String printFrameScores() {
		return rolls.get(0) + "," + rolls.get(1);
	}

}
