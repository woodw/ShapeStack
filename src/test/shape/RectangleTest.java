package shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by billwood on 6/1/16.
 */
public class RectangleTest {
  public Rectangle mockRectangle;

  @Test(expected=IllegalArgumentException.class)
  public void testConstructorNegativeIllegalArgumentException() {
    mockRectangle = new Rectangle(-1, 7);
    mockRectangle = new Rectangle(5, -5);
  }

  @Test
  public void testAreaValue(){
    mockRectangle = new Rectangle(2, 4);
    assertEquals(8.0,mockRectangle.getArea(),0);
    mockRectangle = new Rectangle(10, 4);
    assertEquals(40.0,mockRectangle.getArea(),0);
  }
}