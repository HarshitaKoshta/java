import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamApiGrea {
    public static void main(String[] args) {
         List<Integer> list =Arrays.asList(2,28,40,49,50);
         List<Integer> evnList = list.stream().filter(n->n%2==0).filter(n->n>2).collect(Collectors.toList()); 

         Optional<Integer> sum  = evnList.stream().reduce((a,b)->a+b);
         System.out.println(sum);
    }
}
