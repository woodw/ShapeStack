package shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by billwood on 5/31/16.
 */
public class SquareTest {
  private Square underTest;

  @Test(expected=IllegalArgumentException.class)
  public void shouldThrowExceptionForNegativeLength() {
    underTest = new Square(-2);
  }

  @Test(expected=IllegalArgumentException.class)
  public void shouldThrowExceptionForZeroLength() {
    underTest = new Square(0);
  }

  @Test
  public void shouldReturnCorrectCalculatedArea(){
    underTest = new Square(4);
    assertEquals(16.0,underTest.getArea(),0);
    underTest = new Square(10);
    assertEquals(100.0,underTest.getArea(),0);
  }

  @Test
  public void shouldBeOfTypeSquare(){
    underTest = new Square(5);
    assertEquals("Square",underTest.getType());
  }
}