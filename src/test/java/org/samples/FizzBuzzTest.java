package org.samples;

import static org.junit.Assert.assertEquals;

import org.approvaltests.testcommitrevert.TestCommitRevertTest;
import org.junit.Test;

public class FizzBuzzTest extends TestCommitRevertTest
{
  @Test
  public void test()
  {
    String result = FizzBuzz.call(20);
    String expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
    assertEquals(expected, result);
  }
}
