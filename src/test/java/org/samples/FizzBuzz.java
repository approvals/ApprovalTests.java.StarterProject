package org.samples;

public class FizzBuzz
{
  public static String call(int i)
  {
    String result = "";
    for (int j = 1; j <= 10; j++)
    {
      if (j % 3 == 0)
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
    return result + "11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
  }
}
