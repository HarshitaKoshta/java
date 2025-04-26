
import java.util.Scanner;

public class mthdCalculator{

    static int add(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static double  div(int a,int b){
        return (double)a/b;
    }
    static double  mod(int a,int b){
        return (double)a%b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.1");
        int n1 = sc.nextInt();
        System.out.println("enter no.2");
        int n2 =sc.nextInt();
        System.out.println("choose the operator +,-,*,/,%");
        char op = sc.next().charAt(0);
        int resultInt;
        double resultDouble;

        switch (op) {
            case '+': resultInt = add(n1, n2);
            System.out.println("addition is"+resultInt);
            break;
            case '-': resultInt = sub(n1, n2);
            System.out.println("subtraction is"+resultInt);
            break;
            case '*': resultInt = mul(n1, n2);
            System.out.println("multiplication is"+resultInt);
            break;
            case '/': resultDouble = div(n1, n2);
            System.out.println("division is"+resultDouble);
            break;
            case '%': resultDouble = mod(n1, n2);
            System.out.println("modulus is"+resultDouble);
             break;
            default:
                System.out.println("enter valid operator");
        }
    }
}