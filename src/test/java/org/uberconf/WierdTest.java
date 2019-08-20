package org.uberconf;

import org.junit.Test;

public class WierdTest
{
  @Test
  public void test()
  {
    // create battleship board 11x9
    Battleship b = new Battleship(11, 9);
    // place a vertical sub at 0,1
    b.placeShip(Ship.Submarine, Direction.Vertical, new Place(0, 1));
  }
}
