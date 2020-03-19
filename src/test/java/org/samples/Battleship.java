package org.samples;

import java.awt.Point;
import java.util.HashMap;

import org.lambda.utils.Grid;

public class Battleship
{
  private int                    width;
  private int                    height;
  private HashMap<Point, Object> board = new HashMap<>();
  public Battleship(int width, int height)
  {
    this.width = width;
    this.height = height;
  }
  @Override
  public String toString()
  {
    return Grid.print(width, height, (x, y) -> printCell(x, y));
  }
  private String printCell(Integer x, Integer y)
  {
    Object piece = getCellAt(x, y);
    return piece == null ? "." : ((SingleChar) piece).toStringSingleChar();
  }
  private Object getCellAt(Integer x, Integer y)
  {
    Object piece = board.get(getKey(x, y));
    return piece;
  }
  private Point getKey(Integer x, Integer y)
  {
    return new Point(x, y);
  }
  public void placeShip(Ships ship, int x, int y, Direction direction)
  {
    for (int i = 0; i < ship.getLength(); i++)
    {
      board.put(getKey(x + direction.moveEast(i), //
          y + direction.moveSouth(i)), ship);
    }
  }
  public BombResult bomb(int x, int y)
  {
    BombResult hit = isShipAt(x, y) ? BombResult.hit() : BombResult.miss();
    board.put(getKey(x, y), hit);
    return hit;
  }
  private boolean isShipAt(int x, int y)
  {
    return getCellAt(x, y) instanceof Ships;
  }
  public boolean isSunk(Ships transport)
  {
    return true;
  }
}
