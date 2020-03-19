package org.samples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.approvaltests.Approvals;
import org.junit.Test;

public class SampleTests
{
  /**
   * 1. spec
   * 2. feedback
   * 3. regression
   * 4. Granularity 
   */
  // yagni
  // you ain't going to need it
  @Test
  public void testNormalJunit()
  {
    String output = "";
    Battleship b = new Battleship(6, 7);
    b.placeShip(Ships.Sub, 1, 1, Direction.East);
    b.placeShip(Ships.Transport, 3, 2, Direction.South);
    b.placeShip(Ships.Battleship, 1, 5, Direction.East);
    //    Start game
    output += b + "\n\n";
    BombResult result = b.bomb(5, 1);
    assertTrue(result.isMiss());
    result = b.bomb(1, 1);
    output += b + "\n\n";
    assertFalse(result.isMiss());
    result = b.bomb(3, 2);
    assertFalse(b.isSunk(Ships.Transport));
    result = b.bomb(3, 3);
    assertTrue(b.isSunk(Ships.Transport));
    output += b + "\n\n";
    Approvals.verify(output);
  }
  @Test
  public void testDoubleBomb() throws Exception
  {
    Battleship b = new Battleship(2, 2);
    b.bomb(1, 0);
    b.bomb(1, 0);
    Approvals.verify(b);
  }
}
