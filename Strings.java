public class Strings{
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
    for (int i = 0; i < str.length(); i++) {
      System.out.println(str.charAt(i));
    }

    for (int i = str.length()-1; i >=0 ; i--) {
      System.out.println(str.charAt(i));
    }

    }
}