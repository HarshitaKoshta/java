 import java.util.Scanner;
public class Print 
{
    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number(1-7)");
        int a = sc.nextInt();

        switch(a){
            case 1: System.out.println("one");break;
            case 2: System.out.println("two");break;
            case 3: System.out.println("three");break;
            case 4: System.out.println("four");break;
            case 5: System.out.println("five");break;
            case 6: System.out.println("Six");break;
            case 7: System.out.println("Seven");break;
            default: System.out.println("Enter valid number(1-7)");
        }
    }
}