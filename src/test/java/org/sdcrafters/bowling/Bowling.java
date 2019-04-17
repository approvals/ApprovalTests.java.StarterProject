package org.sdcrafters.bowling;



public class Bowling extends Frame {

	public void roll(Integer... rolls) {
		this.rolls.add(rolls[0]);
		this.rolls.add(rolls[1]);
	}

	@Override
	public String toString() {
		return String.format("%s) %s [%s] = %s", frameNumber, printFrameScores(), getFrameScore(), getTotalScore());
	}

}
