
import java.util.TreeSet;

class TreeSet1{
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(5);
        set.add(3);
        set.add(6);
        System.out.println("set:"+set);
    }
}