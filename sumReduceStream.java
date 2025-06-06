import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class sumReduceStream {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(2,28,40,49,50);
     //   Optional<Integer> sum = list.stream().reduce((a,b)->a+b);
       int  Tsum = list.stream().reduce(10,(a,b)->a+b);

        System.out.println(Tsum);
    }
}
