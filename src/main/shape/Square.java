package shape;

public class Square extends Rectangle{

  /**
   * Creates a new square based on one value.
   * Looks to superClass rectangle for methods and assignments.
   * @param sideOne One side value which is equal with all sides
   */
  public Square(int sideOne){
    super(sideOne,sideOne);
  }

  @Override
  public String toString(){
    return "S[]";
  }
}
