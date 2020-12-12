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
  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    else {
      return(super.set(index, element));
    }
  }
  public NoNullArrayList() {
    new ArrayList();
  }
  public NoNullArrayList(int startingCapacity) {
    new ArrayList(startingCapacity);
  }
}
