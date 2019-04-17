package org.sdcrafters.bowling;

import java.util.ArrayList;

public class Bowling {

	private int previousScore = 0;
	private ArrayList<Integer> rolls = new ArrayList<>();
	private int frameNumber = 1;

	public void roll(Integer... rolls) {
		this.rolls.add(rolls[0]);
		this.rolls.add(rolls[1]);
	}

	@Override
	public String toString() {
		return String.format("%s) %s [%s] = %s", frameNumber, printFrameScores(), getFrameScore(), getTotalScore());
	}

	private int getTotalScore() {
		return getFrameScore() + previousScore;
	}

	private int getFrameScore() {
		return rolls.stream().mapToInt(Integer::intValue).sum();
	}

	private String printFrameScores() {
		return rolls.get(0) + "," + rolls.get(1);
	}

}
