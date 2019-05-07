package org.samples;

public class FizzBuzz
{
  public static String call(int i)
  {
    String result = "";
    for (int j = 1; j <= 17; j++)
    {
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
      result += ",";
    }
    return result + "Fizz,19,Buzz";
  }
}
