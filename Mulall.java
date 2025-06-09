import java.util.Arrays;
import java.util.List;

public class Mulall {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(2,21,40,49,50);
        Integer mul = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mul);
    }
}
