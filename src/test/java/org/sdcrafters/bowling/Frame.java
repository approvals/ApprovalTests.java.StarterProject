package org.sdcrafters.bowling;

import java.util.ArrayList;

public class Frame {

	protected ArrayList<Integer> rolls = new ArrayList<>();
	private int frameNumber;
	private int previousScore;

	public Frame(int frameNumber, int previousScore) {
		super();
		this.frameNumber = frameNumber;
		this.previousScore = previousScore;
	}

	protected int getTotalScore() {
		return getFrameScore() + previousScore;
	}

	protected int getFrameScore() {
		return rolls.stream().mapToInt(Integer::intValue).sum();
	}

	protected String printFrameScores() {

		int stop = 2;
		if (frameNumber == 10) {
			stop = rolls.size();
		} else if (isStrike()) {
			stop = 1;
		}

		String text = "";
		for (int i = 0; i < stop; i++) {
			text += rolls.get(i) + ",";
		}
		String endingBuffer = (stop == 1) ? " " : "";
		return text.substring(0, text.length() - 1) + endingBuffer;
	}

	@Override
	public String toString() {
		return String.format("%s) %s [%s] = %s", frameNumber, printFrameScores(), getFrameScore(), getTotalScore());
	}

	public void addRoll(Integer roll) {
		rolls.add(roll);
	}

	public boolean isSpare() {
		return 10 == rolls.get(0) + rolls.get(1);
	}

	public boolean isStrike() {
		return 10 == rolls.get(0);
	}
}