
import java.util.Scanner;

public class SwapPairOf2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number for swaping the pair of two:");
       int num = sc.nextInt();
        String s = String.valueOf(num);

        if(s.length()%2!=0){
            System.out.println("The length of entered number is odd...adding 0 at the begnning");
            s = "0" + s;
            System.out.println("Number becomes:"+s);
        }
        String[] pairs = new String[s.length()/2];
        for(int i=0; i<s.length();i+=2){
            pairs[i/2] = s.substring(i,i+2);
        }
        for(int i=0; i+1<pairs.length;i+=2){
            String temp = pairs[i];
            pairs[i] = pairs[i + 1];
            pairs[i + 1] = temp;
        }
        StringBuilder result = new StringBuilder();
        for (String pair : pairs) {
            result.append(pair);
        }
        System.out.println("After swapping number is:"+result);
    }
}
