package shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by billwood on 5/31/16.
 */
public class SquareTest {
  public Square mockSquare;

  @Before
  public void setUp() throws Exception {
    mockSquare = new Square(4);
  }

  @Test
  public void constructorPasses(){
    assertNotNull(mockSquare);
  }

  @Test
  public void testAreaValue(){
    assertEquals(16.0,mockSquare.getArea(),0);
  }

}