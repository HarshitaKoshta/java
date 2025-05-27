
import java.util.HashSet;

class HashSet1{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(5);
        set.add(3);
        set.add(6);
        System.out.println("set:"+set);
    }
}