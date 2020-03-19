package org.samples;

public enum Ships implements SingleChar {
                                         Sub(3), Battleship(4), Transport(2), HitSection(1);
  int length;
  Ships(int lenght)
  {
    length = lenght;
  }
  int getLength()
  {
    return length;
  }
  public String toStringSingleChar()
  {
    return toString().substring(0, 1);
  }
}
