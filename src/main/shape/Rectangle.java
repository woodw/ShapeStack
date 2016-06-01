package shape;

public class Rectangle {
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
}