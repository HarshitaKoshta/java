

public class RevStr{
    public static void main(String[] args) {
        String name = "pihu";
        String rev = "";
       for (int i = name.length()-1; i >=0; i--) {
        rev += name.charAt(i);
       }
       System.err.println(rev);
    }
}

 