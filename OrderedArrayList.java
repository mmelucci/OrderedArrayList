public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  private int findIndex(T element) {
    if (this.size() == 0) {
      return 0;
    }
    for (int i = 0; i < this.size(); i ++) {
      if (this.get(i).compareTo(element) >= 0) {
        return i;
      }
    }
    return this.size()-1;
  }
  public boolean add(T element){
    int position = findIndex(element);
    super.add(position, element);
    return true;
  }
  public void add(int index, T element) {
    int position = findIndex(element);
    super.add(position, element);
  }
  public T set(int index, T element) {
    T removed = super.remove(index);
    add(element);
    return removed;
  }
}
