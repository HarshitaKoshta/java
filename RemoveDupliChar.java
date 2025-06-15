
import java.util.HashSet;

public class RemoveDupliChar {
    public static void main(String[] args) {
        String s = "piiiihhhuuuur";
        StringBuilder res = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for(char a : s.toCharArray()){
            if(set.add(a)){
                res.append(a);
            }
        }
        System.out.println(res);
    }
}
