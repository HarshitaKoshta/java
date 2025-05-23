
import java.util.Scanner;

class errorHandle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string"); 
       
        try {
             String s = sc.next();
        System.out.println(s.toUpperCase());
          if(s == null){
             System.out.println("input string is null");
          }
        } catch (Exception e) {
            System.out.println(e);
        }
System.out.println("string ");
    }
}