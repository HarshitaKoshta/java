public class Fabonacci{
    public static void main(String[] args) {
     
        int n = 10;
        int a= 0;
        int b =1;
        System.out.println("a");
        for(int i =0; i<=n;i++)
        {
             System.out.println(a);
            int nxt = a+b;
            a=b;
            b = nxt;
        }
    }
}
