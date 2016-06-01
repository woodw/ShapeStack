package shape;

import java.lang.annotation.Documented;

/**
 * Created by billwood on 6/1/16.
 */
public class Triangle extends Shape{
  private double shapeArea;
  private int sideA;
  private int sideBC;

  public Triangle(int sideOne, int sideTwoThree) {
    sideA = sideOne;
    sideBC = sideTwoThree;
    setArea();
  }

  /*Triangles area can be determined by Area = 1/2 (sideA)(height)
  *height of an isoceles triangle Math.sqrt( (b^2) - (1/4) (a^2) )
  *put it together and we have (1/2)(a^2)(Math.sqrt((b^2/a^2) - (1/4)))*/
  private void setArea(){
    shapeArea = (.5)*Math.pow(sideA,2)*Math.sqrt(((Math.pow(sideBC,2))/(Math.pow(sideA,2)))-(.25));
  }

  public double getArea() {
    return shapeArea;
  }

  public String toString(){
    return "T[]";
  }
}
