package org.samples;

import java.util.List;

import org.junit.Test;

public class Bullets
{
  public static class Bullet
  {
    public double speed;
  }
  @Test
  public void test()
  {
    List<Bullet> bullets = scanArea();
    for (Bullet b : bullets)
    {
      b.speed = 0;
    }
  }
  private List<Bullet> scanArea()
  {
    // TODO Auto-generated method stub
    return null;
  }
}
