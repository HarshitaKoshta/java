
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pihu");
        list.add("Tanu");
        list.add("pihu");
        list.add("shubh");

        ListIterator<String> it = list.listIterator();

        while(it.hasNext()){
            String data = it.next();
            System.out.println(data);
        }
        while(it.hasPrevious()){
            String preData = it.previous();
            System.out.println(preData);
        }
    }
}
