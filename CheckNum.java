//question 2
import java.util.Scanner;

public class CheckNum{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("number is positive");
        }
        else if(a==0){
            System.out.println("number is zero");
        }
        else 
         System.out.println("number is negitive");
    }
}