import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
           List<String> list =Arrays.asList("Ram", "Shyam", "Om", "Sita");
         
           List<String> upper =list.stream().filter(a->a.length()>3).map(a->a.toUpperCase()).collect(Collectors.toList());
           System.out.println(upper);
    }
}
