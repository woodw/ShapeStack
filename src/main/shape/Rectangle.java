package shape;

public class Rectangle extends Shape{
  private int length;
  private int width;

  /**
   * Creates a new rectangle based on two values
   * @param newLength The new length of the rectangle equal on two sides.
   * @param newWidth The new width of the rectangle equal on two sides.
   */
  public Rectangle(int newLength, int newWidth) {
    if(newLength<=0 || newWidth<=0){
      throw new IllegalArgumentException("length and width must be positive integers");
    } else {
      length = newLength;
      width = newWidth;
      setArea();
    }
  }

  private void setArea(){
    area = length*width;
  }

  public double getArea() {
    return area;
  }

  public String toString(){
    return "R[]";
  }
}
