package shape;

/**
 * Created by billwood on 6/1/16.
 * Abstract Class that will superClass my shapes.
 */

public abstract class Shape implements Comparable<Shape>{
  //re-used variable for sub-classes
  protected double shapeArea;
  protected int[] sides;

  public int compareTo(Shape s){
    if(getArea()==s.getArea()){
      return 0;
    }
    else{
      return (getArea()<s.getArea())?1:-1;
    }
  }

  protected abstract double getArea();

  public abstract String toString();
}
