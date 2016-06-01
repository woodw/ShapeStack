package shape;

public class Rectangle extends Shape{

  /**
   * Creates a new rectangle based on two values
   * @param length The length of the rectangle equal on two sides.
   * @param width The width of the rectangle equal on two sides.
   */
  public Rectangle(int length, int width) {
    sides = new int[]{length, width};
    setArea();
  }

  private void setArea(){
    shapeArea = sides[0]*sides[1];
  }

  public double getArea() {
    return shapeArea;
  }

  public String toString(){
    return "R[]";
  }
}
