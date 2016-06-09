package shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by billwood on 5/31/16.
 */

public class CircleTest {
  private Circle underTest;

  @Test(expected=IllegalArgumentException.class)
  public void shouldThrowExceptionForNegativeDiameter() {
    underTest = new Circle(-3);
  }

  @Test(expected=IllegalArgumentException.class)
  public void shouldThrowExceptionForZeroDiameter() {
    underTest = new Circle(0);
  }

  @Test
  public void shouldReturnCorrectCalculatedArea(){
    underTest = new Circle(7);
    assertEquals(28.274333882308138,underTest.getArea(),0);
    underTest = new Circle(4);
    assertEquals(12.566370614359172,underTest.getArea(),0);
  }

  @Test
  public void shouldBeOfTypeCircle(){
    underTest = new Circle(2);
    assertEquals("Circle",underTest.getType());
  }

}