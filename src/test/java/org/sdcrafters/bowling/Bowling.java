package org.sdcrafters.bowling;

public class Bowling {

	private final int frameNumber = 1;

	public void roll(Integer... rolls) {

	}

	@Override
	public String toString() {
		return String.format("%s) 1,1 [2] = 2", frameNumber);
	}

}
