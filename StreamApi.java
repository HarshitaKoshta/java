
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(2,28,40,49,50);
        List<Integer> evnList = list.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(evnList);
        
    }
}
