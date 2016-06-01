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

  @Before
  public void setUp() throws Exception {
    newShapes = new ArrayList<Shape>();
  }

  @Test
  public void testPopConstructorPasses() throws Exception{
    Collections.addAll(newShapes, new Square(4), new Triangle(4, 10), new Circle(7), new Rectangle(2, 4));
    mockShapeStacker = new ShapeStacker(newShapes);

    assertNotNull(mockShapeStacker);
    assertEquals(4,mockShapeStacker.getStack().size());
  }

  @Test
  public void testNullConstructorPasses() throws Exception{
    mockShapeStacker = new ShapeStacker();
    assertNotNull(mockShapeStacker);
    //Because we don't push or pop we don't need to have a stack
    //Unless a new collection of shapes is given
    assertNull(mockShapeStacker.getStack());
  }

  @Test
  public void testCreateNewStack(){
    mockShapeStacker = new ShapeStacker();
    assertNull(mockShapeStacker.getStack());
    Collections.addAll(newShapes, new Square(4), new Triangle(4, 10), new Rectangle(2, 4));
    mockShapeStacker.setStack(newShapes);
    assertEquals(3,mockShapeStacker.getStack().size());
  }
}