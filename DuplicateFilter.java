// From a list of prices, remove duplicates, filter prices above 1000, and return total sum

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DuplicateFilter {
    public static void main(String[] args) {
        
    List<Integer> list =Arrays.asList(500,6000,1100,4000,1100);
    Optional <Integer> sum = list.stream().distinct().filter(a->a>1000).reduce((a,b)->a+b);   
    System.out.println(sum);
    }
}
