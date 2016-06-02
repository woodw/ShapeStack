package shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by billwood on 5/31/16.
 */
public class SquareTest {
  public Square mockSquare;

  @Test(expected=IllegalArgumentException.class)
  public void testConstructorNegativeIllegalArgumentException() {
    mockSquare = new Square(-2);
  }

  @Test
  public void testAreaValue(){
    mockSquare = new Square(4);
    assertEquals(16.0,mockSquare.getArea(),0);
    mockSquare = new Square(10);
    assertEquals(100.0,mockSquare.getArea(),0);
  }

}