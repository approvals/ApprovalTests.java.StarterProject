package org.sdcrafters.bowling;

import java.util.ArrayList;

public class Bowling {

	private ArrayList<Integer> rolls = new ArrayList<>();
	private final int frameNumber = 1;

	public void roll(Integer... rolls) {
		this.rolls.add(rolls[0]);
		this.rolls.add(rolls[1]);
	}

	@Override
	public String toString() {
		return String.format("%s) %s [%s] = 2", frameNumber, printFrameScores(), getFrameScore());
	}

	private int getFrameScore() {
		return rolls.stream().mapToInt(Integer::intValue).sum();
	}

	private String printFrameScores() {
		return rolls.get(0) + "," + rolls.get(1);
	}

}
