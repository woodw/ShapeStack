package shape;

import java.lang.annotation.Documented;

/**
 * Created by billwood on 6/1/16.
 */
public class Triangle extends Shape{
  private int base;
  private int identicalSides;

  /**
   * Creates a new triangle based on two values
   * @param newBase The base of our Isoceles triangle
   * @param newIdenticalSides the identical left and right sides of our Isoceles triangle
   */
  public Triangle(int newBase, int newIdenticalSides) {
    if(newIdenticalSides<=(newBase/2)) {
      throw new IllegalArgumentException("hypotenuse needs to be greater than 1/2 the base: " + newBase);
    } else
      if(newBase<=0){
        throw new IllegalArgumentException("lengths must be positive integers");
      } else {
        base = newBase;
        identicalSides = newIdenticalSides;
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
    double _sideA = base/2;
    double _sideC = identicalSides;
    double _sideB = Math.sqrt(Math.pow(_sideC, 2)-Math.pow(_sideA, 2));
    area = _sideA*_sideB;
  }

  @Override
  public String toString(){
    return "T[]";
  }

  public String getType(){return "Triangle";}
}
