public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public boolean add(T element){
    int position = findIndex(element);
    super.add(position, element);
    return true;
  }
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
}
