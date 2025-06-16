import java.util.HashMap;

public class Majority {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,2,3,3,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) {
              System.out.println(num);
            }
        }
    }
}

