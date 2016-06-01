package shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by billwood on 5/31/16.
 */
public class TriangleTest {
  public Triangle mockTriangle;

  @Before
  public void setUp() throws Exception {
    mockTriangle = new Triangle(4, 10);
  }

  @Test
  public void testAreaValue(){
    assertEquals(19.595917942265423,mockTriangle.getArea(),0);
  }

}