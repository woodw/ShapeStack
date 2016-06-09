package shape;

import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.pow;
import static org.junit.Assert.assertEquals;

/**
 * Created by billwood on 5/31/16.
 */
public class TriangleTest {
  private Triangle underTest;

  @Test(expected=IllegalArgumentException.class)
  public void testConstructorIllegalArgumentException() {
    underTest = new Triangle(10, 4);
  }

  @Test(expected=IllegalArgumentException.class)
  public void testConstructorNegativeIllegalArgumentException() {
    underTest = new Triangle(-4, 9);
  }

  @Test
  public void testAreaValue(){
    underTest = new Triangle(4, 10);
    assertEquals(19.595917942265423,underTest.getArea(),0);
    underTest = new Triangle(6, 9);
    assertEquals(25.45584412271571,underTest.getArea(),0);
  }

}