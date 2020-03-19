package org.samples;

public enum Direction {
                       East, South;
  int moveEast(int i)
  {
    return this == East ? i : 0;
  }
  int moveSouth(int i)
  {
    return this == East ? 0 : i;
  }
}
