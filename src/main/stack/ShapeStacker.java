package stack;

import shape.Shape;

import java.util.*;

/**
 * Created by billwood on 6/1/16.
 * ShapeStacker will take a list of Shape Objects, sort them on command, and print them back out.
 * @input List of shapes
 *
 */
public class ShapeStacker {
  private List<Shape> theStack;
  private int[] shapeCount;
  private HashMap initStackOrder;

  public ShapeStacker(List<Shape> newShapes) {
    setStack(newShapes);
  }

  public ShapeStacker() {
  }

  public List<Shape> getStack() {
    return theStack;
  }

  /*
  * When a new stack of shapes is delivered. Each shape is counted by Type,
  * then placed within an Arraylist to be sorted as well as a hashmap(id,initialPosition).
  * I decided to implement Shape.getType instead of instanceOf because its cleaner
  * ... an object would know its type. and If I did Instance Of I would have to place rectangle
  * ... before square because rectangle is the square super.
  * */
  public void setStack(List<Shape> newStack) {
    theStack = new ArrayList<Shape>();
    shapeCount = new int[4];
    initStackOrder = new HashMap();

    for(Shape item : newStack){
      switch(item.getType()) {
        case "Circle":
          addShapeToHash(item.id, 0, "C");
          break;
        case "Rectangle":
          addShapeToHash(item.id, 1, "R");
          break;
        case "Square":
          addShapeToHash(item.id, 2, "S");
          break;
        case "Triangle":
          addShapeToHash(item.id, 3, "T");
          break;
      }
      theStack.add(item);
    }
  }

  //Adds the item to the hashmap and keeps record of how many types of shapes we have.
  private void addShapeToHash(int id, int i, String type){
    shapeCount[i]++;
    initStackOrder.put(id,String.format("%s%d[]", type, shapeCount[i]));
  }

  public String stack() {
    //Check for stack
    if(theStack!=null){
      Collections.sort(theStack);
      return this.toString();
    }
      return "No Shapes to Stack";
  }

  @Override
  public String toString(){
    //Check for stack
    if(theStack!=null) {
      String stackString = "";
      String itemString = "";

      //Get the correct String Representation for the Item
      for (Shape item : theStack) {
        switch(item.getType()){
          case "Circle":
            itemString = itemStringRepresentaiton(0, item);
            break;
          case "Rectangle":
            itemString = itemStringRepresentaiton(1, item);
            break;
          case "Square":
            itemString = itemStringRepresentaiton(2, item);
            break;
          case "Triangle":
            itemString = itemStringRepresentaiton(3, item);
            break;
        }

        //If empty, Start new concat string; else append string within "[]" brackets
        if (stackString.length() > 0) {
          stackString = stackString.replace("[]", String.format("[%s]", itemString));
        } else {
          stackString = itemString;
        }
      }

      //Remove last appended empty brackets
      stackString = stackString.replace("[]", "");
      return stackString;
    }

    //Nothing to print
    return "No Shapes";
  }

  //If there are more than 1 of a type, then we need to represent with numbers
  private String itemStringRepresentaiton(int itemType, Shape item){
    if (shapeCount[itemType] > 1) {
      return getStackItemOrderString(item);
    } else {
      return item.toString();
    }
  }

  //Return the hashValue set at key->Item ID
  private String getStackItemOrderString(Shape shapeItem){
    return (String)initStackOrder.get(shapeItem.id);
  }

}
