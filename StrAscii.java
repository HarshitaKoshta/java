public class StrAscii {

    public static void main(String[] args) {
        String str = "ABC";
        int sum = 0;

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            sum += (int) ch[i]; 
        }

        System.out.println("Total ASCII value: " + sum);
    }
}
