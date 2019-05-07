package org.samples;

public class FizzBuzz
{
  public static String call(int i)
  {
    String result = "1";
    for (int j = 2; j <= i; j++)
    {
      result += ",";
      String r;
      if (j == 15)
      {
        r = "FizzBuzz";
        result += r;
      }
      else if (j % 3 == 0)
      {
        r = "Fizz";
        result += r;
      }
      else if (j % 5 == 0)
      {
        r = "Buzz";
        result += r;
      }
      else
      {
        result += j;
      }
    }
    return result;
  }
}
