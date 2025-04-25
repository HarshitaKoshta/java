public class stringPractice{
    public static void main(String[] args) {
        String s ="hello";

       // System.out.println(s.length());

        StringBuilder str = new StringBuilder(10);
        str.append("hello hiiiiiiiiiiiiiiiii");
        //old*2+2
        System.out.println(str.length());
        System.out.println(str.capacity());
    }
}