public class TrailingZero{
    public static void main(String[] args) {
        int n = 10;
        double fac =1;
        int count = 0;

        for(int i =1 ;i<=n;i++){
            fac *= i;
        }
        while(fac>0){
            double k = fac%10;
            if(k==0){
                count++;
            } 
            fac = fac/10;
        }
        System.out.println(count);
    }
}