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

    //Based on the requirements I do not need to pop or push individual stack shapes.
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

  @Test
  public void testPrintStack(){
    Collections.addAll(newShapes, new Square(4), new Circle(4), new Triangle(4, 10));
    mockShapeStacker = new ShapeStacker(newShapes);
    assertEquals("T[S[C]]", mockShapeStacker.stack());

    newShapes.clear();
    Collections.addAll(newShapes, new Square(4), new Circle(6), new Rectangle(2, 4));
    assertEquals("C[S[R]]", mockShapeStacker.stack());

    newShapes.clear();
    Collections.addAll(newShapes, new Triangle(4, 10), new Circle(20));
    assertEquals("C[T]", mockShapeStacker.stack());

    newShapes.clear();
    Collections.addAll(newShapes, new Square(4), new Rectangle(4, 4));
    assertTrue(mockShapeStacker.stack().equals("R[S]")||mockShapeStacker.stack().equals("S[R]"));
  }
}