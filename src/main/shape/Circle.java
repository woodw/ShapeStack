package shape;

public class Circle extends Shape{
  private double shapeArea;
  private int diameter;

  public Circle(int _diameter) {
    diameter = _diameter;
    setArea();
  }

  /*
  * Set Circle Area = PI*r^2
  * diameter = r*2
  * */
  private void setArea(){
    shapeArea = Math.PI*Math.pow((diameter/2),2);
  }

  public double getArea() {
    return shapeArea;
  }

  public String toString(){
    return "C[]";
  }
}
