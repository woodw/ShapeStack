package shape;

/**
 * Created by billwood on 6/1/16.
 * Abstract Class that will superClass my shapes.
 * @var id: This is a stored ObjectId on construct unique per shape
 * @var area: this variable will store the calulated area based on shape parameters and type
 */
public abstract class Shape implements Comparable<Shape>{
  //re-used variable for sub-classes
  protected double area;
  public final int id = this.hashCode();

  public int compareTo(Shape s){
    if(getArea()==s.getArea()){
      return 0;
    }
    else{
      return (getArea()<s.getArea())?1:-1;
    }
  }

  public double getArea() {
    return area;
  }

  public abstract String toString();

  public abstract String getType();
}
