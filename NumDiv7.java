import java.util.Arrays;
import java.util.List;

public class NumDiv7 {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(4,49,19,14);
        boolean div = list.stream().anyMatch(a->a%7==0);
        System.out.println(div);
    }
}
