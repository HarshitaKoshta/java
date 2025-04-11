
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        System.out.println("enter operator(+,-,*,/,%)");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+' : System.out.println(a+b);break;
            case '-' : System.out.println(a-b);break;
            case '*' : System.out.println(a*b);break;
            case '/' : System.out.println(a/b);break;
            case '%' : System.out.println(a%b);break;
            default: System.out.println("enter valid operator");
    }
}
}