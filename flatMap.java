import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMap {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("Java is fun", "Streams are powerful");
        List<String> flat =  list.stream().flatMap(a->Arrays.stream(a.split(" "))).collect(Collectors.toList());
        System.out.println(flat);
    }
}
