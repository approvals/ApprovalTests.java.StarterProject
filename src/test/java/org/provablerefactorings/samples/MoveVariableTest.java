package org.provablerefactorings.samples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoveVariableTest
{
  @Test
  public void test()
  {
    int a = 1;
    int b = a;
    a = 3;
    a = 4;
    int c = b;
    assertEquals(1, c);
  }
}
