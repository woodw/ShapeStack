package shape;

public class Rectangle extends Shape{
  private double shapeArea;
  private int sideX;
  private int sideY;

  public Rectangle(int sideOne, int sideTwo) {
    sideX = sideOne;
    sideY = sideTwo;
    setArea();
  }

  private void setArea(){
    shapeArea = sideX*sideY;
  }

  public double getArea() {
    return shapeArea;
  }

  public String toString(){
    return "R[]";
  }
}
