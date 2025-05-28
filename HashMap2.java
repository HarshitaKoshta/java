
import java.util.HashMap;

class HashMap2{
    public static void main(String[] args) {
        String s  ="programming";
        HashMap<Character,Integer> map = new HashMap<>();
        char[] a =s.toCharArray();

        for(char c:a){
           map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}