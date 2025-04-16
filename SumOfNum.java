public class SumOfNum{
    public static void main(String[] args) {
        int a = 123;
        int sum = 0;
        while(a>0){
            int n = a%10;
            sum +=n;
            a = a/10;
        }
        System.out.println(sum);
    }
}
