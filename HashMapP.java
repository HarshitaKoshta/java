
import java.util.HashMap;
import java.util.Map;

class HashMapP{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("china", 130);
        map.put("us", 80);
        map.put("china", 180);
      for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
      }
    }
}