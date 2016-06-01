package shape;

import java.lang.annotation.Documented;

/**
 * Created by billwood on 6/1/16.
 */
public class Triangle extends Shape{

  /**
   * Creates a new triangle based on two values
   * @param sideOne The base of our Isoceles triangle
   * @param sideTwoThree the identical left and right sides of our Isoceles triangle
   */
  public Triangle(int sideOne, int sideTwoThree) {
    sides = new int[]{sideOne, sideTwoThree};
    setArea();
  }

  /*Triangles area can be determined by Area = 1/2 (sideA)(height)
  *height of an isoceles triangle Math.sqrt( (b^2) - (1/4) (a^2) )
  *put it together and we have (1/2)(a^2)(Math.sqrt((b^2/a^2) - (1/4)))*/
  private void setArea(){
    shapeArea = (.5)*Math.pow(sides[0],2)*Math.sqrt(((Math.pow(sides[1],2))/(Math.pow(sides[0],2)))-(.25));
  }

  public double getArea() {
    return shapeArea;
  }

  public String toString(){
    return "T[]";
  }
}
