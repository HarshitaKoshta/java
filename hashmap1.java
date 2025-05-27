
import java.util.HashMap;

class hashmap1{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("id0",3);
        map.put("id1",3);
        map.put("id2",4);
        map.put("id3",2);
        System.out.println(map.get("id1"));
        System.out.println(map.get("id"));
        System.out.println(map.containsKey("id0"));
        for(int key:map.values()){
            if(key>2)
               System.out.println(key);
        }
        map.forEach((key,value)->{
            if(key=="id0")
            System.out.println(key+ " "+value);
        });   
    }
}