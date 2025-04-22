
public class PalinString{
    public static void main(String[] args) {
        String s = "ada";

        for (int i =0; i < s.length(); i++) {
            for (int j = s.length()-1; j >=0 ; j--) {
              if(s.charAt(i)!=s.charAt(j))
                System.out.println("palindome");
                return;
        }
    }
    System.out.println("not palindrome");
    }
}