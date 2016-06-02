package shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by billwood on 6/1/16.
 */
public class RectangleTest {
  public Rectangle mockRectangle;

  @Before
  public void setUp() throws Exception {
    mockRectangle = new Rectangle(2, 4);
  }

  @Test
  public void testAreaValue(){
    assertEquals(8.0,mockRectangle.getArea(),0);
    mockRectangle = new Rectangle(10, 4);
    assertEquals(40.0,mockRectangle.getArea(),0);
  }
}