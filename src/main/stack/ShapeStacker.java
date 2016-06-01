package stack;

import shape.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by billwood on 6/1/16.
 */
public class ShapeStacker {
  private List<Shape> theStack;

  public ShapeStacker(List<Shape> newShapes) {
    theStack = newShapes;
  }

  public ShapeStacker() {
  }

  public List<Shape> getStack() {
    return theStack;
  }

  public void setStack(List<Shape> newStack) {
    this.theStack = newStack;
  }
}
