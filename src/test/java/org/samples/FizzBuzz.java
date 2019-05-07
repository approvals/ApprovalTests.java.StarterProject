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
        result += "FizzBuzz";
      }
      else if (j % 3 == 0)
      {
        result += "Fizz";
      }
      else if (j % 5 == 0)
      {
        result += "Buzz";
      }
      else
      {
        result += j;
      }
    }
    return result;
  }
}
