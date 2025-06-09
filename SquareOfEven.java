import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEven {
    public static void main(String[] args) {
           List<Integer> list =Arrays.asList(2,28,40,49,50);
        List<Integer> evn = list.stream().filter(a->a%2==0).map(n->n*n).collect(Collectors.toList());
        System.out.println(evn);
    }
}
