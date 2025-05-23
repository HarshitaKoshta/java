import java.util.ArrayList;

class ArrList1{
    public static void main(String[] args) {
      ArrayList<String> arr = new ArrayList<>();
      arr.add("harshita");
      arr.add("vanshika");
      arr.add("astha");
      arr.add(0,"hello");
      arr.set(1,"j");
      arr.addFirst("pihu");
      arr.remove(1);
      System.out.println(arr.indexOf("vanshika"));
      String a = arr.get(3);
      System.out.println(a);
      System.out.println(arr);
     
    }
}