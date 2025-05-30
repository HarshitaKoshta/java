
import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pihu");
        list.add("Tanu");
        list.add("pihu");
        list.add("shubh");
        list.add("hi");

        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            String data = it.next();
         if(data.length()<4){
             it.set("byee");
          }
        }
        System.out.println(list);
       /*  for (String str : list) {
            System.out.println(str); 
        }*/
        int count = 0;
        while(it.hasPrevious()){
           String prev = it.previous();
           count++;
           if(count != list.size()){
              it.set("hello");
        }
    }
 System.out.println(list);
}
}