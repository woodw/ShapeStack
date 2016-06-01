package shape;

public class Square extends Shape{
  private double shapeArea;
  private int equiSide;

  public Square(int sideOne){
    equiSide = sideOne;
    setArea();
  }

  private void setArea(){
    shapeArea = Math.pow(equiSide,2);
  }

  public double getArea() {
    return shapeArea;
  }

  public String toString(){
    return "S[]";
  }
}
