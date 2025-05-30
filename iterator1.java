
import java.util.ArrayList;
import java.util.Iterator;


public class iterator1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pihu");
        list.add("Tanu");
        list.add("pihu");
        list.add("shubh");
        System.out.println(list);
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
          String data = it.next();
          if(data.startsWith("P")){
            it.remove();
          }
        }
        System.out.println(list);
    }
}
