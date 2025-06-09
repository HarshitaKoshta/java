import java.util.Arrays;
import java.util.List;

public class StartA {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("java","python","apple","javascript","Avagodo");
        int countt = (int) list.stream().map(a->a.toLowerCase()).filter(a->a.charAt(0)=='a').count();
        System.out.println(countt);
    }
}
