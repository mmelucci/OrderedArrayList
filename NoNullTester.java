public class NoNullTester{
  public static void main(String[]args){

    NoNullArrayList<int[]> list = new  NoNullArrayList<int[]>();
    int[] array0 = null;
    int[] array1 = {1};
    int[] array2 = {1, 2};
    int[] array3 = {1, 2, 3};

    System.out.println(list.add(array1));
    System.out.println(list.add(array2));
    System.out.println(list.add(array3));
    // Holder<String> name = new Holder<String>();
    // name.value = "Whoa!";
    //
    // Holder<Integer> data = new Holder<Integer>();
    // data.value = 5;
    //
    // System.out.println(name.value+" "+data.value);
    System.out.println(list.add(array0));
  }
}
