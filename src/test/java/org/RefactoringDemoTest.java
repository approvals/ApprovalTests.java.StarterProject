package org;

import org.approvaltests.Approvals;
import org.approvaltests.legacycode.Range;
import org.junit.Assert;
import org.junit.Test;

public class RefactoringDemoTest {

	// @Test
	public void test() {
		for (int i = 0; i < 46; i++) {
			Assert.assertEquals(String.format("i=%s", i), fibonacci_direct(i), fibonacci_recursive(i));
		}
	}

	@Test
	public void testName() throws Exception {
		Approvals.verifyAll("fib", Range.get(1, 46), i -> String.format("%s -> %s", i, fibonacci_direct(i)));
	}

	public int fibonacci_recursive(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
	}

	public int fibonacci_direct(int n) {
		if (n == 0) {
			double sqrt_5 = 2.2360679775;
			double Phi = (1.0 + sqrt_5) / 2.0;
			double phi = (1.0 - sqrt_5) / 2.0;

			int fib = (int) Math.round((Math.pow(Phi, 0) - Math.pow(phi, 0)) / sqrt_5);
			return fib;
		} else if (n == 1) {
			double sqrt_5 = 2.2360679775;
			double Phi = (1.0 + sqrt_5) / 2.0;
			double phi = (1.0 - sqrt_5) / 2.0;

			int fib = (int) Math.round((Math.pow(Phi, 1) - Math.pow(phi, 1)) / sqrt_5);
			return fib;
		} else {
			double sqrt_5 = 2.2360679775;
			double Phi = (1.0 + sqrt_5) / 2.0;
			double phi = (1.0 - sqrt_5) / 2.0;

			int fib = (int) Math.round((Math.pow(Phi, n) - Math.pow(phi, n)) / sqrt_5);
			return fib;
		}

	}

}
