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
  public void shouldConstructStackWithShapes() throws Exception{
    Collections.addAll(newStack, new Square(4), new Triangle(4, 10), new Circle(7), new Rectangle(2, 4));
    underTest = new ShapeStacker(newStack);

    assertEquals(4,underTest.getStack().size());
  }

  @Test
  public void shouldConstructEmptyStack() throws Exception{
    underTest = new ShapeStacker();

    //Based on the requirements I do not need to pop or push individual stack shapes.
    assertNull(underTest.getStack());
  }

  @Test
  public void shouldMaintainLocalStack(){
    Collections.addAll(newStack, new Square(4), new Triangle(4, 10), new Circle(7), new Rectangle(2, 4));
    underTest = new ShapeStacker(newStack);
    Collections.addAll(newStack, new Circle(2));

    assertEquals(4,underTest.getStack().size());
  }

  @Test
  public void shouldAllowNewStack(){
    underTest = new ShapeStacker();

    Collections.addAll(newStack, new Square(4), new Triangle(4, 10), new Rectangle(2, 4));
    underTest.setStack(newStack);
    assertEquals(3,underTest.getStack().size());
  }

  @Test
  public void shouldNotStackEmptyStack(){
    underTest = new ShapeStacker();
    assertEquals("No Shapes to Stack", underTest.stack());
  }

  @Test
  public void shouldDisplayNoShapesOnEmptyStack(){
    underTest = new ShapeStacker();
    assertEquals("No Shapes", underTest.toString());
  }

  @Test
  public void shouldCorrectlySortTSC(){
    Collections.addAll(newStack, new Square(4), new Circle(4), new Triangle(4, 10));
    underTest = new ShapeStacker(newStack);
    assertEquals("T[S[C]]", underTest.stack());
  }

  @Test
  public void shouldCorrectlySortCSR(){
    Collections.addAll(newStack, new Square(4), new Circle(6), new Rectangle(2, 4));
    underTest = new ShapeStacker(newStack);
    assertEquals("C[S[R]]", underTest.stack());
  }

  @Test
  public void shouldCorrectlySortCT(){
    Collections.addAll(newStack, new Triangle(4, 10), new Circle(20));
    underTest = new ShapeStacker(newStack);
    assertEquals("C[T]", underTest.stack());
  }

  @Test
  public void shouldAllowFirstInSortForEqualArea(){
    Collections.addAll(newStack, new Square(4), new Rectangle(4, 4));
    underTest = new ShapeStacker(newStack);
    assertTrue(underTest.stack().equals("R[S]")||underTest.stack().equals("S[R]"));
  }
}