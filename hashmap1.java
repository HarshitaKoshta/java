
import java.util.HashMap;

class hashmap1{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("id0",3);
        map.put("id1",3);
        map.put("id2",4);
        System.out.println(map.get("id1"));
        System.out.println(map.get("id"));
        
    }
}