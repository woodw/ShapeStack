package shape;

public class Circle extends Shape{
  private int diameter;

  /**
   * Creates a new Circle based on two values
   * @param _diameter The diameter of the circle which is used to calculate shape area.
   */
  public Circle(int _diameter) {
    if(_diameter<=0){
      throw new IllegalArgumentException("diameter must be a positive integers");
    } else {
      diameter = _diameter;
      setArea();
    }
  }

  /*
  * Set Circle Area = PI*r^2
  * diameter = r*2
  * */
  private void setArea(){
    area = Math.PI*Math.pow((diameter/2),2);
  }

  @Override
  public String toString(){
    return "C[]";
  }

  public String getType(){return "Circle";}
}
