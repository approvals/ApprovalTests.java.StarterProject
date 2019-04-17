package org.sdcrafters.bowling;

public class Bowling {

	Frame frame = new Frame();

	public void roll(Integer... rolls) {
		frame.addRoll(rolls[0]);
		frame.addRoll(rolls[1]);
	}

	@Override
	public String toString() {
		return frame.toString();
	}

}
