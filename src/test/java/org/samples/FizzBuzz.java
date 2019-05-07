package org.samples;

public class FizzBuzz
{
  public static String call(int i)
  {
    String result = "1";
    for (int j = 2; j <= i; j++)
    {
      result += "," + transformNumber(j);
    }
    return result;
  }
  private static String transformNumber(int j)
  {
    String r;
    if (j == 15)
    {
      r = "FizzBuzz";
    }
    else if (j % 3 == 0)
    {
      r = "Fizz";
    }
    else if (j % 5 == 0)
    {
      r = "Buzz";
    }
    else
    {
      r = "" + j;
    }
    return r;
  }
}
