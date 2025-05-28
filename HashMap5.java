
import java.util.HashMap;

class HashMap5{
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        HashMap<Character ,Integer> map = new HashMap<>();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();  
       
        for(char c :a){
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        for (char c :b) {
            if (!map.containsKey(c)|| map.get(c) == 0 ) {
                System.out.println("Not anagram");
                return;
            }
            map.put(c, map.get(c) - 1);
        }
        System.out.println("string anagram");
    }
}