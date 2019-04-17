package org.sdcrafters.bowling;

import java.util.ArrayList;

public class Bowling {

	ArrayList<Frame> frames = new ArrayList<>();

	public void roll(Integer... rolls) {
		int rollIndex = 0;
		int previousScore = rollIndex;
		int frameNumber = 1;
		{
			Frame frame = new Frame(frameNumber, previousScore);
			frame.addRoll(rolls[rollIndex++]);
			frame.addRoll(rolls[rollIndex++]);
			frames.add(frame);
			previousScore = frame.getTotalScore();
			frameNumber++;
		}
		{

			Frame frame = new Frame(frameNumber, previousScore);
			frame.addRoll(rolls[rollIndex++]);
			frame.addRoll(rolls[rollIndex++]);
			frames.add(frame);
			previousScore = frame.getTotalScore();
			frameNumber++;
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
