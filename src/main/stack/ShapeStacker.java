package stack;

import shape.Shape;
import shape.Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    theStack = newStack;
  }

  public String stack() {
    Collections.sort(theStack);
    return this.toString();
  }

  public String toString(){
    String stackString = "";
    for(Shape item : theStack){
      if(stackString.length()>0){
        stackString = stackString.replace("[]", String.format("[%s]", item.toString()));
      }
      else{
        stackString = item.toString();
      }
    }
    stackString = stackString.replace("[]","");
    return stackString;
  }
}