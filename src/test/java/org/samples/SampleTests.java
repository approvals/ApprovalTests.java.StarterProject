package org.samples;
import static org.junit.Assert.assertEquals;

import org.approvaltests.Approvals;
import org.junit.Test;

public class SampleTests {

	@Test
	public void testNormalJunit() {
		assertEquals(5, 5);
	}

	@Test
	public void testWithApprovalTests() {
		Approvals.verify("Hello World");
	}

}
