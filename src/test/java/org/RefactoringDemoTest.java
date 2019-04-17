package org;

import org.junit.Assert;
import org.junit.Test;

public class RefactoringDemoTest {

	@Test
	public void test() {
		for (int i = 0; i < 100; i++) {
			Assert.assertEquals(String.format("i=%s", i), fibonacci_direct(i), fibonacci_recursive(i));
		}
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
		double sqrt_5 = 2.2360679775;
		double Phi = (1.0 + sqrt_5) / 2.0;
		double phi = (1.0 - sqrt_5) / 2.0;

		return (int) Math.round((Math.pow(Phi, n) - Math.pow(phi, n)) / sqrt_5);
	}

}
