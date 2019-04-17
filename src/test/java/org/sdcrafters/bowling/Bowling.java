package org.sdcrafters.bowling;

import java.util.ArrayList;

public class Bowling {

	ArrayList<Frame> frames = new ArrayList<>();

	public void roll(Integer... rolls) {
		int previousScore = 0;
		{
			Frame frame = new Frame(1, previousScore);
			frame.addRoll(rolls[0]);
			frame.addRoll(rolls[1]);
			frames.add(frame);
			previousScore = frame.getTotalScore();
		}
		{
			Frame frame = new Frame(2, previousScore);
			frame.addRoll(rolls[2]);
			frame.addRoll(rolls[3]);
			frames.add(frame);
		}
	}

	@Override
	public String toString() {
		StringBuilder text = new StringBuilder();
		for (Frame frame : frames) {
			text.append(frame + "\n");
		}
		return text.toString();
	}

}
