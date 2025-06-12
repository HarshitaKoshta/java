
import java.util.HashMap;

public class AnagramMap {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "lisent";

        HashMap<Character,Integer> map = new HashMap<>();

        if(s1.length()!=s2.length()){
            System.out.println("not anagram");
        }

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        for(char c:a){
           map.put(c,map.getOrDefault(c, 0)+1);
        }
        for(char c:b){
            if (!map.containsKey(c)|| map.get(c) == 0 ) {
                System.out.println("Not anagram");
                return;
            }
            map.put(c, map.get(c) - 1);
         } 
        System.out.println("anagram");
    }
}
