
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listek";

        HashMap<Character,Integer> map = new HashMap<>();
        for(char a:s1.toCharArray()){
            map.put(a,map.getOrDefault(a, 0)+1);
        }
      for(char c:s2.toCharArray()){
            if (!map.containsKey(c)|| map.get(c) == 0 ) {
                System.out.println("Not anagram");
                return;
            }
            map.put(c, map.get(c) - 1);
         } 
        System.out.println("anagram");
    
    }
}
