package shape;

public class Square extends Shape{

  public Square(int sideOne){
    sides = new int[]{sideOne};
    setArea();
  }

  private void setArea(){
    shapeArea = Math.pow(sides[0],2);
  }

  public double getArea() {
    return shapeArea;
  }

  public String toString(){
    return "S[]";
  }
}
