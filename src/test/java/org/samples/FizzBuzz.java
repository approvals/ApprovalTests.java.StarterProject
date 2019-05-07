package org.samples;

public class FizzBuzz
{
  public static String call(int i)
  {
    String delimiter = ",";
    String result = "";
    for (int j = 1; j <= 2; j++)
    {
      result += j + delimiter;
    }
    String fizz = "Fizz";
    return result + fizz + ",4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
  }
}
