package org.sdcrafters.bowling;

import java.util.ArrayList;

public class Frame {

	private int previousScore = 0;
	protected ArrayList<Integer> rolls = new ArrayList<>();
	protected int frameNumber = 1;

	public Frame() {
		super();
	}

	protected int getTotalScore() {
		return getFrameScore() + previousScore;
	}

	protected int getFrameScore() {
		return rolls.stream().mapToInt(Integer::intValue).sum();
	}

	protected String printFrameScores() {
		return rolls.get(0) + "," + rolls.get(1);
	}

}