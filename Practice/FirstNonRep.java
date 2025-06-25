
import java.util.HashMap;

public class FirstNonRep {
    public static void main(String[] args) {
        String s = "loveleetcode";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                System.out.println("Index of first non-repeating character: " + i);
                return;
            }
        }

        System.out.println("-1 (No non-repeating character)");
    }
}
