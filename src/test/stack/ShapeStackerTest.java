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
  private ShapeStacker underTest;
  private List<Shape> newStack;

  @Before
  public void setUp() throws Exception {
    newStack = new ArrayList<Shape>();
  }

  @Test
  public void testPopConstructorPasses() throws Exception{
    Collections.addAll(newStack, new Square(4), new Triangle(4, 10), new Circle(7), new Rectangle(2, 4));
    underTest = new ShapeStacker(newStack);

    assertEquals(4,underTest.getStack().size());
  }

  @Test
  public void testNullConstructorPasses() throws Exception{
    underTest = new ShapeStacker();

    //Based on the requirements I do not need to pop or push individual stack shapes.
    assertNull(underTest.getStack());
  }

  @Test
  public void testCreateNewStack(){
    underTest = new ShapeStacker();
    assertNull(underTest.getStack());

    Collections.addAll(newStack, new Square(4), new Triangle(4, 10), new Rectangle(2, 4));
    underTest.setStack(newStack);
    assertEquals(3,underTest.getStack().size());
  }

  @Test
  public void testPrintStack(){
    Collections.addAll(newStack, new Square(4), new Circle(4), new Triangle(4, 10));
    underTest = new ShapeStacker(newStack);
    assertEquals("T[S[C]]", underTest.stack());

    newStack.clear();
    Collections.addAll(newStack, new Square(4), new Circle(6), new Rectangle(2, 4));
    assertEquals("C[S[R]]", underTest.stack());

    newStack.clear();
    Collections.addAll(newStack, new Triangle(4, 10), new Circle(20));
    assertEquals("C[T]", underTest.stack());

    newStack.clear();
    Collections.addAll(newStack, new Square(4), new Rectangle(4, 4));
    assertTrue(underTest.stack().equals("R[S]")||underTest.stack().equals("S[R]"));
  }
}