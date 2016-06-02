package shape;

import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.pow;
import static org.junit.Assert.assertEquals;

/**
 * Created by billwood on 5/31/16.
 */
public class TriangleTest {
  public Triangle mockTriangle;

  @Test(expected=IllegalArgumentException.class)
  public void testConstructorIllegalArgumentException() {
    mockTriangle = new Triangle(10, 4);
  }

  @Test(expected=IllegalArgumentException.class)
  public void testConstructorNegativeIllegalArgumentException() {
    mockTriangle = new Triangle(-4, 9);
  }

  @Test
  public void testAreaValue(){
    mockTriangle = new Triangle(4, 10);
    assertEquals(19.595917942265423,mockTriangle.getArea(),0);
    mockTriangle = new Triangle(6, 9);
    assertEquals(25.45584412271571,mockTriangle.getArea(),0);
  }

}