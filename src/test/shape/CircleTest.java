package shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by billwood on 5/31/16.
 */

public class CircleTest {
  public Circle mockCircle;

  @Before
  public void setUp() throws Exception {
    mockCircle = new Circle(7);
  }

  @Test
  public void testAreaValue(){
    assertEquals(28.274333882308138,mockCircle.getArea(),0);
    mockCircle = new Circle(4);
    assertEquals(12.566370614359172,mockCircle.getArea(),0);
  }

}