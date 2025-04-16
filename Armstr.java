public class Armstr{
    public static void main(String[] args) {
        int a = 370;
        int b = a;
        int s = 0;
        while(a>0){
            int n = a%10;
            s = s +(n*n*n);
            a = a/10;
        }
        if(b==s)
        System.out.println("armstrong");
        else
        System.out.println("not armstrong...");
    }
}