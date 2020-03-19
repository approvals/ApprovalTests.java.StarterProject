package org.samples;

public class BombResult implements SingleChar
{
  private boolean hit = false;
  public boolean isMiss()
  {
    return !hit;
  }
  public static BombResult miss()
  {
    return new BombResult();
  }
  @Override
  public String toStringSingleChar()
  {
    return hit ? "X" : "O";
  }
  public static BombResult hit()
  {
    BombResult b = new BombResult();
    b.hit = true;
    return b;
  }
}
