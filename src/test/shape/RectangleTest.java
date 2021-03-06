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
  public void shouldThrowExceptionForNegativeLength() {
    underTest = new Rectangle(-1, 7);
  }

  @Test(expected=IllegalArgumentException.class)
  public void shouldThrowExceptionForNegativeWidth() {
    underTest = new Rectangle(5, -5);
  }

  @Test(expected=IllegalArgumentException.class)
  public void shouldThrowExceptionForZeroLength() {
    underTest = new Rectangle(0, 3);
  }

  @Test(expected=IllegalArgumentException.class)
  public void shouldThrowExceptionForZeroWidth() {
    underTest = new Rectangle(9, 0);
  }

  @Test
  public void shouldReturnCorrectCalculatedArea(){
    underTest = new Rectangle(2, 4);
    assertEquals(8.0,underTest.getArea(),0);
    underTest = new Rectangle(10, 4);
    assertEquals(40.0,underTest.getArea(),0);
  }

  @Test
  public void shouldBeOfTypeRectangle(){
    underTest = new Rectangle(5, 2);
    assertEquals("Rectangle",underTest.getType());
  }

}