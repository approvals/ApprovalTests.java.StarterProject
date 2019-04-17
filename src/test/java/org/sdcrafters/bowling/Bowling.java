package org.sdcrafters.bowling;

import java.util.ArrayList;

public class Bowling {

	ArrayList<Frame> frames = new ArrayList<>();

	public void roll(Integer... rolls) {
		int previousScore = 0;
		{
			int frameNumber = 1;
			Frame frame = new Frame(frameNumber, previousScore);
			frame.addRoll(rolls[0]);
			frame.addRoll(rolls[frameNumber]);
			frames.add(frame);
			previousScore = frame.getTotalScore();
		}
		{
			int frameNumber = 2;
			Frame frame = new Frame(frameNumber, previousScore);
			frame.addRoll(rolls[frameNumber]);
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
