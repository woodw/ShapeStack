package shape;

public class Rectangle extends Shape{

  public Rectangle(int sideOne, int sideTwo) {
    sides = new int[]{sideOne, sideTwo};
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
