package org.sdcrafters.bowling;

import org.approvaltests.Approvals;
import org.junit.Test;

public class BowlingTest {

	@Test
	public void test() {
		// create a bowl game
		Bowling b = new Bowling();
		// roll 1,1,2,2,3,3,4,4,5,5,3,2,10,3,2,10,10,10,10
		b.roll(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 3, 2, 10, 3, 2, 10, 10, 10, 10);
		// verify score
		Approvals.verify(b.toString());
	}

}
