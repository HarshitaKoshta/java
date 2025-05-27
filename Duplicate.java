
import java.util.HashSet;

class Duplicate{
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,42,67,46,1};
        HashSet<Integer> set = new HashSet<>();
       for (int i = 0; i < arr.length; i++) {
          set.add(arr[i]);
       }
       System.out.println(set);
    }
}