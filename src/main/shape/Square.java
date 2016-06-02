package shape;

public class Square extends Shape{

  /**
   * Creates a new square based on one value.
   * @param sideOne One side value which is equal with all sides
   */
  public Square(int sideOne){
    if(sideOne<0){
      throw new IllegalArgumentException("length must be a positive integer");
    } else {
      sides = new int[]{sideOne};
      setArea();
    }
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
