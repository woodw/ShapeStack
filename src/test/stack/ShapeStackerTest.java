package stack;

import shape.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by billwood on 6/1/16.
 */
public class ShapeStackerTest {
  public ShapeStacker mockShapeStacker;
  public List<Shape> newShapes;

  @Test
  public void testPopConstructorPasses() throws Exception{
    newShapes = new ArrayList<Shape>();
    Collections.addAll(newShapes, new Square(4), new Triangle(4, 10), new Circle(7), new Rectangle(2, 4));
    mockShapeStacker = new ShapeStacker(newShapes);

    assertNotNull(mockShapeStacker);
    assertEquals(4,mockShapeStacker.getStack().size());
  }
}