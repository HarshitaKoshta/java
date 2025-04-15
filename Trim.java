public class Trim{
    public static void main(String[] args) {
        String a = "hey I am...";
        String b = a.replaceAll("\\s","");
        System.out.println(b);
    }
}