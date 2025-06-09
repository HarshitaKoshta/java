import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordToLength {
    public static void main(String[] args) {
           List<String> list =Arrays.asList("java","python","cpp","javascript");
           List<Integer> count = list.stream().map(a->a.length()).collect(Collectors.toList());

           System.out.println(count);
    }
}
