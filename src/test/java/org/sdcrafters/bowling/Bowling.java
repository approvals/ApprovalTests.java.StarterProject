package org.sdcrafters.bowling;

import java.util.ArrayList;

public class Bowling {

	ArrayList<Frame> frames = new ArrayList<>();

	public void roll(Integer... rolls) {
		Frame frame = new Frame();
		frame.addRoll(rolls[0]);
		frame.addRoll(rolls[1]);
		frames.add(frame);
	}

	@Override
	public String toString() {
		return frames.get(0).toString();
	}

}
