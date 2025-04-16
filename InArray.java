
import java.util.Scanner;

public class InArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for(int i = 0 ;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int k=0 ;k<n;k++)
        {
            System.out.println(arr[k]);
        }

    }
}