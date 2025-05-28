
import java.util.HashMap;

class HashMap3{
    public static void main(String[] args) {
        String str = "programming is a fun and fun is a programming";

        HashMap<String ,Integer> map = new HashMap<>();

       String[] newS = str.split(" ");
     for(String s:newS){
       map.put(s,map.getOrDefault(s, 0)+1);
     }
     System.out.println(map);
    }
}