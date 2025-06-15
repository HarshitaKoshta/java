public class reverse {
    public static void main(String[] args) {
        String str = "12321";
        StringBuilder s = new StringBuilder(str);
        String reversed = s.reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not");
        }
    }
}