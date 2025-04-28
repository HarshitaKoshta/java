public class AllPrime{
    static void prime(int a,int b){
        for (int i = 2; i < b; i++) {
            boolean isPrime = true;
            for(int j=2;j*j<i;j++){
                if(i%j==0){
                  isPrime = false;
                  break;
            }
        }
        if(isPrime){
        System.out.println("prime"+i);
    }
    }
}
   
    public static void main(String[] args) {
        prime(1, 100);
    }
}