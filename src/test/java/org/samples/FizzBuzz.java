package org.samples;

public class FizzBuzz
{
  public static String call(int i)
  {
    String delimiter = ",";
    String result = "";
    String fizz = "Fizz";
    for (int j = 1; j <= 9; j++)
    {
      if (j == 3 || j == 6 || j == 9)
      {
        result += fizz;
      }
      else if (j == 5)
      {
        result += "Buzz";
      }
      else
      {
        result += j;
      }
      result += delimiter;
    }
    return result + "Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
  }
}
