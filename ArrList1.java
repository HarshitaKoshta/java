import java.util.ArrayList;
import java.util.Collections;

class ArrList1{
    public static void main(String[] args) {
      ArrayList<String> arr = new ArrayList<>();
      arr.add("Harshita");
      arr.add("tanu");
      arr.add("shubh");
      arr.add(0,"hello");
      arr.set(1,"j");
      arr.addFirst("pihu");

      Collections.sort(arr);
      System.out.println(arr);
    /*  arr.remove(1);
      System.out.println(arr.indexOf("vanshika"));
      String a = arr.get(3);
      System.out.println(a);
      System.out.println(arr);

      for (int i = 0; i < arr.size(); i++) {
          System.out.println(arr.get(i));
      }*/
     
    }
}