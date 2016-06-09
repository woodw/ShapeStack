package shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by billwood on 6/1/16.
 */
public class RectangleTest {
  private Rectangle underTest;

  @Test(expected=IllegalArgumentException.class)
  public void testConstructorNegativeIllegalArgumentException() {
    underTest = new Rectangle(-1, 7);
    underTest = new Rectangle(5, -5);
  }

  @Test
  public void testAreaValue(){
    underTest = new Rectangle(2, 4);
    assertEquals(8.0,underTest.getArea(),0);
    underTest = new Rectangle(10, 4);
    assertEquals(40.0,underTest.getArea(),0);
  }
}