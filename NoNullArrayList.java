import java.lang.IllegalArgumentException;
import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public boolean add(T element){
    if (element == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    else {
      return(super.add(element));
    }
  }
  public void add(int index, T element){
    if (element == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    else {
      super.add(index, element);
    }
  }
}