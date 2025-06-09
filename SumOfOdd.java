import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfOdd {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(2,21,40,49,50);
        Optional <Integer> oddSum = list.stream().filter(a->a%2!=0).reduce((a,b)->a+b);
        System.out.println(oddSum);
    }
}
