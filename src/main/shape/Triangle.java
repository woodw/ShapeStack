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
    if(sideTwoThree<=sideOne) {
      throw new IllegalArgumentException("hypotenuse needs to be greater than 1/2 the base: " + sideOne);
    } else
      if(sideOne<0 || sideTwoThree<0){
        throw new IllegalArgumentException("lengths must be positive integers");
      } else {
      sides = new int[]{sideOne, sideTwoThree};
      setArea();
    }
  }

  /*Solving an Isosceles Triangle
  * An Isosceles triangle can be solved just like a rectangle with length and width
  * width: 1/2 base of Isosceles triangle
  * length: given width and the hypotenuse (one of the two equal sides)
  *    solve: length = Math.Sqrt(hypotenuse^2 - width^2)
  * Area: length * width
  * */
  private void setArea(){
    double _sideA = sides[0]/2;
    double _sideC = sides[1];
    double _sideB = Math.sqrt(Math.pow(_sideC, 2)-Math.pow(_sideA, 2));
    shapeArea = _sideA*_sideB;
  }

  public double getArea() {
    return shapeArea;
  }

  public String toString(){
    return "T[]";
  }
}
